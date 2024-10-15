-- 事务
#查看事务的提交方式，1代表自动提交，0代表手动提交
select @@autocommit;

#设置事务为手动提交
set @@autocommit=0;
#start 开始一个事务
start transaction;

#举例，张三的账户转账1000到李四的账户
select * from account where name='张三';
update account set money=money-1000 where name='张三';
update account set money=money+1000 where name='李四';

#提交事务
commit;
#回滚事务
rollback;

#创建数据表
create table account (
    id int primary key auto_increment,
    name varchar(10) not null,
    money float
)comment '账户表';
desc account;
insert into account (id,name,money) values(1,'张三',2000),(2,'李四',2000); -- 插入数据
update account set money=2000 where name='张三' or name='李四';

