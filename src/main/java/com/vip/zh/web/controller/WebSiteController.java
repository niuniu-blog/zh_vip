package com.vip.zh.web.controller;

import com.vip.zh.pojo.vo.WebSiteVO;
import com.vip.zh.service.WebSiteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @GetMapping("/")
    public List<WebSiteVO> listWebSite() {
        List<WebSiteVO> webSiteVOList = null;
        try {
            webSiteVOList = webSiteService.listWebSite();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return webSiteVOList;
    }
}
