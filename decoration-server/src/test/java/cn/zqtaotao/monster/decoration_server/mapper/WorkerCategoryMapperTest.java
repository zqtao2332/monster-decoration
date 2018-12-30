package cn.zqtaotao.monster.decoration_server.mapper;

import cn.hutool.core.date.DateTime;
import cn.zqtaotao.monster.decoration_server.model.entity.WorkerCategoryEntity;
import cn.zqtaotao.monster.decoration_server.util.CommonUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkerCategoryMapperTest {

    @Autowired
    private WorkerCategoryMapper mapper;

    @Test
    public void getAll() {
        List<WorkerCategoryEntity> all = mapper.queryAll();

        for(WorkerCategoryEntity entity: all) {
            System.out.println(entity);
        }
    }

    @Test
    public void insert() {

        WorkerCategoryEntity entity = new WorkerCategoryEntity();

        entity.setWorkerCategoryId(CommonUtils.getUUid32());
        entity.setWorkerCategoryDesc("这bu是一个好装修员");
        entity.setWorkerCategoryName("彭超");
        entity.setPriority(1);
        entity.setCreateTime(DateTime.now());
        entity.setLastEditTime(DateTime.now());

        mapper.insertWorkerCategory(entity);

//        getAll();
    }
}