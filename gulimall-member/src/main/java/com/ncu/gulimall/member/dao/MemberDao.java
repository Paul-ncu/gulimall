package com.ncu.gulimall.member.dao;

import com.ncu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiaohao
 * @email 1037432782@qq.com
 * @date 2021-02-25 18:37:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
