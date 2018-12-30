package cn.zqtaotao.monster.decoration_server.service;

import cn.zqtaotao.monster.decoration_server.model.entity.TemplateEntity;

import java.util.List;

public interface TemplateService {
    /**
     * 获取所有的工程模板
     *
     * @return List<TemplateEntity>
     */
    List<TemplateEntity> getAll();

    /**
     * 插入新工程模板
     *
     * @param templateEntity 工程模板实体
     */
    void addTemplate(TemplateEntity templateEntity);

    /**
     * 更新工程模板
     *
     * @param templateEntity 工程模板实体
     * @return int
     */
    int modifyTemplate(TemplateEntity templateEntity);

    /**
     * 根据id 删除工程模板
     *
     * @param templateId id
     * @return int
     */
    int removeTemplateById(String templateId);
}
