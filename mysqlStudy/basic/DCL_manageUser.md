#DCL-管理用户
use mysql;

#创建用户
create user 'lulu'@'%' identified by '123456';

#任意主机都可以访问
create user 'lulu3'@'%' identified by '123456';

#修改密码
alter user 'lulu3'@'%' identified with mysql_native_password by '1234';

#删除用户
drop user 'lulu'@'licalhost';

#查询权限
show grants for 'lulu'@'%';

#授予lulu这个用户MySQL数据库的所有权限
grant all on mysql.* to 'lulu'@'%';

#撤销权限
revoke all on mysql.* from 'lulu'@'%';
































