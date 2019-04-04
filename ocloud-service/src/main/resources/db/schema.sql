/*
初始化数据库对象DDL，用于不便于使用jpa初始化的对象:方法、存储过程、序列、特殊定义表等
*/
/* 例如：*/
CREATE TABLE if not exists `user` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
