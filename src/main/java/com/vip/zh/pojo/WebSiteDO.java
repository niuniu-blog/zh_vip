package com.vip.zh.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 网站模型
 *
 * @author zhangxinqiang
 * @date 2019-03-19
 */
@Data
public class WebSiteDO implements Serializable {
    /**
     * id
     */
    private Integer id;
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
    private String status;
    /**
     * 备注
     */
    private String remark;
    /**
     * 页面路由地址
     */
    private String pageRouting;

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

    enum WebSiteTypeEnum {
        /**
         * 视频
         */
        VIDEO,
        /**
         * 购物
         */
        SHOP,
        /**
         * 下载
         */
        DOWNLOAD,
        ;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebSiteCode() {
        return webSiteCode;
    }

    public void setWebSiteCode(String webSiteCode) {
        this.webSiteCode = webSiteCode;
    }

    public String getWebSiteName() {
        return webSiteName;
    }

    public void setWebSiteName(String webSiteName) {
        this.webSiteName = webSiteName;
    }

    public String getWebSiteType() {
        return webSiteType;
    }

    public void setWebSiteType(String webSiteType) {
        this.webSiteType = webSiteType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPageRouting() {
        return pageRouting;
    }

    public void setPageRouting(String pageRouting) {
        this.pageRouting = pageRouting;
    }
}
