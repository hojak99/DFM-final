use dpm;

create table user (
	id VARCHAR(50) primary key,
    password VARCHAR(50) not null
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

insert into user values('jinhyeon', '1234');
insert into moneybook (date, category, content, isCash, isExpense) values (date(now())
, 2, '풋살 할 때', 1, 1);

select * from moneybook where date = "2018-01-18";
