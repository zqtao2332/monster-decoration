package cn.zqtaotao.monster.decoration_server.service.impl;

import cn.zqtaotao.monster.decoration_server.mapper.SkillCategoryMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.SkillCategoryEntity;
import cn.zqtaotao.monster.decoration_server.service.SkillCategoryService;
import cn.zqtaotao.monster.decoration_server.util.CommonUtils;
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
public class SkillCategoryServiceImpl implements SkillCategoryService {

    @Autowired
    SkillCategoryMapper mapper;

    @Override
    public List<SkillCategoryEntity> getAll() {
        return mapper.queryAll();
    }

    @Override
    public void addSkillCategory(SkillCategoryEntity skillCategoryEntity) {
        SkillCategoryEntity dbentity = mapper.queryByCategoryName(skillCategoryEntity.getSkillCategoryName());

        if (dbentity != null && dbentity.getSkillCategoryId() != null) {
            skillCategoryEntity.setSkillCategoryName(CommonUtils.getUUid32());
            mapper.insertSkillCategory(skillCategoryEntity);
        }
    }

    @Override
    public int modifySkillCategory(SkillCategoryEntity skillCategoryEntity) {
        SkillCategoryEntity dbentity = mapper.queryByCategoryName(skillCategoryEntity.getSkillCategoryName());

        if (dbentity != null && dbentity.getSkillCategoryId() != null){
            return mapper.updateSkillCategory(skillCategoryEntity);
        }
        return 0;
    }

    @Override
    public int removeSkillCategoryById(String skillCategoryId) {
        if (skillCategoryId == null || "".equals(skillCategoryId)) return 0;

        SkillCategoryEntity dbentity = mapper.queryByCategoryName(skillCategoryId);
        if (dbentity != null){
            return mapper.deleteSkillCategoryById(skillCategoryId);
        }
        return 0;
    }
}
