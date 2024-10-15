#子查询（标量子查询),下列查询测试部所有员工的信息
select * from user where dept_id=(select id from department where depart='测试部');

#子查询（列子查询)，下列查询监管部和执行部的所有员工信息，细节in
select * from user where dept_id in (select id from department where depart='监管部' or depart='执行部');

#行子查询（=、<>、in、not in）
#查询与a的dept_id相同和job_number相同的员工信息
select * from user where (dept_id,job_number)=(select dept_id,job_number from user where name='a');

# 表子查询(下例为查询与a和C的job_number和dept_id相同的员工信息)
select job_number,dept_id from user a where name='a' or name='c' ;
select * from user where (job_number,dept_id) in (select job_number,dept_id from user a where name='a' or name='c');

#查询1995年之后入职的员工信息(将查询到的结果作为一张表，用左连接)
select * from user where date_time>'1995-01-01';
select * from (select * from user where date_time>'1995-01-01') e left join department d on e.dept_id=d.id;

#修改数据
update user set job_number=4 where id=3;
select * from user;
select * from department;



