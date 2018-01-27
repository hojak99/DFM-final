use dpm;

create table user (
	id VARCHAR(50) primary key,
    password VARCHAR(50) not null
);

create table token (
	token_key int not null auto_increment primary key,
    token_value int not null
);


drop table diary;
create table diary (
	id int auto_increment primary key,
    title varchar(50) not null,
    content varchar(200) not null,
    create_date datetime not null,
    user_id varchar(50) not null
);

drop table todo;
create table todo(
	id int auto_increment primary key,
    tag varchar(100),
    finish int not null,
    title varchar(50) not null,
    create_date datetime not null,
    user_id varchar(50) not null
);

drop table schedule;
create table schedule (
	id int auto_increment primary key,
    user_id varchar(50) not null,
    promise_time int not null,
    title varchar(50) not null,
    location varchar(50),
    finish int not null,
    create_date datetime not null
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

select * from diary;
insert into diary (title, content, create_date, user_id) values ("타이틀", "내용", current_date(), "test1");

