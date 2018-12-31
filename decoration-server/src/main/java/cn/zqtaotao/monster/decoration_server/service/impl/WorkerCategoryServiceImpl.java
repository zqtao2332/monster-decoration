package cn.zqtaotao.monster.decoration_server.service.impl;

import cn.hutool.core.date.DateTime;
import cn.zqtaotao.monster.decoration_server.mapper.WorkerCategoryMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.WorkerCategoryEntity;
import cn.zqtaotao.monster.decoration_server.service.WorkerCategoryService;
import cn.zqtaotao.monster.decoration_server.util.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @auther: zqtao
 * @description:
 * @version: 1.0
 */
@Service
@Transactional
@Slf4j
public class WorkerCategoryServiceImpl implements WorkerCategoryService {

    private final WorkerCategoryMapper mapper;

    @Autowired
    public WorkerCategoryServiceImpl(WorkerCategoryMapper mapper) {
        this.mapper = mapper;
    }


    @Override
    public List<WorkerCategoryEntity> getAll() {
        return mapper.queryAll();
    }

    @Override
    public int addWorkerCategory(WorkerCategoryEntity workerCategoryEntity) {

        WorkerCategoryEntity dbentity = mapper.queryByCategoryName(workerCategoryEntity.getWorkerCategoryName());

        if (dbentity != null) return 0;

        workerCategoryEntity.setWorkerCategoryId(CommonUtils.getUUid32());
        DateTime now = DateTime.now();
        workerCategoryEntity.setCreateTime(now);
        workerCategoryEntity.setLastEditTime(now);

        return mapper.insertWorkerCategory(workerCategoryEntity);
    }

    @Override
    public int modifyWorkCategory(WorkerCategoryEntity workerCategoryEntity) {

        WorkerCategoryEntity dbentity = mapper.queryByCategoryName(workerCategoryEntity.getWorkerCategoryName());

        if (dbentity != null && dbentity.getWorkerCategoryId() != null) {
            return mapper.updateWorkCategory(workerCategoryEntity);
        }
        return 0;
    }

    @Override
    public int removeWorkCategoryById(String id) {

        if (id == null || "".equals(id)) return 0;

        WorkerCategoryEntity dbentity = mapper.queryByCategoryName(id);
        if (dbentity != null) {
            return mapper.deleteWorkCategoryById(id);
        }
        return 0;
    }
}
