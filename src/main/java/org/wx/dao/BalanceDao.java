package org.wx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.wx.domain.Balance;
import org.wx.dto.BalanceQueryDTO;
import org.wx.dto.BalanceSaveDTO;
import org.wx.dto.BalanceUpdateDTO;

/**
 * Auto created by codeAppend plugin
 */
public interface BalanceDao extends BaseMapper<Balance> {

    void saveSingle(@Param("balanceSaveDTO") BalanceSaveDTO balanceSaveDTO);

    void updateSingle(@Param("updateDTO") BalanceUpdateDTO updateDTO);

    Page<Balance> listBalance(@Param("page") Page<Balance> page, @Param("queryDTO") BalanceQueryDTO queryDTO);

    void del(Long id);
}