USE lab;
create table  EMP1( ID bigint(2), Name varchar(20),Basic double(6,2),
DEsignation varchar(10), Age bigint(2)); 
ALTER TABLE EMP1 MODIFY BASIC bigint(6);
CREATE TABLE EMP_trainee (
  Emp_id bigint(2),
  Name VARCHAR(10),
  Basic bigint(6),
  Designation VARCHAR(10),
  Age bigint(2)
);
insert into Student_join values(1, Rohit, 6700, Manager, 24);
insert into Student_join values(2, Sunil, 6200, Engineer, 27);
insert into Student_join values(3, Payal, 6300, Engineer, 25);
insert into Student_join values(4, Kunal, 6700, Trainee, 28);
insert into Student_join values(5, Sunita, 6230, Trainee, 26);
insert into Student_join values(6, Bimal, 7000, Trainee, 25);
insert into EMP_trainee  select * from EMP1 where Designation ='Trainee';
#
ALTER TABLE EMP1 ADD (Skills VARCHAR(10), DOJ DATE);
UPDATE EMP1 SET Skills = 'Java', DOJ = TO_DATE('1999-02-26', 'YYYY-MM-DD')
WHERE ID IN (1, 2, 3);
UPDATE EMP_trainee SET Designation = 'Programmer_Trainee' WHERE Designation = 'Trainee';
UPDATE EMP1 SET Designation = 'Senior Engineer' WHERE Basic > 6300;
ALTER TABLE EMP1 MODIFY ID VARCHAR(5);
SELECT * FROM EMP1;
SELECT * FROM EMP_trainee;
ALTER TABLE EMP1 RENAME COLUMN Age TO Age_in_Years;
DELETE FROM EMP1 WHERE Designation = 'Trainee';
ALTER TABLE EMP_trainee DROP COLUMN Age;
ALTER TABLE EMP_trainee DROP COLUMN Emp_id;
rename table EMP to EMP_Mrg_Engr;
Drop table EMP_trainee;
truncate table EMP_Mrg_Engr;