CREATE DATABASE Lab;
use lab;
CREATE TABLE CUSTOMER (Cust_id varchar(3), Fname varchar(15), Lname varchar(15),
Area varchar(5), Phone bigint(10),DOB date, Payment double(6,2));

insert into customer values 
('A01' ,'Ivan ','Ross' ,'SA', 6125467,'1986-01-15' ,800.50), 
('A02' ,'Vandana','Ray', 'MU' ,5560379,'1987-12-20' ,1000.75), 
('A03' ,'Pramada ','Jauguste', 'DA' ,4560389,'1967-07-25' ,500.00),
('A04' ,'Basu', 'Navindi', 'BA', 6125401,'1956-02-28' ,860.00), 
('A05' ,'Ravi' ,'Shridhar' ,'NA' ,null ,'1989-02-15',500.50), 
('A06' ,'Rukmini' ,'Aiyer','GH', 5125274,'1987-07-23' ,1500.50); 

# update dob
update customer set dob = '1999-08-01' where Cust_id='A03';
update customer set dob = '1979-6-15' where Cust_id='A05';
# update phone number
update customer set Phone ='9999999' where Cust_id='A02';   
update customer set Phone ='98989898' where Cust_id='A04';  

# delete two rows from table 
DELETE FROM customer WHERE Cust_id ='A01';
DELETE FROM customer WHERE Cust_id ='A05';
#delete all rows 
truncate table customer;

# insert 5 new records 
insert into customer values 
('A11' ,'Mukul','kumar' ,'ND', 6125467,'2000-01-15' ,1800.50), 
('A12' ,'Vaibhav','Kumar', 'UP' ,5560379,'1999-12-20' ,1900.75), 
('A13' ,'Tushar','Singh', 'HP' ,4560389,'2000-07-25' ,1500.00),
('A14' ,'Saurav', 'kumar', 'UK', 6125401,'2000-02-28' ,1860.00), 
('A15' ,'Arvind' ,'Mathur' ,'NE' ,null ,'1999-02-15',1500.50);
# Update one record based 
update customer set dob = '2001-08-01' where Cust_id='A12';
# Delete any 1 record from the table
delete from customer where fname='Vaibhav';