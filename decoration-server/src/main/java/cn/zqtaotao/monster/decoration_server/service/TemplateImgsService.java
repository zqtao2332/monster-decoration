package cn.zqtaotao.monster.decoration_server.service;

import cn.zqtaotao.monster.decoration_server.model.entity.TemplateImgsEntity;

import java.util.List;

public interface TemplateImgsService {
    /**
     * 获取所有的工程模板图片
     *
     * @return List<TemplateImgsEntity>
     */
    List<TemplateImgsEntity> getAll();

    /**
     * 插入新工程模板图片
     *
     * @param templateImgsEntity 工程模板图片实体
     */
    void addTemplateImgs(TemplateImgsEntity templateImgsEntity);

    /**
     * 更新工程模板图片
     *
     * @param templateImgsEntity 工程模板图片实体
     * @return int
     */
    int modifyTemplateImgs(TemplateImgsEntity templateImgsEntity);

    /**
     * 根据id 删除工程模板图片
     *
     * @param templateImgsId id
     * @return int
     */
    int removeTemplateImgsById(String templateImgsId);
}
