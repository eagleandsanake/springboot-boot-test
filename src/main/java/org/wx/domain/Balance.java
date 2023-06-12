package org.wx.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import lombok.Data;

@Data
@TableName("user_balance")
public class Balance {
/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Long id;

	/**
	 * 名字
	 */
	@TableField("name")
	private String name;

	/**
	 * 年龄
	 */
	@TableField("age")
	private Integer age;

	/**
	 * 余额
	 */
	@TableField("money")
	private Long money;


}

