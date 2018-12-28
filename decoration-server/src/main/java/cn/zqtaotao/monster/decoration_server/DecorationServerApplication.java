package cn.zqtaotao.monster.decoration_server;

import cn.zqtaotao.monster.decoration_server.mapper.annotation.MybatisMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "cn.zqtaotao.monster.decoration_server.mapper", annotationClass = MybatisMapper.class)
public class DecorationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecorationServerApplication.class, args);
    }

}

