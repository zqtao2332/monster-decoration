package cn.zqtaotao.monster.decoration_server.service.impl;

import cn.zqtaotao.monster.decoration_server.mapper.WorkerMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.WorkerEntity;
import cn.zqtaotao.monster.decoration_server.service.WorkerService;
import cn.zqtaotao.monster.decoration_server.util.CommonUtils;
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
public class WorkerServiceImpl implements WorkerService {


    @Autowired
    private WorkerMapper mapper;

    @Override
    public List<WorkerEntity> getAll() {
        return mapper.queryAll();
    }

    @Override
    public void addWorker(WorkerEntity workerEntity) {
        WorkerEntity dbentity = mapper.queryByName(workerEntity.getWorkerName());

        if (dbentity != null && dbentity.getWorkerId() != null) {
            workerEntity.setWorkerName(CommonUtils.getUUid32());
            mapper.insertWorker(workerEntity);
        }
    }

    @Override
    public int modifyWork(WorkerEntity workerEntity) {
        WorkerEntity dbentity = mapper.queryByName(workerEntity.getWorkerName());

        if (dbentity != null && dbentity.getWorkerId() != null){
            return mapper.updateWorker(workerEntity);
        }
        return 0;
    }

    @Override
    public int removeWorkById(String id) {
        if (id == null || "".equals(id)) return 0;

        WorkerEntity dbentity = mapper.queryByName(id);
        if (dbentity != null){
            return mapper.deleteWorkerById(id);
        }
        return 0;
    }
}
