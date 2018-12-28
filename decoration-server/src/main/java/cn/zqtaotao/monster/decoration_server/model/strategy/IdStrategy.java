package cn.zqtaotao.monster.decoration_server.model.strategy;

import cn.hutool.core.lang.UUID;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @auther: zqtao
 * @description: 32 位id 生成策略
 * @version: 1.0
 */
public class IdStrategy implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
