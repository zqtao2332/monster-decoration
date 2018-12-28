package cn.zqtaotao.monster.decoration_server.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false, length = 3)
	private Long id;

	@Column(nullable = false, length = 50, columnDefinition = "varchar(50) comment '用户名'")
	private String userName;

	@Column(nullable = false, length = 50)
	private String passWord;
}