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
 * @description: 专业技术类别表 --- 实体
 * @version: 1.0
 */
@Entity
@Table(name = "tb_skill_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillCategoryEntity implements Serializable {

    /**
     * 技术类别 id
     */
    @Id
    @Column(length = 32, nullable = false, updatable = false)
    @GeneratedValue(generator = "idStrategy")
    @GenericGenerator(name = "idStrategy", strategy = "cn.zqtaotao.monster.decoration_server.model.strategy.IdStrategy")
    protected String skillCategoryId;

    /**
     * 技术类别名
     */
    @Column(length = 64, nullable = false)
    private String skillCategoryName;

    /**
     * 技术类别描述
     */
    @Column(columnDefinition = "text")
    private String skillCategoryDesc;

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
