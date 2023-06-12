package org.wx.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wuxin
 * @date 2023/06/12 15:56:52
 */
@Data
public class BalanceUpdateVO {

    private Long id;

    private String name;

    private Integer age;

    private BigDecimal money;

}

