package cn.zqtaotao.monster.decoration_server.mapper;

import cn.hutool.core.date.DateTime;
import cn.zqtaotao.monster.decoration_server.model.entity.SkillCategoryEntity;
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
public class SkillCategoryMapperTest {

    @Autowired
    private SkillCategoryMapper mapper;

    @Test
    public void getAll() {
        List<SkillCategoryEntity> all = mapper.queryAll();

        for(SkillCategoryEntity entity: all) {
            System.out.println(entity);
        }
    }

    @Test
    public void insert() {

        SkillCategoryEntity entity = new SkillCategoryEntity();

        entity.setSkillCategoryId(CommonUtils.getUUid32());
        entity.setSkillCategoryDesc("泥工是盖墙的");
        entity.setSkillCategoryName("泥工");
        entity.setPriority(1);
        entity.setCreateTime(DateTime.now());
        entity.setLastEditTime(DateTime.now());

        mapper.insertSkillCategory(entity);

//        getAll();
    }
}