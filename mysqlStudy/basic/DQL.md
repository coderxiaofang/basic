# DQL

#查询年龄大于20的人的信息
select *from user where age>20;

#查询没有身份证号的学生
select *from user where idcard is null;

#查询有身份证号的学生
select *from user where idcard is not null;

#查询年龄不等于23的学生
select *from user where age !=11;

#查询年龄在12-20之间的人
select *from user where age>=12 and age<=20;
select *from user where age between 12 and 20;

#查询性别为女，年龄小于23
select *from user where gender='女' and age<23;

# 查询年龄为12或14或11的人的信息
select *from user where age=12 or age=14 or age=11;
select *from user where age in (11,12,14);

#查询姓名是一个字的人的信息
select *from user where name like '_';

# 查询入职时间是30结尾的人
select *from user where entryDate like '%30';

-- 不计算null值
select count(id) from user;

#获取性别为女的年龄的平均值
select avg(age) from user where gender='女';
#获取性别为男的年龄平均值
select avg(age) from user where gender='男';

# 获取所有员工年龄的最大值
select max(age) from user;

# 获取所有员工年龄的最小值
select min(age) from user;

#获取心别为女的人的年龄总和
select sum(age) from user where gender='女';

#根据条件分组

#根据性别进行分组，并统计各性别的人数
select gender,count(*) from user group by gender;

#根据性别进行分组，并统计各性别的平均值
select gender,avg(age) from user group by gender;

#查询年龄小于15的人，根据性别进行分组，获取性别为男的数量
select gender,count(*) from user where age<15 group by gender having gender='男';

#根据年龄降值排序
select * from user order by age desc ;

#根据入职时间进行升序排序
select *from user order by entryDate asc ;

#根据年龄排序，若年龄相同根据入职时间降序排序
select * from user order by age asc ,entryDate desc ;

#查询性别为女，年龄在10-20，姓名是一个字的人
select *from user where gender='女' and age between 10 and 20 and name like '_';

# 执行顺序：from > where > group by > having > select > order by > limit




