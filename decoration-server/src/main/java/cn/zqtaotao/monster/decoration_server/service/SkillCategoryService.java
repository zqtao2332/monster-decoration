package cn.zqtaotao.monster.decoration_server.service;

import cn.zqtaotao.monster.decoration_server.model.entity.SkillCategoryEntity;

import java.util.List;

public interface SkillCategoryService {
    /**
     * 获取所有的工人类别
     * @return List<WorkerCategoryEntity>
     */
    List<SkillCategoryEntity> getAll();

    /**
     * 插入新工人类别
     * @param skillCategoryEntity 工人类别实体
     */
    int addSkillCategory(SkillCategoryEntity skillCategoryEntity);

    /**
     * 更新工人类别
     * @param skillCategoryEntity 工人类别实体
     * @return int
     */
    int modifySkillCategory(SkillCategoryEntity skillCategoryEntity);

    /**
     * 根据类别id 删除工人类别
     * @param skillCategoryId 类别id
     * @return int
     */
    int removeSkillCategoryById(String skillCategoryId);
}
