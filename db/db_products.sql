/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50535
Source Host           : localhost:3306
Source Database       : db_products

Target Server Type    : MYSQL
Target Server Version : 50535
File Encoding         : 65001

Date: 2017-07-07 13:37:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(200) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES ('1', 'JAVA从入门到精通', '书籍', '68', '2017-07-04 22:11:35');
INSERT INTO `products` VALUES ('2', 'JAVA从入门到精通', '书籍', '68', '2017-07-04 22:12:48');
INSERT INTO `products` VALUES ('3', 'JAVA从入门到精通', '书籍', '68', '2017-07-04 22:23:56');
INSERT INTO `products` VALUES ('5', 'JAVA从入门到精通', '书籍', '68', '2017-07-04 22:26:08');
INSERT INTO `products` VALUES ('6', 'JAVA从入门到精通', '书籍', '68', '2017-07-04 22:26:32');
INSERT INTO `products` VALUES ('7', 'JAVA从入门到精通', '书籍', '68', '2017-07-05 11:38:10');
INSERT INTO `products` VALUES ('8', 'JAVA从入门到精通', '书籍', '68', '2017-07-05 11:39:02');
INSERT INTO `products` VALUES ('9', 'JAVA从入门到精通', '书籍', '68', '2017-07-05 11:44:25');
INSERT INTO `products` VALUES ('10', '微服务丛书', '书籍', '58', '2017-07-06 20:54:38');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `balance` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '曾现楷', '123', '30', '4000.00');
