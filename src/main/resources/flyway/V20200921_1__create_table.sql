DROP TABLE IF EXISTS groups;
DROP TABLE IF EXISTS student;

Create table groups(
id int PRIMARY KEY,
name varchar(255)
);
create table student(
id int PRIMARY KEY,
name varchar(255),
telephone  varchar(255),
group_id int REFERENCES groups(id)
);