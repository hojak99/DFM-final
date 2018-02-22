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
    create_date varchar(50) not null,
    user_id varchar(50) not null
);

drop table todo;
create table todo(
	id int auto_increment primary key,
    tag varchar(100),
    finish int not null,
    title varchar(50) not null,
    create_date varchar(50) not null,
    user_id varchar(50) not null
);

drop table schedule;
create table schedule (
	id int auto_increment primary key,
    user_id varchar(50) not null,
    promise_time TIME not null, # 현재 시간만
    title varchar(50) not null,
    location varchar(50),
    finish int not null, # 0이면 미완, 1이면 완료 
    create_date date not null # 날짜
);

insert into schedule (user_id, promise_time, title, location, finish, create_date) 
values("wlsgussla123", curtime(), "저녁 약속", "강남", 0, current_date());
insert into schedule (user_id, promise_time, title, location, finish, create_date) 
values("hojak", curtime(), "저녁 약속", "강남", 0, current_date());


select * from schedule;


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
select * from moneybook;
insert into diary (title, content, create_date, user_id) values ("타이틀", "내용", current_date(), "test1");
insert into moneybook (date, category, content, isCash, isExpense) values (current_date(), 1, "아침 식사", 1, 0);
insert into moneybook (date, category, content, isCash, isExpense) values (current_date(), 2, "점심 식사", 0, 1);
insert into moneybook (date, category, content, isCash, isExpense) values (current_date(), 3, "저녁 식사", 1, 0);

select * from moneybook where date="2018-01-29";