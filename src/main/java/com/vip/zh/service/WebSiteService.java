package com.vip.zh.service;

import com.vip.zh.pojo.WebSiteDO;

import java.util.List;

/**
 * 网站站点业务接口
 *
 * @author zhangxinqiang
 * @date 2019-03-19
 */
public interface WebSiteService {
    List<WebSiteDO> listWebSite();

    List<WebSiteDO> getWebSite();

}
