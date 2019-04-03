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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(Integer webSiteId) {
        this.webSiteId = webSiteId;
    }

    public String getVipAccount() {
        return vipAccount;
    }

    public void setVipAccount(String vipAccount) {
        this.vipAccount = vipAccount;
    }

    public String getVipPassword() {
        return vipPassword;
    }

    public void setVipPassword(String vipPassword) {
        this.vipPassword = vipPassword;
    }

    public LocalDateTime getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(LocalDateTime uploadTime) {
        this.uploadTime = uploadTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
