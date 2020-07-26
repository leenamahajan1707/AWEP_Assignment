use exercise;
select * from s;   
select * from p;		
select * from j;
select * from spj;

-- 1. Display the Supplier name and the Quantity sold.
	select Sname,Qty from S,SPJ where S.`S#`=SPJ.`S#`;
    
-- 2. Display the Part name and Quantity sold.
		select pname,qty from P,SPJ where P.`P#` = SPJ.`P#`;
        
-- 3. Display the Project name and Quantity sold.
	select jname ,qty from J,SPJ where J.`J#` = SPJ.`J#`;
    
-- 4. Display the Supplier name, Part name, Project name and Quantity sold.
	select sname,pname,jname ,qty from S,P,J,SPJ where J.`J#` = SPJ.`J#` and S.`S#`=SPJ.`S#` and P.`P#` = SPJ.`P#` ;
	
-- 5. Display the Supplier name, Supplying Parts to a Project in the same City.
	select Pname,Jname,Sname,S.city from S,P,J,SPJ where S.city=J.city and SPJ.`J#`=J.`J#` and S.`S#`=SPJ.`S#` and P.`P#`= SPJ.`P#` ;  

-- 6. Display the Part name that is ‘Red’ is color, and the Quantity sold.
	select p.pname ,spj.qty from p,spj  where color='red' and qty >=1 and P.`P#`= SPJ.`P#`;

-- 7. Display all the Quantity sold by Suppliers with the Status = 20.
	select SPJ.qty, S.`S#` from SPJ,S where S.`S#`=SPJ.`S#` and status = 20;

-- 8. Display all the Parts and Quantity with a Weight > 14.
		select pname,qty,weight from p,spj where p.`P#`= spj.`P#` and weight > 14;
        
-- 9. Display all the Project names and City, which has bought more than 500 Parts.
	select jname ,city from j,spj where spj.`J#`=j.`J#` and qty >500; 
    
-- 10. Display all the Part names and Quantity sold that have a Weight less than 15.
	select p.pname ,spj.qty from p,spj where weight < 15 and p.`P#`= spj.`P#`;
    
    
