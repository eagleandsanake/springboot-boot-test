package org.wx.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.wx.domain.Balance;
import org.wx.dto.BalanceQueryDTO;
import org.wx.dto.BalanceSaveDTO;
import org.wx.dto.BalanceUpdateDTO;
import org.wx.service.BalanceService;
import org.wx.vo.BalanceQueryVO;
import org.wx.vo.BalanceSaveVO;
import org.wx.vo.BalanceUpdateVO;

import javax.annotation.Resource;

/**
 * @author wuxin
 * @date 2023/06/12 14:23:01
 */
@RestController
public class BalanceController {

    @Resource
    private BalanceService balanceService;


    @PostMapping("/balance/list")
    public Page<Balance> list(@RequestBody BalanceQueryVO queryVO){
        BalanceQueryDTO balanceQueryDTO = new BalanceQueryDTO();
        BeanUtils.copyProperties(queryVO,balanceQueryDTO);
        return balanceService.listBalance(balanceQueryDTO);
    }


    @PostMapping("/balance/save")
    public void save(@RequestBody BalanceSaveVO balanceSaveVO){
        BalanceSaveDTO balanceSaveDTO = new BalanceSaveDTO();
        BeanUtils.copyProperties(balanceSaveVO,balanceSaveDTO);
        balanceService.saveSingle(balanceSaveDTO);
    }


    @PostMapping("/balance/update")
    public void update(@RequestBody BalanceUpdateVO updateVO){
        BalanceUpdateDTO updateDTO = new BalanceUpdateDTO();
        BeanUtils.copyProperties(updateVO,updateDTO);
        balanceService.updateSingle(updateDTO);
    }

    @PostMapping("/balance/del")
    public void update(Long id){
        balanceService.del(id);
    }





}
