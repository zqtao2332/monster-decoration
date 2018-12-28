package cn.zqtaotao.monster.decoration_server.web;

import cn.zqtaotao.monster.decoration_server.model.entity.UserEntity;
import cn.zqtaotao.monster.decoration_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
		List<UserEntity> users=userService.getUserList();
		return users;
	}
	
    @RequestMapping("/add")
    public void save(UserEntity user) {
        userService.save(user);
    }
    

    
}