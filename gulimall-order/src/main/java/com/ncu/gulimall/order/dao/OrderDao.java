package com.ncu.gulimall.order.dao;

import com.ncu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiaohao
 * @email 1037432782@qq.com
 * @date 2021-02-25 18:42:12
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
