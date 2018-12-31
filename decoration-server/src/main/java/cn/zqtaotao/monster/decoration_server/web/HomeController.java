package cn.zqtaotao.monster.decoration_server.web;

import cn.zqtaotao.monster.decoration_server.mapper.WorkerCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: zqtao
 * @description:
 * @version: 1.0
 */
@RestController
@RequestMapping(value = "/home")
public class HomeController {

    private final WorkerCategoryMapper workerCategoryMapper;

    @Autowired
    public HomeController(WorkerCategoryMapper workerCategoryMapper) {
        this.workerCategoryMapper = workerCategoryMapper;
    }








}
