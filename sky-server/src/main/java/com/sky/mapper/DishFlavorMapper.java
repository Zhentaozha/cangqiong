package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author tao
 * @create 8/2/2024 9:41 PM
 */
@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味数据 (动态sql，写在xml中)
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);//集合对象，需要动态sql


    /**
     * 批量删除口味数据
     * @param dishIds
     */
    void deleteByDishIds(List<Long> dishIds);
}
