package com.example.product.dao;

import com.example.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-05 01:13:53
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
