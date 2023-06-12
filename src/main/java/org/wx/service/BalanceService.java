package org.wx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.wx.domain.Balance;

import java.util.List;

/**
 *  Auto created by codeAppend plugin
 */
public interface BalanceService extends IService<Balance> {

    List<Balance> listBalance();

}