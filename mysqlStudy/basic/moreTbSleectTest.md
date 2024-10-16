select *
from user
where job_number > '4';
#查询所有job_number大于4的员工，及其所属的部门，如果员工没有部门也要展示出来
select u.name, d.depart
from user u
         left join department d on u.dept_id = d.id
where u.job_number > 4;
# 查询所有员工的工资等级
select user.name, salgrade.grade
from user,
     salgrade
where salary between losal and hisal;

#查询测试部的员工的工资等级
#方法2，用多个and连接（课程给的）
select u.name, d.depart, s.grade
from user u,
     department d,
     salgrade s
where u.dept_id = d.id
  and (salary between losal and hisal)
  and depart = '测试部';
select *
from salgrade;

#方法1，嵌套（自己写的)
select e.name, e.depart, s.grade
from (
         select u.id, u.name, u.salary, d.depart
         from department d
                  left join user u
                            on d.id = u.dept_id
         where d.depart = '测试部') as e,
     salgrade s
where e.salary between s.losal and s.hisal;

#查询测试部员工的平均薪资
select avg(salary)
from department d
         left join user u
                   on d.id = u.dept_id
where d.depart = '测试部';
# 查询工资比c高的员工信息
select salary
from user
where name = 'c';
select *
from user
where salary > (select salary from user where name = 'c');

#查询比平均薪资高的员工信息
select *
from user
where salary > (select avg(salary) from user);

#查询低于本部门平均薪资的员工信息
#（视频解法）
select *
from user u
where u.salary < (select avg(salary) from user u2 where u.dept_id = u2.dept_id);

#（自己写的）
select e.name, e.salary, s.depart
from (
         #匹配每一个员工的部门
         select u.name, u.salary, d.depart
         from user u
                  left join department d on u.dept_id = d.id) e
         join (
    #计算所有部门的平均薪资
    select d.depart, avg(salary) as salary
    from user u
             left join department d on u.dept_id = d.id
    group by depart) s
    #条件
              on e.depart = s.depart and e.salary < s.salary;

#查询所有部门信息，并统计部门人数
select depart, count(*)
from user u
         inner join department d on u.dept_id = d.id
group by depart;

#查询选课系统的学生名称，学生id，课程名称
select s.name as '学生名称', s.id as '学生id', e.name as '课程名称'
from student s
         inner join (
    select student_id, c.name
    from student_course sc
             inner join course c on sc.course_id = c.id) e on s.id = e.student_id;
#and连接（课程方法）
select s.id, s.name, c.name
from student s,
     student_course sc,
     course c
where s.id = sc.student_id
  and c.id = sc.course_id;

#查询表信息
select *
from course;
select *
from student;
select *
from student_course;

#查询表结构
desc user;

#查询表
select *
from user;
select *
from user2;
select *
from salgrade;
select *
from department;

#在user表中加入员工的薪资
alter table user
    add salary int;
update user
set salary =980
where id = 1;
update user
set salary =2003
where id = 2
   or id = 3;
update user
set salary =3100
where id = 4
   or id = 5;
update user
set salary =1100
where id = 6
   or id = 7;
select salary
from user;

#创建薪资表
select *
from user;
create table salgrade
(
    grade int,
    losal int,
    hisal int
);
#插入薪资表的数据
insert into salgrade
values (1, 0, 1000),
       (2, 1001, 2000),
       (3, 2001, 3000),
       (4, 3001, 40000);
update salgrade
set hisal=4000
where grade = 4;
select *
from salgrade;