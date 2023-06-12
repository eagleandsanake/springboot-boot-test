package org.wx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.wx.domain.Balance;
import org.wx.dto.BalanceQueryDTO;
import org.wx.dto.BalanceSaveDTO;
import org.wx.dto.BalanceUpdateDTO;

import java.util.List;

/**
 *  Auto created by codeAppend plugin
 */
public interface BalanceService extends IService<Balance> {

    Page<Balance> listBalance(BalanceQueryDTO balanceQueryDTO);

    void saveSingle(BalanceSaveDTO balanceSaveDTO);

    void updateSingle(BalanceUpdateDTO updateDTO);

    void del(Long id);
}