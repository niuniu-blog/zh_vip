package com.vip.zh.service;

import com.vip.zh.pojo.VipDO;

import java.util.List;

/**
 * vip账户业务类
 *
 * @author zhangxinqiang
 * @date 2019-03-21
 */
public interface VipAccountService {
    /**
     * 创建vip账号
     */
    void createAccount();

    /**
     * 根据网站id获取vip账号
     */
    List<VipDO> listVipByWebSiteId(Integer id);
}
