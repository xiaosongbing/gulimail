package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zzwang
 * @email zzwang@gmail.com
 * @date 2020-07-02 18:09:45
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
