package cn.zqtaotao.monster.decoration_server.mapper;

import cn.zqtaotao.monster.decoration_server.mapper.annotation.MybatisMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.WorkerEntity;

import java.util.List;

/**
 * @auther: zqtao
 * @description:
 * @version: 1.0
 */
@MybatisMapper
public interface WorkerMapper {

    /**
     * 获取所有的工人
     * @return List<WorkerEntity>
     */
    List<WorkerEntity> queryAll();

    /**
     * 根据工人名查询工人信息
     * @return WorkerEntity
     */
    WorkerEntity queryByName(String workerName);

    /**
     * 根据工人 id 查询工人信息
     * @return WorkerEntity
     */
    WorkerEntity queryById(String workerId);

    /**
     * 插入新工人
     * @param entity 工人实体
     */
    void insertWorker(WorkerEntity entity);

    /**
     * 更新工人
     * @param entity 工人实体
     * @return 影响行数
     */
    int updateWorker(WorkerEntity entity);

    /**
     * 根据id 删除工人
     * @param id 工人 id
     * @return 影响行数
     */
    int deleteWorkerById(String id);



}
