package cn.zqtaotao.monster.decoration_server.mapper;

import cn.zqtaotao.monster.decoration_server.mapper.annotation.MybatisMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.SkillEntity;

import java.util.List;

@MybatisMapper
public interface SkillMapper {

    /**
     * 获取所有的技术信息
     * @return List<SkillEntity>
     */
    List<SkillEntity> queryAll();

    /**
     * 根据技术名查询技术信息
     * @return SkillEntity
     */
    SkillEntity queryByName(String skillName);

    /**
     * 根据技术 id 查询技术信息
     * @return SkillEntity
     */
    SkillEntity queryById(String skillId);


    /**
     * 插入新技术
     * @param entity 技术类实体
     */
    void insertSkill(SkillEntity entity);

    /**
     * 更新技术
     * @param entity 技术类实体
     * @return 影响行数
     */
    int updateSkill(SkillEntity entity);

    /**
     * 根据id 删除技术信息
     * @param id 技术 id
     * @return 影响行数
     */
    int deleteSkillById(String id);
}
