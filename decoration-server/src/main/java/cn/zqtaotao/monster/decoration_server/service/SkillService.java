package cn.zqtaotao.monster.decoration_server.service;

import cn.zqtaotao.monster.decoration_server.model.entity.SkillEntity;

import java.util.List;

public interface SkillService {
    /**
     * 获取所有的技术
     *
     * @return List<SkillEntity>
     */
    List<SkillEntity> getAll();

    /**
     * 插入新技术
     *
     * @param skillEntity 技术实体
     */
    void addSkill(SkillEntity skillEntity);

    /**
     * 更新技术
     *
     * @param skillEntity 技术实体
     * @return int
     */
    int modifySkill(SkillEntity skillEntity);

    /**
     * 根据id 删除技术
     *
     * @param skillId id
     * @return int
     */
    int removeSkillById(String skillId);
}
