/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50629
Source Host           : localhost:3306
Source Database       : student

Target Server Type    : MYSQL
Target Server Version : 50629
File Encoding         : 65001

Date: 2019-10-14 19:37:18
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `tbl_stuinfo`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_stuinfo`;
CREATE TABLE `tbl_stuinfo` (
  `stuid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `sex` bit(1) NOT NULL,
  `mobile` varchar(30) NOT NULL,
  `birthday` datetime NOT NULL,
  `place` varchar(50) NOT NULL,
  `major` varchar(30) NOT NULL,
  `note` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`stuid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_stuinfo
-- ----------------------------
INSERT INTO tbl_stuinfo VALUES ('1', '饶弟', '', '1008611', '2019-10-14 19:35:00', '广西南宁', '大数据', 'note你猜');
INSERT INTO tbl_stuinfo VALUES ('2', '张三', '', '10010', '2019-10-14 19:35:37', '广西南宁', '大数据', 'note');
