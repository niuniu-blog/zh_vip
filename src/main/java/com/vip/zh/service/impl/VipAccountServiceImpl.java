package com.vip.zh.service.impl;

import com.vip.zh.dao.VipDOMapper;
import com.vip.zh.dao.WebSiteDOMapper;
import com.vip.zh.pojo.VipDO;
import com.vip.zh.pojo.WebSiteDO;
import com.vip.zh.service.VipAccountService;
import com.vip.zh.util.PasswordUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author zhangxinqiang
 * @date 2019-03-21
 */
@Service("VipAccountService")
public class VipAccountServiceImpl implements VipAccountService {

    @Resource
    private VipDOMapper vipMapper;

    @Resource
    private WebSiteDOMapper webSiteDOMapper;

    private String[] telFirst = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");

    private static List<WebSiteDO> webSiteDOS;

    /**
     * 生成账号
     */
    @Override
    public void createAccount() {
        if (webSiteDOS == null || webSiteDOS.size() == 0) {
            webSiteDOS = webSiteDOMapper.listWebbSite();
        }
        /*
         * 所有网站生成一遍
         */
        for (WebSiteDO webSiteDO : webSiteDOS) {
            String account = getTel();
            String password = PasswordUtil.randomPassword(8);
            System.out.println("账号：" + account + " 密码：" + password);
            VipDO vipDO = new VipDO();
            vipDO.setVipAccount(account);
            vipDO.setVipPassword(password);
            vipDO.setUploadTime(LocalDateTime.now());
            vipDO.setWebSiteId(webSiteDO.getId());
            vipMapper.insert(vipDO);
        }
    }

    @Override
    public List<VipDO> listVipByWebSiteId(Integer id) {
        return vipMapper.listVipByWebSiteId(id);
    }

    private String getTel() {
        int index = getNum(0, telFirst.length - 1);
        String first = telFirst[index];
        String second = String.valueOf(getNum(1, 888) + 10000).substring(1);
        String third = String.valueOf(getNum(1, 9100) + 10000).substring(1);
        return first + second + third;
    }

    private int getNum(int start, int end) {
        return (int) (Math.random() * (end - start + 1) + start);
    }
}
