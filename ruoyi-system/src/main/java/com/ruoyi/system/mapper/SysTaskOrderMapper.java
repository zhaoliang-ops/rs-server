package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysTaskOrder;

/**
 * 全部任务订单Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface SysTaskOrderMapper 
{
    /**
     * 查询全部任务订单
     * 
     * @param id 全部任务订单主键
     * @return 全部任务订单
     */
    public SysTaskOrder selectSysTaskOrderById(Long id);

    /**
     * 查询全部任务订单列表
     * 
     * @param sysTaskOrder 全部任务订单
     * @return 全部任务订单集合
     */
    public List<SysTaskOrder> selectSysTaskOrderList(SysTaskOrder sysTaskOrder);

    /**
     * 新增全部任务订单
     * 
     * @param sysTaskOrder 全部任务订单
     * @return 结果
     */
    public int insertSysTaskOrder(SysTaskOrder sysTaskOrder);

    /**
     * 修改全部任务订单
     * 
     * @param sysTaskOrder 全部任务订单
     * @return 结果
     */
    public int updateSysTaskOrder(SysTaskOrder sysTaskOrder);

    /**
     * 删除全部任务订单
     * 
     * @param id 全部任务订单主键
     * @return 结果
     */
    public int deleteSysTaskOrderById(Long id);

    /**
     * 批量删除全部任务订单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysTaskOrderByIds(Long[] ids);
}
