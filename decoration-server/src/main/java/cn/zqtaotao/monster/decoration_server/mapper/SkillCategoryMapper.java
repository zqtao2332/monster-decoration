package cn.zqtaotao.monster.decoration_server.mapper;

import cn.zqtaotao.monster.decoration_server.mapper.annotation.MybatisMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.SkillCategoryEntity;

import java.util.List;

/**
 * @auther: zqtao
 * @description:
 * @version: 1.0
 */
@MybatisMapper
public interface SkillCategoryMapper {

    /**
     * 获取所有技术类别
     * @return List<SkillCategoryEntity>
     */
    List<SkillCategoryEntity> queryAll();

    /**
     * 根据类别名查询技术类别信息
     * @return SkillCategoryEntity
     */
    SkillCategoryEntity queryByCategoryName(String name);

    /**
     * 根据类别 id 查询技术类别信息
     * @return SkillCategoryEntity
     */
    SkillCategoryEntity queryByCategoryId(String id);


    /**
     * 插入新技术类别
     * @param entity 技术类别实体
     */
    int insertSkillCategory(SkillCategoryEntity entity);

    /**
     * 更新技术类别
     * @param entity 技术类别实体
     */
    int updateSkillCategory(SkillCategoryEntity entity);

    /**
     * 根据类别id 删除技术类别
     * @param id 技术类别 id
     */
    int deleteSkillCategoryById(String id);
    
}
