package cn.zqtaotao.monster.decoration_server.service;

import cn.zqtaotao.monster.decoration_server.model.entity.WorkerCategoryEntity;

import java.util.List;

public interface WorkerCategoryService {

    /**
     * 获取所有的工人类别
     * @return List<WorkerCategoryEntity>
     */
    List<WorkerCategoryEntity> getAll();

    /**
     * 插入新工人类别
     * @param entity 工人类别实体
     */
    void addWorkerCategory(WorkerCategoryEntity workerCategoryEntity);

    /**
     * 更新工人类别
     * @param entity 工人类别实体
     * @return int
     */
    int modifyWorkCategory(WorkerCategoryEntity workerCategoryEntity);

    /**
     * 根据类别id 删除工人类别
     * @param id 类别id
     * @return int
     */
    int removeWorkCategoryById(String id);
}
