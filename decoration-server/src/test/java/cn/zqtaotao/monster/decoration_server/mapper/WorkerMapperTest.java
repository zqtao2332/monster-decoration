package cn.zqtaotao.monster.decoration_server.mapper;

import cn.hutool.core.date.DateTime;
import cn.zqtaotao.monster.decoration_server.model.entity.SkillEntity;
import cn.zqtaotao.monster.decoration_server.model.entity.TemplateEntity;
import cn.zqtaotao.monster.decoration_server.model.entity.WorkerCategoryEntity;
import cn.zqtaotao.monster.decoration_server.model.entity.WorkerEntity;
import cn.zqtaotao.monster.decoration_server.util.CommonUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkerMapperTest {

    @Autowired
    private WorkerMapper mapper;

    @Test
    public void getAll() {
        List<WorkerEntity> all = mapper.queryAll();

        for(WorkerEntity entity: all) {
            System.out.println(entity);
        }
    }

    @Test
    public void insert() {

        WorkerEntity entity = new WorkerEntity();

        WorkerCategoryEntity workerCategoryEntity = new WorkerCategoryEntity();
        SkillEntity skillEntity = new SkillEntity();
        TemplateEntity templateEntity = new TemplateEntity();

        workerCategoryEntity.setWorkerCategoryId("690d4668b1184daea846b835f2a71afa");
        skillEntity.setSkillId("d433e8b3637f48029ef9ff994857d219");
        templateEntity.setTemplateId("44811d1d10ae451db6ad34b234876b93");

        entity.setWorkerId(CommonUtils.getUUid32());
        entity.setWorkerName("里斯");
        entity.setWorkerDesc("我是一个号工作者");
        entity.setImgAddr("/test");
        entity.setGender(1);
        entity.setPhone("15139081582");
        entity.setWechat("zqtaotao");
        entity.setExperience(8);
        entity.setWorkerCategoryEntity(workerCategoryEntity);
        entity.setPriority(2);
        entity.setWorkerAddr("123456");
        entity.setTemplateEntity(templateEntity);
        entity.setSkillEntity(skillEntity);
        entity.setCreateTime(DateTime.now());
        entity.setLastEditTime(DateTime.now());

        mapper.insertWorker(entity);

//        getAll();
    }
}