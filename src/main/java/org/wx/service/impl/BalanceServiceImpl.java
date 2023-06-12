package org.wx.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.wx.domain.Balance;
import org.wx.dao.BalanceDao;
import org.wx.dto.BalanceQueryDTO;
import org.wx.dto.BalanceSaveDTO;
import org.wx.dto.BalanceUpdateDTO;
import org.wx.service.BalanceService;
import org.springframework.stereotype.Service;
import org.wx.vo.BalanceQueryVO;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 账户余额
 * Auto created by codeAppend plugin
 */
@Service
public class BalanceServiceImpl extends ServiceImpl<BalanceDao, Balance> implements BalanceService {

    /**
     * 2小时秒的常量
     */
    private static final Integer TWO_HOUR_SECOND = 2 * 3600;

    @Override
    public Page<Balance> listBalance(@RequestBody BalanceQueryDTO queryDTO) {
        // 构建page对象
        Page<Balance> page = new Page<>(queryDTO.getCurrent(), queryDTO.getSize());
        // 分页查询
        Page<Balance> list = baseMapper.listBalance(page,queryDTO);
        return list;
    }

    @Override
    public void saveSingle(BalanceSaveDTO balanceSaveDTO) {
        baseMapper.saveSingle(balanceSaveDTO);
    }

    @Override
    public void updateSingle(BalanceUpdateDTO updateDTO) {
        baseMapper.updateSingle(updateDTO);
    }

    @Override
    public void del(Long id) {
        baseMapper.del(id);
    }
}