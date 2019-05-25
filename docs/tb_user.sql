/*
 Navicat Premium Data Transfer

 Source Server         : jing
 Source Server Type    : MySQL
 Source Server Version : 50622
 Source Host           : localhost:3306
 Source Schema         : jdbctest

 Target Server Type    : MySQL
 Target Server Version : 50622
 File Encoding         : 65001

 Date: 25/05/2019 19:51:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` int(10) NULL DEFAULT NULL COMMENT '年龄',
  `sex` tinyint(1) NULL DEFAULT NULL COMMENT '性别，1男性，2女性',
  `birthday` date NULL DEFAULT NULL COMMENT '出生日期',
  `created` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updated` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'zhangsan', '123456', '张三', 30, 1, '1984-08-08', '2014-09-19 16:56:04', '2014-09-21 11:24:59');
INSERT INTO `tb_user` VALUES (2, 'lisi', '123456', '李四', 21, 2, '1991-01-01', '2014-09-19 16:56:04', '2014-09-19 16:56:04');
INSERT INTO `tb_user` VALUES (3, 'wangwu', '123456', '王五', 22, 2, '1989-01-01', '2014-09-19 16:56:04', '2014-09-19 16:56:04');
INSERT INTO `tb_user` VALUES (4, 'zhangwei', '123456', '张伟', 20, 1, '1988-09-01', '2014-09-19 16:56:04', '2014-09-19 16:56:04');
INSERT INTO `tb_user` VALUES (5, 'lina', '123456', '李娜', 28, 1, '1985-01-01', '2014-09-19 16:56:04', '2014-09-19 16:56:04');
INSERT INTO `tb_user` VALUES (6, 'lilei', '123456', '李磊', 23, 1, '1988-08-08', '2014-09-20 11:41:15', '2014-09-20 11:41:15');
INSERT INTO `tb_user` VALUES (8, 'liuyan', '123', '丫头', 16, 1, '2019-05-12', '2019-05-12 18:32:58', '2019-05-12 18:55:10');
INSERT INTO `tb_user` VALUES (16, '哈哈', '123', '柳岩', 16, 1, '2019-05-12', '2019-05-12 18:50:48', '2019-05-12 18:50:48');
INSERT INTO `tb_user` VALUES (19, '哈哈', '123', '柳岩', 16, 1, '2019-05-12', '2019-05-12 18:55:10', '2019-05-12 18:55:10');
INSERT INTO `tb_user` VALUES (20, '哈哈', '123', '柳岩', 16, 1, '2019-05-13', '2019-05-13 09:32:37', '2019-05-13 09:32:37');
INSERT INTO `tb_user` VALUES (21, '哈哈', '123', '柳岩111', 16, 1, '2019-05-13', '2019-05-13 09:33:05', '2019-05-13 09:33:05');
INSERT INTO `tb_user` VALUES (22, '哈哈', '123', '柳岩111', 16, 1, '2019-05-13', '2019-05-13 09:33:54', '2019-05-13 09:33:54');
INSERT INTO `tb_user` VALUES (23, 'jingge', '123456', '靖哥', 20, 1, '2019-05-13', '2019-05-13 16:48:39', '2019-05-13 16:48:39');
INSERT INTO `tb_user` VALUES (25, 'admin1', '123456', '用户1', 18, 1, '2019-05-25', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
