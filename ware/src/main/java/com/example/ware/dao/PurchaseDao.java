package com.example.ware.dao;

import com.example.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-06-05 01:16:57
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
