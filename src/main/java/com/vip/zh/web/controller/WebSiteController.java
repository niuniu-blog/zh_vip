package com.vip.zh.web.controller;

import com.vip.zh.pojo.VipDO;
import com.vip.zh.pojo.WebSiteDO;
import com.vip.zh.service.VipAccountService;
import com.vip.zh.service.WebSiteService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 网站会员请求控制器
 *
 * @author zhangxinqiang
 * @date 2019-03-19
 */
@RequestMapping("/WebSite")
@RestController
public class WebSiteController {


    @Resource(name = "WebSiteService")
    private WebSiteService webSiteService;

    @Resource(name = "VipAccountService")
    private VipAccountService vipAccountService;

    /**
     * 获取每日生成的账号密码
     * @param id
     * @return
     */
    @RequestMapping(value = "/vip/{id}", method = RequestMethod.GET)
    public List<VipDO> listVipByWebSiteId(@PathVariable(name = "id") Integer id) {
        System.out.println(id);
        List<VipDO> vipDOS = null;
        try {
            vipDOS = vipAccountService.listVipByWebSiteId(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vipDOS;
    }

    @RequestMapping(value = "/listWebsite", method = RequestMethod.GET)
    public List<WebSiteDO> listWebSite() {
        List<WebSiteDO> webSiteDOList = null;
        try {
            webSiteDOList = webSiteService.listWebSite();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return webSiteDOList;
    }
}
