							--	SQL Exercise 6
use exercise;
show tables;
select * from s;  
select * from sdept;
select * from semp;
select * from p;		
select * from j;
select * from spj;
  
-- 1. Display all the Suppliers with the same Status as the supplier, ‘CLARK’.
	select sname ,status from s where status = (select status from s where sname='CLARK');

-- 2. Display all the Employees in the same department as the employee ‘MILLER’.
	select empname from semp where deptno=(select deptno from semp where empname='MILLER'); 

-- 3. Display all the Parts which have more Weight than all the Red parts.
	select pname ,weight from P where weight > (select max(weight) from p where color='Red');

-- 4. Display all the Projects going on in the same city as the project ‘TAPE’.
	select `j#`,jname,city from j where city =(select city from j where jname='Tape');

-- 5. Display all the Parts with Weight less than all the Green parts.
	select * from p where weight < (select max(Weight) from p where color='Green');

-- 6. Display the name of the Supplier who has sold the maximum Quantity (in one sale).
	select sname,qty from s ,spj where qty=(select max(qty) from spj) and s.`s#` = spj.`s#` ;

-- 7. Display the name of the Employee with the minimum Salary.
	select empno,empname from semp where Basic = (select min(Basic) from semp); 

-- 8. Display the name of the Supplier who has sold the maximum overall Quantity (sum of Sales).
		select distinct s.sname from s,spj 
        where s.`s#` =
        (select tempp.`s#` from 
        (select maxsum.`s#`, max(maxsum.sum_qty) from
        (select `s#`,sum(qty) sum_qty from spj group by `s#` ) 
        as maxsum )
        as tempp) 
        and s.`s#` = spj.`s#` ;
        
	-- 9. Display the name of the Department with the maximum number of Employees.
	select distinct deptname from semp ,sdept
    where semp.deptno =
    (select maxno.deptno from 
    (select temp.deptno, max(temp.no ) 
    from (select deptno,count(empno) no from semp group by deptno) as temp) as maxno) and semp.deptno = sdept.deptno;
--     