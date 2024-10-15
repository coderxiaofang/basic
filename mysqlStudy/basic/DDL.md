DDL数据库操作
显示数据库
 show databases;

显示当前数据库
 select database();

显示所有表
 show tables;

新建表
create table tb_staff(
id int comment '编号',
job_number varchar(10) comment '员工工号' ,
name varchar(10) comment '员工姓名' ,
gender char(1) comment '性别',
age tinyint unsigned comment '年龄',
id_number char(18) comment '身份证号',
date_time date comment '入职时间'
) comment '员工表';

显示所有字段
desc tb_staff；

插入内容
insert into tb_staff values(1,'1','小明','男','21','12345678','1999-12-13');

添加字段
alter table tb_s add nickname varchar(20);

修改数据类型
 alter tb_staff modify username varchar(20);

修改字段名和字段类型
 alter table tb_staff change nickname username varchar(30);

删除字段
alter table tb_table drop username;

修改表名
alter table tb_staff rename to employee;

删除表（如果存在）
 drop table if exists tb;

删除表并且重新创建表（数据都会删除）
 truncate table tb;













