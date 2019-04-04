/*
初始化数据DML
*/
INSERT INTO user(id, name, age) SELECT 1, '明辉', 34 FROM DUAL WHERE NOT EXISTS(SELECT id FROM user WHERE id = 1);
INSERT INTO user(id, name, age) SELECT 2, 'jfmh', 30 FROM DUAL WHERE NOT EXISTS(SELECT id FROM user WHERE id = 2);
