
create table t_user(
  id varchar(128) primary key,
  name varchar(256) not null,
  age int
) default character set utf8;