create database marketdb;

grant all privileges on marketdb.* to 'gommarket'@'localhost' identified by 'gom0119!1';
grant all privileges on marketdb.* to 'gommarket'@'%' identified by 'gom0119!1';

use marketdb;

create table user(
	id varchar(20) primary key,
	name varchar(20) not null,
	password varchar(20) not null,
	type varchar(10)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

