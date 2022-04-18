package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysTaskOrderMapper;
import com.ruoyi.system.domain.SysTaskOrder;
import com.ruoyi.system.service.ISysTaskOrderService;

/**
 * 全部任务订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class SysTaskOrderServiceImpl implements ISysTaskOrderService 
{
    @Autowired
    private SysTaskOrderMapper sysTaskOrderMapper;

    /**
     * 查询全部任务订单
     * 
     * @param id 全部任务订单主键
     * @return 全部任务订单
     */
    @Override
    public SysTaskOrder selectSysTaskOrderById(Long id)
    {
        return sysTaskOrderMapper.selectSysTaskOrderById(id);
    }

    /**
     * 查询全部任务订单列表
     * 
     * @param sysTaskOrder 全部任务订单
     * @return 全部任务订单
     */
    @Override
    public List<SysTaskOrder> selectSysTaskOrderList(SysTaskOrder sysTaskOrder)
    {
        return sysTaskOrderMapper.selectSysTaskOrderList(sysTaskOrder);
    }

    /**
     * 新增全部任务订单
     * 
     * @param sysTaskOrder 全部任务订单
     * @return 结果
     */
    @Override
    public int insertSysTaskOrder(SysTaskOrder sysTaskOrder)
    {
        return sysTaskOrderMapper.insertSysTaskOrder(sysTaskOrder);
    }

    /**
     * 修改全部任务订单
     * 
     * @param sysTaskOrder 全部任务订单
     * @return 结果
     */
    @Override
    public int updateSysTaskOrder(SysTaskOrder sysTaskOrder)
    {
        return sysTaskOrderMapper.updateSysTaskOrder(sysTaskOrder);
    }

    /**
     * 批量删除全部任务订单
     * 
     * @param ids 需要删除的全部任务订单主键
     * @return 结果
     */
    @Override
    public int deleteSysTaskOrderByIds(Long[] ids)
    {
        return sysTaskOrderMapper.deleteSysTaskOrderByIds(ids);
    }

    /**
     * 删除全部任务订单信息
     * 
     * @param id 全部任务订单主键
     * @return 结果
     */
    @Override
    public int deleteSysTaskOrderById(Long id)
    {
        return sysTaskOrderMapper.deleteSysTaskOrderById(id);
    }
}
