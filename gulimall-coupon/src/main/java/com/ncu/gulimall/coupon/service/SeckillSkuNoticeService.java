package com.ncu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ncu.common.utils.PageUtils;
import com.ncu.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author xiaohao
 * @email 1037432782@qq.com
 * @date 2021-02-25 18:32:42
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

