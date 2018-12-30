package cn.zqtaotao.monster.decoration_server.mapper;

import cn.hutool.core.date.DateTime;
import cn.zqtaotao.monster.decoration_server.model.entity.TemplateEntity;
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
public class TemplateMapperTest {
    @Autowired
    private TemplateMapper mapper;

    @Test
    public void getAll() {
        List<TemplateEntity> all = mapper.queryAll();

        for(TemplateEntity entity: all) {
            System.out.println(entity);
        }
    }

    @Test
    public void insert() {

        TemplateEntity entity = new TemplateEntity();
        TemplateEntity templateEntity = new TemplateEntity();

        entity.setTemplateId(CommonUtils.getUUid32());
        entity.setTemplateName("皇家学院装修图");
        entity.setTemplateDesc("吊顶横漂零");
        entity.setPriority(3);
        entity.setCreateTime(DateTime.now());
        entity.setLastEditTime(DateTime.now());

        mapper.insertTemplate(entity);
        getAll();
    }
}