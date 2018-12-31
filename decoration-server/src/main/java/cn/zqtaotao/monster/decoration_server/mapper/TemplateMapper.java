package cn.zqtaotao.monster.decoration_server.mapper;


import cn.zqtaotao.monster.decoration_server.mapper.annotation.MybatisMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.TemplateEntity;

import java.util.List;

@MybatisMapper
public interface TemplateMapper {

    /**
     * 获取所有工程模板样例
     * @return List<TemplateEntity>
     */
    List<TemplateEntity> queryAll();

    /**
     * 根据工程模板样例名   查询工程模板样例
     * @return TemplateEntity
     */
    TemplateEntity queryByTemplateName(String name);

    /**
     * 根据id 查询工程模板样例
     * @return TemplateEntity
     */
    TemplateEntity queryByCategoryId(String id);


    /**
     * 插入新工程模板样例
     * @param entity 工程模板样例实体
     */
    int insertTemplate(TemplateEntity entity);

    /**
     * 更新工程模板样例
     * @param entity 工程模板样例实体
     */
    int updateTemplate(TemplateEntity entity);

    /**
     * 根据id 删除工程模板样例
     * @param id 工程模板样例 id
     */
    int deleteTemplateById(String id);
}
