package com.ncu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ncu.common.utils.PageUtils;
import com.ncu.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author xiaohao
 * @email 1037432782@qq.com
 * @date 2021-02-25 18:02:15
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

