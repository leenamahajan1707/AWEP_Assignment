show databases;
use exercise;
show tables;
-- 1. Display the Supplier table in the descending order of CITY.
	select * from s order by city desc;

-- 2. Display the Part Table in the ascending order of CITY and within the city in the ascending order of Part names.
	select * from p order by city,pname;

-- 3. Display all the Suppliers with a status between 10 and 20.
	select * from s where status between 10 and 20;
    
	select * from p;
    
-- 4. Display all the Parts and their Weight, which are not in the range of 10 and 15.
	 select * from p where NOT (weight between 10 and 15);

-- 5. Display all the Part names starting with the letter ‘S’.
		select * from p where Pname like "s%";
     

-- 6. Display all the Suppliers, belonging to cities starting with the letter ‘L’.
	select * from s where city like "L%";

-- 7. Display all the Projects, with the third letter in JNAME as ‘n’.
	select * from j where Jname like "__n%";