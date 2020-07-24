use exercise;
select * from s;   
select * from p;		
select * from j;
select * from spj;

-- 1. Display the minimum Status in the Supplier table.
		select sname,min(status) as status from s;
        
-- 2. Display the maximum Weight in the Parts table.
	select `p#`,max(weight) as weight from p;
    
-- 3. Display the average Weight of the Parts.
	select Avg(weight) from p;
    
-- 4. Display the total Quantity sold for part ‘P1’.
	select count(qty) from spj where `p#`= 'p1' ;
    
-- 5. Display the total Quantity sold for each part.
		select count(qty) from spj group by `p#`;
        
-- 6. Display the average Quantity sold for each part.
		select avg(qty) from spj group by `p#`;
        
-- 7. Display the maximum Quantity sold for each part, provided the maximum Quantity is greater than 800.
		 select `p#`,max(qty) from spj where qty > 8 group by `p#` ;
         
-- 8. Display the Status and the count of Suppliers with that Status.
	select status ,count(status) from s;

-- 9. Display the count of Projects going on in different cities.
	select city,count(*) from j group by city;
-- 10. What is the difference between COUNT(Status) and COUNT(*) ?
	-- count(status)  =>  It wiil not consider NULL values while counting 
-- 	count(*) => It will consider nul values wjile counting 

-- 11. Display the Status and the Count of Suppliers with that Status in the following format as shown below:-
-- Status Count
-- Ten 1
-- Twenty 2
-- Thirty 3

select status, case
  when status=10 then 'Ten'
  when status=20 then 'twenty'
  when status=30 then 'thirty'
  when status=40 then 'fourty'
   when status=50 then 'fifty'
  else 'NA'
  end as word
  from s;


