create table user2(
     id int primary key auto_increment comment '主键id',
     job_number varchar(10) not null comment '员工工号' ,
     name varchar(10) comment '员工姓名' ,
     gender char(1) comment '性别',
     age tinyint unsigned comment '年龄',
     id_number char(18) comment '身份证号',
     date_time date comment '入职时间',
     depart_id int,
     foreign key(depart_id)references user2(id),
     dept_id int,
     foreign key (dept_id )references department(id)
#      constraint fk_student_id foreign key(student_id) references student (id) ,
#      constraint fk_user_dept_id foreign key(dept_id) references department(id)
) comment '员工表2';

desc user2;

insert into user2( job_number, name, gender, age, id_number, date_time,depart_id)
value ('1','a','女','11','1','1992-12-13',null),
    ('2','b','女','12','2','1993-12-13',1),
    ('3','c','男','13','3','1994-12-13',1),
    ('4','d','女','14','4','1995-12-13',2),
    ('5','e','男','15','5','1996-12-13',3),
    ('6','f','男','16','6','1997-12-13',2);
insert into user (job_number, name, gender, age, id_number, date_time)
values('6','f','男','16','6','1997-12-13');



update user set dept_id =1 where id=1 or id=2;
update user set dept_id =2 where id=3 or id=4;
update user set dept_id =3 where id=5 or id=6;

# 多表查询笛卡尔积
#内连接（两表交集部分）
#隐式内连接
select user.name ,department.depart from user,department where user.dept_id=department.id;
#显式内连接(下表分别取了别名u、d）
select u.name,d.depart from user u inner join department d on u.dept_id=d.id;
select user.name ,department.depart from user inner join department on user.dept_id=department.id ;

#外连接(左外）
select u.name,d.depart from user u left outer join department d on u.dept_id=d.id;

#外连接(右外）
select d.depart,u.name from user u right outer join department d on u.dept_id=d.id;

#自连接（可以是外连接也可以是内连接）
#内连接
select a.name '员工' ,b.name '领导'from user2 a inner join user2 b on a.depart_id=b.id;
#外连接（查询所有信息
select a.name '员工' ,b.name '领导' from user2 a left  join user2 b on a.depart_id=b.id;

#联合查询(union)

select *from user;
select * from department;

drop table user;







