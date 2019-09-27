drop table if exists article;

create table article (id int primary key, title varchar(200), text varchar(3000), created_time timestamp without time zone, updated_time timestamp without time zone);