package cn.zqtaotao.monster.decoration_server.service;

import cn.zqtaotao.monster.decoration_server.model.entity.WorkerEntity;

import java.util.List;

public interface WorkerService {

    /**
     * 获取所有的工人
     * @return List<WorkerEntity>
     */
    List<WorkerEntity> getAll();

    /**
     * 插入新工人
     * @param entity 工人实体
     */
    void addWorker(WorkerEntity workerEntity);

    /**
     * 更新工人
     * @param entity 工人实体
     * @return int
     */
    int modifyWork(WorkerEntity workerEntity);

    /**
     * 根据id 删除工人
     * @param id id
     * @return int
     */
    int removeWorkById(String id);
    
}
