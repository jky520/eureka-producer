create database db_products default charset utf8;

create table products (
	pid int not null primary key auto_increment, 
	pname varchar(200), 
	type varchar(50),
	price double,
	createTime timestamp
);

create table t_user(
	id int not null primary key auto_increment,
	username varchar(20),
	password varchar(50),
	age int(3),
	balance decimal(10,2)
);