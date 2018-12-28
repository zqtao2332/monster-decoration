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
 * @description: 工人表 --- 实体
 * @version: 1.0
 */
@Entity
@Table(name = "tb_worker")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerEntity implements Serializable {

    /**
     * 工人编号 id
     */
    @Id
    @Column(length = 32, updatable = false, nullable = false)
    @GeneratedValue(generator = "idStrategy")
    @GenericGenerator(name = "idStrategy", strategy = "cn.zqtaotao.monster.decoration_server.model.strategy.IdStrategy")
    private String workerId;

    /**
     * 工人姓名
     */
    @Column(length = 64, nullable = false)
    private String workerName;

    /**
     * 工人描述
     */
    @Column(columnDefinition = "text")
    private String workerDesc;

    /**
     * 头像存储地址
     */
    private String imgAddr;

    /**
     * 性别
     */
    @Column(length = 1, nullable = false, columnDefinition = "tinyint(1) default 0 comment '0 male 1 female'")
    private Integer gender;

    /**
     * 居住地址
     */
    @Column(nullable = false)
    private String workerAddr;

    /**
     * 手机号
     */
    @Column(length = 11, nullable = false)
    private String phone;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 工作经验
     */
    @Column(nullable = false, length = 2, columnDefinition = "tinyint(2)")
    private Integer experience;

    /**
     * 所属工人类别 id
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "worker_category_id")
    private WorkerCategoryEntity workerCategoryEntity;
//    private String workerCategoryId;

    /**
     * 外键-工程模板样例 id
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "template_id")
    private TemplateEntity templateEntity;
//    private String templateId;

    /**
     * 外键-技术 id
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "skill_id")
    private SkillEntity skillEntity;
//    private String skillId;

    /**
     * 优先级
     */
    @Column(columnDefinition = "tinyint(3) not null default 0")
    private Integer priority;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss", iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss", iso = DateTimeFormat.ISO.DATE_TIME)
    private Date lastEditTime;

}
