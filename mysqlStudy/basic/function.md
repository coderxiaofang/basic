#函数

-- 字符串函数
#字符串拼接
select concat('hello','hai');

#将字符串转化为小写
select lower('HELLO');

#将字符串转化为大写
SELECT upper('hello');

#左填充函数
select lpad('hello',7,'-');

#右填充函数
select rpad('hello',7,'-');

#去除头部和尾部的空格
select trim(' hello mysql ');

#截取字符串
#从7开始截取、截取四个
select substring('hello lulu!',7,4);

#例题：将员工的卡号左填充为2位，例如1填充位01
update user set idcard =lpad(user.idcard,2,'0');

-- 数值函数
#向上取整
select ceil(1.9);

#向下取整
select floor(1.1);

#取余
select mod(10,4);

#生成0-1之间的随机数
select rand();

#四舍五入，保留两位小数
select round(2.396,2);

#举例：获取6位验证码（先对一个随机的小于一的数字乘一百万，取整数部分，最后对于位数不够的用零填充）
select rpad(ceil(rand()*1000000),6,0);

--




