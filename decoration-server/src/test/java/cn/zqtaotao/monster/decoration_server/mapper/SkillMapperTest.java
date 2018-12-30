package cn.zqtaotao.monster.decoration_server.mapper;

import cn.hutool.core.date.DateTime;
import cn.zqtaotao.monster.decoration_server.model.entity.SkillCategoryEntity;
import cn.zqtaotao.monster.decoration_server.model.entity.SkillEntity;
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
public class SkillMapperTest {
    @Autowired
    private SkillMapper mapper;

    @Test
    public void getAll() {
        List<SkillEntity> all = mapper.queryAll();

        for(SkillEntity entity: all) {
            System.out.println(entity);
        }
    }

    @Test
    public void insert() {

        SkillEntity entity = new SkillEntity();
        SkillCategoryEntity skillCategoryEntity = new SkillCategoryEntity();
        skillCategoryEntity.setSkillCategoryId("fd1207ac17564fb98b6ac1768e1f8357");

        entity.setSkillId(CommonUtils.getUUid32());
        entity.setSkillName("泥工是盖墙的");
        entity.setSkillDesc("泥工");
        entity.setSkillCategoryEntity(skillCategoryEntity);
        entity.setPriority(1);
        entity.setCreateTime(DateTime.now());
        entity.setLastEditTime(DateTime.now());

        mapper.insertSkill(entity);

//        getAll();
    }
}