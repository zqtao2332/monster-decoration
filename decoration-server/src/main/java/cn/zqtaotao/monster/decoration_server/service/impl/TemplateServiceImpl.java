package cn.zqtaotao.monster.decoration_server.service.impl;

import cn.hutool.core.date.DateTime;
import cn.zqtaotao.monster.decoration_server.mapper.TemplateMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.TemplateEntity;
import cn.zqtaotao.monster.decoration_server.service.TemplateService;
import cn.zqtaotao.monster.decoration_server.util.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @auther: zqtao
 * @description:
 * @version: 1.0
 */
@Service
@Transactional
@Slf4j
public class TemplateServiceImpl implements TemplateService {

    private final TemplateMapper mapper;

    @Autowired
    public TemplateServiceImpl(TemplateMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<TemplateEntity> getAll() {
        return mapper.queryAll();
    }

    @Override
    public int addTemplate(TemplateEntity templateEntity) {
        log.info("service addTemplate");
        TemplateEntity dbentity = mapper.queryByTemplateName(templateEntity.getTemplateName());

        if (dbentity != null && dbentity.getTemplateId() != null) return 0;
        templateEntity.setTemplateId(CommonUtils.getUUid32());
        DateTime now = DateTime.now();
        templateEntity.setCreateTime(now);
        templateEntity.setLastEditTime(now);
        return mapper.insertTemplate(templateEntity);
    }

    @Override
    public int modifyTemplate(TemplateEntity templateEntity) {
        log.info("service modifyTemplate");
        TemplateEntity dbentity = mapper.queryByTemplateName(templateEntity.getTemplateName());

        if (dbentity != null && dbentity.getTemplateName() != null){
            return mapper.updateTemplate(templateEntity);
        }
        return 0;
    }

    @Override
    public int removeTemplateById(String templateId) {
        log.info("service removeTemplateById");
        if (templateId == null || "".equals(templateId)) return 0;

        TemplateEntity dbentity = mapper.queryByTemplateName(templateId);
        if (dbentity != null){
            return mapper.deleteTemplateById(templateId);
        }
        return 0;
    }
}
