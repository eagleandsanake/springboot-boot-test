package org.wx.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wuxin
 * @date 2023/06/12 15:57:30
 */
@Data
public class BalanceUpdateDTO {

    private Long id;

    private String name;

    private Integer age;

    private BigDecimal money;

}
