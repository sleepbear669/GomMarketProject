create database marketdb;

grant all privileges on marketdb.* to 'gommarket'@'localhost' identified by 'gom0119!1';
grant all privileges on marketdb.* to 'gommarket'@'%' identified by 'gom0119!1';

use marketdb;

create table user(
	id varchar(20) primary key NOT NULL ,
	name varchar(20) not null,
	password varchar(20) not null,
	type varchar(10)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table product(
	product_id int auto_increment primary key NOT NULL ,
	product_name varchar(20),
	seller_id varchar(20) not null,
	contents varchar(500),
	image varchar(50) DEFAULT "sleepbear.jpg",
	price int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE cart(
  cart_id int auto_increment PRIMARY KEY,
  product_id INT NOT NULL ,
  buyer_id VARCHAR (20) NOT NULL ,
  foreign key (product_id) references product(product_id),
  foreign key (buyer_id) references user(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;