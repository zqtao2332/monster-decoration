package cn.zqtaotao.monster.decoration_server.mapper;

import cn.zqtaotao.monster.decoration_server.mapper.annotation.MybatisMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.WorkerCategoryEntity;

import java.util.List;

/**
 * @auther: zqtao
 * @description:
 * @version: 1.0
 */
@MybatisMapper
public interface WorkerCategoryMapper {

    /**
     * 获取所有的工人类别
     * @return List<WorkerCategoryEntity>
     */
    List<WorkerCategoryEntity> queryAll();

    /**
     * 根据类别名查询工人类别信息
     * @return WorkerCategoryEntity
     */
    WorkerCategoryEntity queryByCategoryName(String workerCategoryName);


    /**
     * 根据类别 id 查询工人类别信息
     * @return WorkerCategoryEntity
     */
    WorkerCategoryEntity queryByCategoryId(String workerCategoryId);

    /**
     * 插入新工人类别
     * @param entity 工人类别实体
     */
    int insertWorkerCategory(WorkerCategoryEntity entity);

    /**
     * 更新工人类别
     * @param entity 工人类别实体
     */
    int updateWorkCategory(WorkerCategoryEntity entity);

    /**
     * 根据类别id 删除工人类别
     * @param id 工人类别 id
     */
    int deleteWorkCategoryById(String id);
}
