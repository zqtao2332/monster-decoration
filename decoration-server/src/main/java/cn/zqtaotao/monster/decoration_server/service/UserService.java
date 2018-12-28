package cn.zqtaotao.monster.decoration_server.service;

import cn.zqtaotao.monster.decoration_server.model.entity.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getUserList();

    void save(UserEntity user);

}
