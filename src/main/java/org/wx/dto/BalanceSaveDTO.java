package org.wx.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wuxin
 * @date 2023/06/12 15:52:14
 */
@Data
public class BalanceSaveDTO {

    private String name;

    private Integer age;

    private BigDecimal money;

}
