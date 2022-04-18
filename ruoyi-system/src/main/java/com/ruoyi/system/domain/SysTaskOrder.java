package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 全部任务订单对象 sys_task_order
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public class SysTaskOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderId;

    /** 任务数量 */
    @Excel(name = "任务数量")
    private Long taskNum;

    /** 数据种类 */
    @Excel(name = "数据种类")
    private String category;

    /** 任务分配节点 */
    @Excel(name = "任务分配节点")
    private String peers;

    /** 下单账户 */
    @Excel(name = "下单账户")
    private String account;

    /** 下单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderDate;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOrderId(String orderId) 
    {
        this.orderId = orderId;
    }

    public String getOrderId() 
    {
        return orderId;
    }
    public void setTaskNum(Long taskNum) 
    {
        this.taskNum = taskNum;
    }

    public Long getTaskNum() 
    {
        return taskNum;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setPeers(String peers) 
    {
        this.peers = peers;
    }

    public String getPeers() 
    {
        return peers;
    }
    public void setAccount(String account) 
    {
        this.account = account;
    }

    public String getAccount() 
    {
        return account;
    }
    public void setOrderDate(Date orderDate) 
    {
        this.orderDate = orderDate;
    }

    public Date getOrderDate() 
    {
        return orderDate;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderId", getOrderId())
            .append("taskNum", getTaskNum())
            .append("category", getCategory())
            .append("peers", getPeers())
            .append("account", getAccount())
            .append("orderDate", getOrderDate())
            .append("status", getStatus())
            .toString();
    }
}
