package cn.zqtaotao.monster.decoration_server.mapper;

import cn.hutool.core.date.DateTime;
import cn.zqtaotao.monster.decoration_server.model.entity.TemplateEntity;
import cn.zqtaotao.monster.decoration_server.model.entity.TemplateImgsEntity;
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
public class TemplateImgsMapperTest {

    @Autowired
    private TemplateImgsMapper mapper;

    @Test
    public void getAll() {
        List<TemplateImgsEntity> all = mapper.queryAll();

        for(TemplateImgsEntity entity: all) {
            System.out.println(entity);
        }
    }

    @Test
    public void insert() {

        TemplateImgsEntity entity = new TemplateImgsEntity();
        TemplateEntity templateEntity = new TemplateEntity();
        templateEntity.setTemplateId("44811d1d10ae451db6ad34b234876b93");

        entity.setTemplateImgId(CommonUtils.getUUid32());
        entity.setTemplateEntity(templateEntity);
        entity.setImgAddr("/user");
        entity.setCreateTime(DateTime.now());

        mapper.insertTemplateImgs(entity);
//        getAll();
    }

}