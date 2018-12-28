package cn.zqtaotao.monster.decoration_server.mapper;

import cn.zqtaotao.monster.decoration_server.model.entity.UserEntity;
import cn.zqtaotao.monster.decoration_server.mapper.annotation.MybatisMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @auther: zqtao
 * @description:
 * @version: 1.0
 */
@MybatisMapper
public interface UserMapper {

    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "userName",  column = "user_name"),
            @Result(property = "passWord", column = "pass_word")
    })
    List<UserEntity> getAll();

    @Insert("INSERT INTO users(user_name,pass_word) VALUES(#{userName}, #{passWord})")
    void insert(UserEntity user);

}
