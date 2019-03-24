package com.vip.zh.service.impl;

import com.vip.zh.dao.VipDOMapper;
import com.vip.zh.pojo.VipDO;
import com.vip.zh.service.VipAccountService;
import com.vip.zh.util.PasswordUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author zhangxinqiang
 * @date 2019-03-21
 */
@Service("VipAccountService")
public class VipAccountServiceImpl implements VipAccountService {

    @Resource
    private VipDOMapper vipMapper;

    private String[] telFirst = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");

    @Override
    public void createAccount() {
        for (int i = 0; i < 10; i++) {
            String account = getTel();
            String password = PasswordUtil.randomPassword(8);
            System.out.println("账号：" + account + " 密码：" + password);
            VipDO vipDO = new VipDO();
            vipDO.setVipAccount(account);
            vipDO.setVipPassword(password);
            vipDO.setUploadTime(LocalDateTime.now());
            vipMapper.insert(vipDO);
        }
        System.out.println("-----------------------");
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
