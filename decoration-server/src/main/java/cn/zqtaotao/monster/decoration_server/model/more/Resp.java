package cn.zqtaotao.monster.decoration_server.model.more;

import lombok.*;

/**
 * 封装响应信息
 */
@Setter
@Getter
public class Resp {

    private static final int SUCCESS = 200;
    private static final int SERVER_ERROR = 500;

    private int status;
    private boolean success;
    private String msg;
    private Object data;

    private Resp() {
    }

    private Resp(int status, boolean success, String msg, Object data) {
        this.status = status;
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    // 成功返回
    public static Resp ok() {
        return new Resp(SUCCESS, true, null, null);
    }
    public static Resp ok(String msg) {
        return new Resp(SUCCESS, true, msg, null);
    }

    public static Resp ok(Object data) {
        return new Resp(SUCCESS, true, null, data);
    }

    public static Resp ok(String msg, Object data) {
        return new Resp(SUCCESS, true, msg, data);
    }

    // 错误返回
    public static Resp error() {
        return new Resp(SERVER_ERROR, false, null, null);
    }

    public static Resp error(String msg) {
        return new Resp(SERVER_ERROR, false, msg, null);
    }

    public static Resp error(Object data) {
        return new Resp(SERVER_ERROR, false, null, data);
    }

    public static Resp error(Object data, String msg) {
        return new Resp(SERVER_ERROR, false, msg, data);
    }


    /**
     * 返回响应信息实例
     *
     * @return Resp
     */
    public Resp build() {
        return new Resp();
    }

    public int getStatus() {
        return status;
    }

}
