package com.vip.zh.pojo.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 网站视图模型
 *
 * @author zhangxinqiang
 * @date 2019-03-19
 */
@Data
public class WebSiteVO {
    /**
     * 网站编码
     */
    private String webSiteCode;
    /**
     * 网站名称
     */
    private String webSiteName;
    /**
     * 网站类型
     */
    private String webSiteType;
    /**
     * 网站状态
     */
    private String siteStatus;
    /**
     * vip账号
     */
    private String vipAccount;
    /**
     * vip密码
     */
    private String vipPassword;
    /**
     * 账号上传时间
     */
    private LocalDateTime uploadTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 账号状态
     */
    private String accountStatus;
    /**
     * 上传者
     */
    private String creator;

}
