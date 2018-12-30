package cn.zqtaotao.monster.decoration_server.util;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.lang.UUID;

import java.util.Date;

/**
 * @auther: zqtao
 * @description:
 * @version: 1.0
 */
public class CommonUtils {

    public static String getUUid32(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
        System.out.println(DateTime.now());
    }
}
