/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : imiros

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 02/04/2019 17:41:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for vip
-- ----------------------------
DROP TABLE IF EXISTS `vip`;
CREATE TABLE `vip` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `web_site_id` int(10) DEFAULT NULL COMMENT '外键，网站id',
  `vip_account` varchar(50) DEFAULT NULL COMMENT 'vip账号',
  `vip_password` varchar(50) DEFAULT NULL COMMENT 'vip密码',
  `upload_time` datetime DEFAULT NULL COMMENT '上传时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` varchar(6) DEFAULT NULL COMMENT '账号状态ABLE 可用  UN_ABLE不可用',
  `creator` varchar(50) DEFAULT NULL COMMENT '上传者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for web_site
-- ----------------------------
DROP TABLE IF EXISTS `web_site`;
CREATE TABLE `web_site` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `web_site_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '网站编码',
  `web_site_name` varchar(10) DEFAULT NULL COMMENT '网站名称',
  `web_site_type` varchar(10) DEFAULT NULL COMMENT '网站类型，VIDEO视频，SHOP购物，DOWNLOAD下载',
  `status` varchar(10) DEFAULT NULL COMMENT '网站状态，ABLE可用，UN_ABLE 不可用',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '页面介绍',
  `page_routing` varchar(255) DEFAULT NULL COMMENT '页面路由',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of web_site
-- ----------------------------
BEGIN;
INSERT INTO `web_site` VALUES (1, 'AIQIYI', '爱奇艺', 'VIDEO', 'ABLE', '爱奇艺视频会员-每日更新-免费看视频-免费下载视频', 'aiqiyi/aiqiyi.html');
INSERT INTO `web_site` VALUES (2, 'TENGXUN', '腾讯视频', 'VIDEO', 'ABLE', '腾讯视频会员-免费看视频-会员账号每日更新', NULL);
INSERT INTO `web_site` VALUES (3, 'LESHI', '乐视视频', 'VIDEO', 'ABLE', '乐视视频会员-免费观看-免费账号获取-最新能用', NULL);
INSERT INTO `web_site` VALUES (4, 'YOUKU', '优酷网', 'VIDEO', 'ABLE', '优酷网会员-免费会员-观看免费电影-海量资源', NULL);
INSERT INTO `web_site` VALUES (5, 'BAIDUWANGPAN', '百度网盘', 'DOWNLOAD', 'ABLE', '百度网盘会员-增加下载速度-网盘账号免费获取', NULL);
INSERT INTO `web_site` VALUES (6, 'XUNLEI', '迅雷会员', 'DOWNLOAD', 'ABLE', '迅雷会员-海量电影免费下载-免费提速', NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
