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
import com.ruoyi.system.domain.TRsStandardSatelliteImage;
import com.ruoyi.system.service.ITRsStandardSatelliteImageService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 数据资源管理Controller
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@RestController
@RequestMapping("/system/image")
public class TRsStandardSatelliteImageController extends BaseController
{
    @Autowired
    private ITRsStandardSatelliteImageService tRsStandardSatelliteImageService;

    /**
     * 查询数据资源管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:image:list')")
    @GetMapping("/list")
    public TableDataInfo list(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        startPage();
        List<TRsStandardSatelliteImage> list = tRsStandardSatelliteImageService.selectTRsStandardSatelliteImageList(tRsStandardSatelliteImage);
        return getDataTable(list);
    }
    /**
     * 查询所有任务资源管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:localimage:list')")
    @GetMapping("/allTaskList")
    public TableDataInfo getAllTaskList(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        startPage();
        List<TRsStandardSatelliteImage> list = tRsStandardSatelliteImageService.getAllTaskList(tRsStandardSatelliteImage);
        return getDataTable(list);
    }
    /**
     * 导出数据资源管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:image:export')")
    @Log(title = "数据资源管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        List<TRsStandardSatelliteImage> list = tRsStandardSatelliteImageService.selectTRsStandardSatelliteImageList(tRsStandardSatelliteImage);
        ExcelUtil<TRsStandardSatelliteImage> util = new ExcelUtil<TRsStandardSatelliteImage>(TRsStandardSatelliteImage.class);
        util.exportExcel(response, list, "数据资源管理数据");
    }

    /**
     * 获取数据资源管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:image:query')")
    @GetMapping(value = "/{imageId}")
    public AjaxResult getInfo(@PathVariable("imageId") Long imageId)
    {
        return AjaxResult.success(tRsStandardSatelliteImageService.selectTRsStandardSatelliteImageByImageId(imageId));
    }

    /**
     * 新增数据资源管理
     */
    @PreAuthorize("@ss.hasPermi('system:image:add')")
    @Log(title = "数据资源管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return toAjax(tRsStandardSatelliteImageService.insertTRsStandardSatelliteImage(tRsStandardSatelliteImage));
    }

    /**
     * 修改数据资源管理
     */
    @PreAuthorize("@ss.hasPermi('system:image:edit')")
    @Log(title = "数据资源管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return toAjax(tRsStandardSatelliteImageService.updateTRsStandardSatelliteImage(tRsStandardSatelliteImage));
    }

    /**
     * 删除数据资源管理
     */
    @PreAuthorize("@ss.hasPermi('system:image:remove')")
    @Log(title = "数据资源管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{imageIds}")
    public AjaxResult remove(@PathVariable Long[] imageIds)
    {
        return toAjax(tRsStandardSatelliteImageService.deleteTRsStandardSatelliteImageByImageIds(imageIds));
    }
}
