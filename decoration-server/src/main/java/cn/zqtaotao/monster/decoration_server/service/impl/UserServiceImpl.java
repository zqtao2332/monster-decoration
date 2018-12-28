package cn.zqtaotao.monster.decoration_server.service.impl;

import cn.zqtaotao.monster.decoration_server.model.entity.UserEntity;
import cn.zqtaotao.monster.decoration_server.mapper.UserMapper;
import cn.zqtaotao.monster.decoration_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther: zqtao
 * @description:
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;


    @Override
    public List<UserEntity> getUserList() {

        List<UserEntity> all = mapper.getAll();
        return all;
    }

    @Override
    public void save(UserEntity user) {
        mapper.insert(user);
    }
}
