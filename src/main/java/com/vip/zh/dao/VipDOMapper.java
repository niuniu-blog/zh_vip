package com.vip.zh.dao;

import com.vip.zh.pojo.VipDO;

public interface VipDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VipDO record);

    int insertSelective(VipDO record);

    VipDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VipDO record);

    int updateByPrimaryKey(VipDO record);
}