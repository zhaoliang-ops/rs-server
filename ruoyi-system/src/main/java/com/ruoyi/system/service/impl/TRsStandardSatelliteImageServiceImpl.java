package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TRsStandardSatelliteImageMapper;
import com.ruoyi.system.domain.TRsStandardSatelliteImage;
import com.ruoyi.system.service.ITRsStandardSatelliteImageService;

/**
 * 数据资源管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-04
 */
@Service
public class TRsStandardSatelliteImageServiceImpl implements ITRsStandardSatelliteImageService 
{
    @Autowired
    private TRsStandardSatelliteImageMapper tRsStandardSatelliteImageMapper;

    /**
     * 查询数据资源管理
     *
     * @param imageId 数据资源管理主键
     * @return 数据资源管理
     */
    @Override
    public TRsStandardSatelliteImage selectTRsStandardSatelliteImageByImageId(Long imageId)
    {
        return tRsStandardSatelliteImageMapper.selectTRsStandardSatelliteImageByImageId(imageId);
    }


    /**
     * 查询数据资源管理列表
     *
     * @param tRsStandardSatelliteImage 数据资源管理
     * @return 数据资源管理
     */
    @Override
    public List<TRsStandardSatelliteImage> selectTRsStandardSatelliteImageList(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return tRsStandardSatelliteImageMapper.selectTRsStandardSatelliteImageList(tRsStandardSatelliteImage);
    }
    /**
     * 查询数据资源管理列表
     *
     * @param tRsStandardSatelliteImage 数据资源管理
     * @return 数据资源管理
     */
    @Override
    public List<TRsStandardSatelliteImage> getAllTaskList(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return tRsStandardSatelliteImageMapper.getAllTaskList(tRsStandardSatelliteImage);
    }

    /**
     * 新增数据资源管理
     * 
     * @param tRsStandardSatelliteImage 数据资源管理
     * @return 结果
     */
    @Override
    public int insertTRsStandardSatelliteImage(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return tRsStandardSatelliteImageMapper.insertTRsStandardSatelliteImage(tRsStandardSatelliteImage);
    }

    /**
     * 修改数据资源管理
     * 
     * @param tRsStandardSatelliteImage 数据资源管理
     * @return 结果
     */
    @Override
    public int updateTRsStandardSatelliteImage(TRsStandardSatelliteImage tRsStandardSatelliteImage)
    {
        return tRsStandardSatelliteImageMapper.updateTRsStandardSatelliteImage(tRsStandardSatelliteImage);
    }

    /**
     * 批量删除数据资源管理
     * 
     * @param imageIds 需要删除的数据资源管理主键
     * @return 结果
     */
    @Override
    public int deleteTRsStandardSatelliteImageByImageIds(Long[] imageIds)
    {
        return tRsStandardSatelliteImageMapper.deleteTRsStandardSatelliteImageByImageIds(imageIds);
    }

    /**
     * 删除数据资源管理信息
     * 
     * @param imageId 数据资源管理主键
     * @return 结果
     */
    @Override
    public int deleteTRsStandardSatelliteImageByImageId(Long imageId)
    {
        return tRsStandardSatelliteImageMapper.deleteTRsStandardSatelliteImageByImageId(imageId);
    }
}
