insert into user (id, name, age, gender, idcard, entryDate)
    values(10,'小明',21,'男','12','1999-12-13');

#增加一个数据类型
alter table user add dept_id int;

#更新学生信息
update user set dept_id=1 where id<=3 ;
update user set dept_id=2 where id<=5 and id>3;
update user set dept_id=3 where id>5;
update user set id=8 where name='b';

#删除id为10的学生的信息
delete from user where id=10;

#修改id为主键
alter table user modify id int primary key ;

#新增一个部门表
create table department(
    id int primary key auto_increment comment'id',
    depart varchar(50) not null comment'部门'
)comment '部门表';

#删除表
drop table department;

#显示表结构
desc department;

select *from department;
insert into department (depart)
    values('测试部'),('监管部'),('执行部');

#添加外键，fk_user_dept_id是外键名称
alter table user
    add constraint fk_user_dept_id foreign key(dept_id)
    references department(id);
#删除department这个表中的id为2的信息
delete from department where id=2;

#删除外键
alter table user drop foreign key fk_user_dept_id;

#1对多，设置外键
#外键的删除和更新行为，下例的cascode表示（在更新删除时若有子表对应的外键则更新/删除外键)
alter table user
    add constraint fk_user_dept_id foreign key(dept_id)
    references department(id) on update cascade on delete cascade;
#下例设置为set null表示在更新删除是若有对应的外键，子表的值为null
alter table user add constraint fk_user_dept_id foreign key(dept_id)
    references department(id) on update set null on delete set null;






