SELECT * FROM t_student;

DROP TABLE IF EXISTS test_member;
CREATE TABLE test_member(
    mb_no int PRIMARY KEY AUTO_INCREMENT,
    mb_name varchar(40),
    mb_regdate datetime
);

insert INTO TEST_MEMBER(MB_NAME)
VALUES('킹콩'), ('고질라');

SELECT * FROM test_member;