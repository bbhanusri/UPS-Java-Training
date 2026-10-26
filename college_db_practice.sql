create database hii;
use hii;
create table student(
student_id INT PRIMARY KEY,
name varchar(50),
age int,
gender varchar(30),
department varchar(30),
city varchar(30),
marks int,
joining_year int
);
INSERT INTO student(student_id,name,age,gender,department,city,marks,joining_year)
values (101, 'Arun', 20, 'Male', 'CSE', 'Chennai', 85, 2023),
(102, 'Priya', 21, 'Female', 'ECE', 'Madurai', 92, 2022),
(103, 'Karthik', 19, 'Male', 'CSE', 'Coimbatore', 78, 2024),
(104, 'Divya', 22, 'Female', 'IT', 'Chennai', 88, 2022),
(105, 'Rahul', 20, 'Male', 'EEE', 'Salem', 67, 2023),
(106, 'Meena', 21, 'Female', 'CSE', 'Trichy', 95, 2021),
(107, 'Vignesh', 22, 'Male', 'IT', 'Chennai', 74, 2022),
(108, 'Anu', 20, 'Female', 'ECE', 'Madurai', 81, 2023);
select * from student;
select name from student;
select name,marks from student;
select * from student where city = "chennai";
select * from student where department = "CSE";
select * from student where marks>80;
select * from student where age<21;
select * from student where gender = "Female";
select * from student where joining_year = 2023;
select name, city from student;
select * from student where marks between 70 and 90;
select * from student where city = "chennai" and marks>80;
select * from student where city in("chennai","madurai");
select * from student where department !="cse";
select * from student where name like 'A%';
select * from student order by marks ASC;
select * from student order by age ASC, marks ASC;
select count(*) as total_students  from student;
select avg(marks) as avg_marks from student;
select max(marks) as highest_marks from student order by marks desc;
select min(marks) as lowest_marks from student;
select department, count(*) as total_students from student group by department;
select department, avg(marks)as avg_marks from student group by department;
select department, max(marks) as highest_marks from student group by department;
select  max(marks) as second_highest_mark from student where marks<(select max(marks) from student);
select * from student order by marks desc;
select * from student where marks > (select avg(marks) as avg_marks from student);
select department , count(*) as total_students from students group by department  having count(*) >  2;
select city , count(*) as tot_students from student group by city order by tot_students desc limit 1 ;
select * from student order by marks desc limit 3;
select * from student where name like "%a";
select * from student where name like "%i%";
select department ,sum(marks)as tot_marks from student group by department;
select department, avg(marks) as avg_marks from student group by department having  (avg_marks)>80;
select * from student order by age asc limit 1;
select * from student order by age desc limit 1;
select * from student where marks = 85;
SELECT gender, COUNT(*) AS total_students FROM STUDENT GROUP BY gender;
select * from student where joining_year<2023;
select distinct city from student;
select distinct department from student;
select  sum(marks)as tot_marks from student;
select count(*)as tot_student from student where city = "chennai";
select * from student where marks not between 70 and 90;
select * from student where department in ("cse", "it");
select * from student where city != "chennai";
select department, avg(marks) as avg_marks from student group by department order by avg_marks asc limit 1;
select * from student where marks >= 85;
select joining_year, count(*) as tot_students from student group by joining_year;







