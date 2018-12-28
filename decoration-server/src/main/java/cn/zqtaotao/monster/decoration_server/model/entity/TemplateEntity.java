package cn.zqtaotao.monster.decoration_server.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @auther: zqtao
 * @description: 工程模板样例表 --- 实体
 * @version: 1.0
 */
@Entity
@Table(name = "tb_template")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateEntity implements Serializable {

    /**
     * 模板id
     */
    @Id
    @Column(length = 32, nullable = false, updatable = false)
    @GeneratedValue(generator = "idStrategy")
    @GenericGenerator(name = "idStrategy", strategy = "cn.zqtaotao.monster.decoration_server.model.strategy.IdStrategy")
    private String templateId;

    /**
     * 模板名
     */
    @Column(length = 64, nullable = false)
    private String templateName;

    /**
     * 模板描述
     */
    @Column(columnDefinition = "text")
    private String templateDesc;

    /**
     * 优先级
     */
    @Column(length = 3, nullable = false, columnDefinition = "tinyint(3) not null default 0")
    private Integer priority;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss", iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss", iso = DateTimeFormat.ISO.DATE_TIME)
    private Date lastEditTime;
}
