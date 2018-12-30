package cn.zqtaotao.monster.decoration_server.service.impl;

import cn.zqtaotao.monster.decoration_server.mapper.TemplateMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.TemplateEntity;
import cn.zqtaotao.monster.decoration_server.service.TemplateService;
import cn.zqtaotao.monster.decoration_server.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @auther: zqtao
 * @description:
 * @version: 1.0
 */
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
    public void addTemplate(TemplateEntity skillEntity) {
        TemplateEntity dbentity = mapper.queryByCategoryName(skillEntity.getTemplateName());

        if (dbentity != null && dbentity.getTemplateId() != null) {
            skillEntity.setTemplateName(CommonUtils.getUUid32());
            mapper.insertTemplate(skillEntity);
        }
    }

    @Override
    public int modifyTemplate(TemplateEntity skillEntity) {
        TemplateEntity dbentity = mapper.queryByCategoryName(skillEntity.getTemplateName());

        if (dbentity != null && dbentity.getTemplateName() != null){
            return mapper.updateTemplate(skillEntity);
        }
        return 0;
    }

    @Override
    public int removeTemplateById(String skillId) {
        if (skillId == null || "".equals(skillId)) return 0;

        TemplateEntity dbentity = mapper.queryByCategoryName(skillId);
        if (dbentity != null){
            return mapper.deleteTemplateById(skillId);
        }
        return 0;
    }
}
