package com.vip.zh.job;

import com.vip.zh.service.VipAccountService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * vip账号密码创建任务
 *
 * @author zhangxinqiang
 * @date 2019-03-19
 */
@Component
public class VipAccountCreatJob {

    @Resource(name = "VipAccountService")
    private VipAccountService vipAccountService;

    @Scheduled(cron = "0 * 11 * * ?")
    public void createAccount() {
        vipAccountService.createAccount();
    }
}
