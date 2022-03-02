create table student(
id int primary key identity(1,1),
name nvarchar(20),
password nvarchar(20),
department nvarchar(20),
tid int,
foreign key (tid) references teacher(id)
)

drop table student

create table teacher(
id int primary key identity(1,1),
name nvarchar(20),
password nvarchar(20),
department nvarchar(20),
)

insert student
values
('kevin','123','computer science',1),
('Elly','123','computer science',1),
('Jocelyn','123','computer science',1),
('Tony','123','philosophy',1),
('Jerry','123','biological',1)

insert teacher
values
('scott','123','education')

select * from student
where (id = 1 or id = 2)

select * from student

select * from teacher

update student
set name = 'Satellite'
where id = 1

select s.id sid, s.name sname, t.id tid, t.name tname
from student s, teacher t
where s.tid = t.id

select s.id sid, s.name sname, t.id tid, t.name tname
from student s
inner join teacher t
on s.tid = t.id

select * from student where (id = 1 or id = 2)




