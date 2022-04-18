package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysTaskOrder;
import com.ruoyi.system.service.ISysTaskOrderService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 全部任务订单Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/system/order")
public class SysTaskOrderController extends BaseController
{
    @Autowired
    private ISysTaskOrderService sysTaskOrderService;

    /**
     * 查询全部任务订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:order:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysTaskOrder sysTaskOrder)
    {
        startPage();
        List<SysTaskOrder> list = sysTaskOrderService.selectSysTaskOrderList(sysTaskOrder);
        return getDataTable(list);
    }

    /**
     * 导出全部任务订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:order:export')")
    @Log(title = "全部任务订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysTaskOrder sysTaskOrder)
    {
        List<SysTaskOrder> list = sysTaskOrderService.selectSysTaskOrderList(sysTaskOrder);
        ExcelUtil<SysTaskOrder> util = new ExcelUtil<SysTaskOrder>(SysTaskOrder.class);
        util.exportExcel(response, list, "全部任务订单数据");
    }

    /**
     * 获取全部任务订单详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:order:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysTaskOrderService.selectSysTaskOrderById(id));
    }

    /**
     * 新增全部任务订单
     */
    @PreAuthorize("@ss.hasPermi('system:order:add')")
    @Log(title = "全部任务订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysTaskOrder sysTaskOrder)
    {
        return toAjax(sysTaskOrderService.insertSysTaskOrder(sysTaskOrder));
    }

    /**
     * 修改全部任务订单
     */
    @PreAuthorize("@ss.hasPermi('system:order:edit')")
    @Log(title = "全部任务订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysTaskOrder sysTaskOrder)
    {
        return toAjax(sysTaskOrderService.updateSysTaskOrder(sysTaskOrder));
    }

    /**
     * 删除全部任务订单
     */
    @PreAuthorize("@ss.hasPermi('system:order:remove')")
    @Log(title = "全部任务订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysTaskOrderService.deleteSysTaskOrderByIds(ids));
    }
}
