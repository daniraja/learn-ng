use registration;

insert into `reg` values (null,'dj','sd','dj@bing.com','2031456689');

select * from reg;
delete from reg;


ALTER TABLE reg
add dob varchar(100) NULL;

ALTER TABLE reg
add pic_id varchar(100) NULL, add pic_name varchar(100) NULL, add pic_data blob NULL, add pic_type varchar(100) NULL;