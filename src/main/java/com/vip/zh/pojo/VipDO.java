package com.vip.zh.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Vip模型
 *
 * @author zhangxinqiang
 * @date 2019-03-19
 */
@Data
public class VipDO {
    /**
     * id
     */
    private Integer id;
    /**
     * 外键 网站id
     */
    private Integer webSiteId;
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
    private String status;
    /**
     * 上传者
     */
    private String creator;

    /**
     * 状态枚举
     */
    enum StatusEnum {
        /**
         * 可用
         */
        ABLE,
        /**
         * 不可用
         */
        UN_ABLE
    }
}
