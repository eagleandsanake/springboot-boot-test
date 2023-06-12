package org.wx.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wx.domain.Balance;
import org.wx.service.BalanceService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wuxin
 * @date 2023/06/12 14:23:01
 */
@RestController
public class BalanceController {

    @Resource
    private BalanceService balanceService;

    @PostMapping("/balance/list")
    public List<Balance> list(String aaa){

        return balanceService.listBalance();
    }


}
