package cn.zqtaotao.monster.decoration_server.service.impl;

import cn.hutool.core.date.DateTime;
import cn.zqtaotao.monster.decoration_server.mapper.SkillCategoryMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.SkillCategoryEntity;
import cn.zqtaotao.monster.decoration_server.service.SkillCategoryService;
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
public class SkillCategoryServiceImpl implements SkillCategoryService {

    private final SkillCategoryMapper mapper;

    @Autowired
    public SkillCategoryServiceImpl(SkillCategoryMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<SkillCategoryEntity> getAll() {
        return mapper.queryAll();
    }

    @Override
    public int addSkillCategory(SkillCategoryEntity skillCategoryEntity) {
        log.info("service addSkillCategory");
        SkillCategoryEntity dbentity = mapper.queryByCategoryName(skillCategoryEntity.getSkillCategoryName());

        if (dbentity != null && dbentity.getSkillCategoryId() != null) return 0;
        skillCategoryEntity.setSkillCategoryId(CommonUtils.getUUid32());
        DateTime now = DateTime.now();
        skillCategoryEntity.setCreateTime(now);
        skillCategoryEntity.setLastEditTime(now);

        return mapper.insertSkillCategory(skillCategoryEntity);
    }

    @Override
    public int modifySkillCategory(SkillCategoryEntity skillCategoryEntity) {
        log.info("service modifySkillCategory");
        SkillCategoryEntity dbentity = mapper.queryByCategoryName(skillCategoryEntity.getSkillCategoryName());

        if (dbentity != null && dbentity.getSkillCategoryId() != null){
            return mapper.updateSkillCategory(skillCategoryEntity);
        }
        return 0;
    }

    @Override
    public int removeSkillCategoryById(String skillCategoryId) {
        log.info("service removeSkillCategoryById");
        if (skillCategoryId == null || "".equals(skillCategoryId)) return 0;

        SkillCategoryEntity dbentity = mapper.queryByCategoryName(skillCategoryId);
        if (dbentity != null){
            return mapper.deleteSkillCategoryById(skillCategoryId);
        }
        return 0;
    }
}
