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
 * @description: 工程模板样例图片表 --- 实体
 * @version: 1.0
 */
@Entity
@Table(name = "tb_template_imgs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateImgsEntity implements Serializable {

    /**
     * 模板图片 id
     */
    @Id
    @Column(length = 32, nullable = false, updatable = false)
    @GeneratedValue(generator = "idStrategy")
    @GenericGenerator(name = "idStrategy", strategy = "cn.zqtaotao.monster.decoration_server.model.strategy.IdStrategy")
    private String templateImgId;

    /**
     * 模板图片存储地址
     */
    private String imgAddr;

    /**
     * 所属模板 id
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "template_id")
    private TemplateEntity templateEntity;
//    private String templateId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss", iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createTime;
}
