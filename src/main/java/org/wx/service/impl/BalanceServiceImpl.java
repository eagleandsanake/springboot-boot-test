package org.wx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.wx.domain.Balance;
import org.wx.dao.BalanceDao;
import org.wx.service.BalanceService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Auto created by codeAppend plugin
 */
@Service
public class BalanceServiceImpl extends ServiceImpl<BalanceDao, Balance> implements BalanceService {

    @Override
    public List<Balance> listBalance() {
        List<Balance> list = list();
        return list;
    }
}