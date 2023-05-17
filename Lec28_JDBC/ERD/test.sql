select * from phonebook;

drop table if exists test_member;

create table test_member(
    mb_no int PRIMARY KEY AUTO_INCREMENT,
    mb_name varchar(40),
    mb_regdate datetime
);

INSERT INTO test_member(mb_name) values('킹콩'), ('고질라');

select * from test_member;
