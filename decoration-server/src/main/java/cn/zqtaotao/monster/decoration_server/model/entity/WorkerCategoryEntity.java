package cn.zqtaotao.monster.decoration_server.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @auther: zqtao
 * @description: 工人类别表 --- 实体
 * @version: 1.0
 */
@Entity
@Table(name = "tb_worker_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerCategoryEntity implements Serializable {

    /**
     * 工人类别id
     */
    @Id
    @Column(length = 32, updatable = false, nullable = false)
    @GeneratedValue(generator = "idStrategy")
    @GenericGenerator(name = "idStrategy", strategy = "cn.zqtaotao.monster.decoration_server.model.strategy.IdStrategy")
    private String workerCategoryId;

    /**
     * 工人类别名
     */
    @Column(length = 64, nullable = false)
    private String workerCategoryName;

    /**
     * 工人类别描述
     */
    @Column(columnDefinition = "text")
    private String workerCategoryDesc;

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
