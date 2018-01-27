use dpm;

create table user (
	id VARCHAR(50) primary key,
    password VARCHAR(50) not null
);

create table token (
	token_key int not null auto_increment primary key,
    token_value int not null
);


create table diary (
	id int not null auto_increment primary key,
    title varchar(50) not null,
    content varchar(200) not null,
    create_date datetime not null,
    user_id varchar(50) not null
);

create table todo(
	id int not null auto_increment primary key,
    tag varchar(100),
    finish int not null,
    title varchar(50) not null,
    create_date datetime not null,
    user_id varchar(50) not null
);

create table moneybook (
	id int(11) unsigned NOT NULL auto_increment,
	date date,
    category int(3),
    content text,
    isCash TINYINT(1),
    isExpense TINYINT(1),
	PRIMARY KEY(id)
);

create table schedule (
	id varchar(50) primary key,
    user_id varchar(50),
    promise_time int not null,
    title varchar(50) not null,
    location varchar(50),
    finish int not null,
    create_date datetime default current_timestamp
);

insert into user values('jinhyeon', '1234');
insert into moneybook (date, category, content, isCash, isExpense) values (date(now())
, 2, '풋살 할 때', 1, 1);

select * from moneybook where date = "2018-01-18";
