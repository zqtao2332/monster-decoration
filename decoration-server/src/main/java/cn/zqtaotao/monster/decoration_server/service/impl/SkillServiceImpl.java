package cn.zqtaotao.monster.decoration_server.service.impl;

import cn.zqtaotao.monster.decoration_server.mapper.SkillMapper;
import cn.zqtaotao.monster.decoration_server.model.entity.SkillEntity;
import cn.zqtaotao.monster.decoration_server.service.SkillService;
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
public class SkillServiceImpl implements SkillService {

    private final SkillMapper mapper;

    @Autowired
    public SkillServiceImpl(SkillMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<SkillEntity> getAll() {
        return mapper.queryAll();
    }

    @Override
    public void addSkill(SkillEntity skillEntity) {
        SkillEntity dbentity = mapper.queryByName(skillEntity.getSkillName());

        if (dbentity != null && dbentity.getSkillId() != null) {
            skillEntity.setSkillName(CommonUtils.getUUid32());
            mapper.insertSkill(skillEntity);
        }
    }

    @Override
    public int modifySkill(SkillEntity skillEntity) {
        SkillEntity dbentity = mapper.queryByName(skillEntity.getSkillName());

        if (dbentity != null && dbentity.getSkillId() != null){
            return mapper.updateSkill(skillEntity);
        }
        return 0;
    }

    @Override
    public int removeSkillById(String skillId) {
        if (skillId == null || "".equals(skillId)) return 0;

        SkillEntity dbentity = mapper.queryByName(skillId);
        if (dbentity != null){
            return mapper.deleteSkillById(skillId);
        }
        return 0;
    }
}
