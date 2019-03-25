package com.vip.zh.service.impl;

import com.vip.zh.dao.WebSiteDOMapper;
import com.vip.zh.pojo.WebSiteDO;
import com.vip.zh.service.WebSiteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangxinqiang
 * @date 2019-03-19
 */
@Service("WebSiteService")
public class WebSiteServiceImpl implements WebSiteService {

    @Resource
    private WebSiteDOMapper webSiteMapper;


    @Override
    public List<WebSiteDO> listWebSite() {
        return webSiteMapper.listWebbSite();
    }
}
