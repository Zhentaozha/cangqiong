package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
     * @param ids
     */
    void deleteByDishIds(List<Long> ids);

    /**
     * 根据菜品id查询对应的口味数据
     * @param id
     * @return
     */
    @Select("select * from dish_flavor where dish_id = #{dishId}")
    List<DishFlavor> getByDishId(Long id);


    /**
     * 根据菜品id删除对应的口味数据
     * @param
     */
    @Delete("delete from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long id);
}
