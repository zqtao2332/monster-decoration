package cn.zqtaotao.monster.decoration_server.mapper;

import cn.zqtaotao.monster.decoration_server.mapper.annotation.MybatisMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.TemplateImgsEntity;

import java.util.List;

@MybatisMapper
public interface TemplateImgsMapper {

    /**
     * 获取所有工程模板样例图片
     * @return List<TemplateImgsEntity>
     */
    List<TemplateImgsEntity> queryAll();

    /**
     * 根据工程模板样例图片名   查询工程模板样例图片
     * @return TemplateImgsEntity
     */
    TemplateImgsEntity queryByCategoryName(String name);

    /**
     * 根据id 查询工程模板样例图片
     * @return TemplateImgsEntity
     */
    TemplateImgsEntity queryByCategoryId(String id);


    /**
     * 插入新工程模板样例图片
     * @param entity 工程模板样例图片实体
     */
    void insertTemplateImgs(TemplateImgsEntity entity);

    /**
     * 更新工程模板样例图片
     * @param entity 工程模板样例图片实体
     */
    int updateTemplateImgs(TemplateImgsEntity entity);

    /**
     * 根据id 删除工程模板样例图片
     * @param id 工程模板样例图片 id
     */
    int deleteTemplateImgsById(String id);
}
