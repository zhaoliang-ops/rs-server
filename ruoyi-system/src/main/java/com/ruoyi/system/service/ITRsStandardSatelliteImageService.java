package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TRsStandardSatelliteImage;

/**
 * 数据资源管理Service接口
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
public interface ITRsStandardSatelliteImageService 
{
    /**
     * 查询数据资源管理
     * 
     * @param imageId 数据资源管理主键
     * @return 数据资源管理
     */
    public TRsStandardSatelliteImage selectTRsStandardSatelliteImageByImageId(Long imageId);

    /**
     * 查询数据资源管理列表
     * 
     * @param tRsStandardSatelliteImage 数据资源管理
     * @return 数据资源管理集合
     */
    public List<TRsStandardSatelliteImage> selectTRsStandardSatelliteImageList(TRsStandardSatelliteImage tRsStandardSatelliteImage);
    /**
     * 查询数据资源管理列表
     *
     * @param tRsStandardSatelliteImage 数据资源管理
     * @return 数据资源管理集合
     */
    public List<TRsStandardSatelliteImage> getAllTaskList(TRsStandardSatelliteImage tRsStandardSatelliteImage);

    /**
     * 新增数据资源管理
     * 
     * @param tRsStandardSatelliteImage 数据资源管理
     * @return 结果
     */
    public int insertTRsStandardSatelliteImage(TRsStandardSatelliteImage tRsStandardSatelliteImage);

    /**
     * 修改数据资源管理
     * 
     * @param tRsStandardSatelliteImage 数据资源管理
     * @return 结果
     */
    public int updateTRsStandardSatelliteImage(TRsStandardSatelliteImage tRsStandardSatelliteImage);

    /**
     * 批量删除数据资源管理
     * 
     * @param imageIds 需要删除的数据资源管理主键集合
     * @return 结果
     */
    public int deleteTRsStandardSatelliteImageByImageIds(Long[] imageIds);

    /**
     * 删除数据资源管理信息
     * 
     * @param imageId 数据资源管理主键
     * @return 结果
     */
    public int deleteTRsStandardSatelliteImageByImageId(Long imageId);
}
