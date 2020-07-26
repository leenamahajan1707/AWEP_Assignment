									-- Assignment – 15
									-- Using Subqueries with DML Commands.
                                    
use sales;
show tables;
select * from orders;
select * from customers;
select * from salespeople;                                    
                                    
-- 1) Assume there is a table called Multicust, with all of the same column definitions as Salespeople. 
-- Write a command that inserts all salespeople with more than one customer into this table.

	create table Multicust
	as
    select * from customers where snum IN (select snum from customers group by snum having count(snum) >1 ); 
        
-- 2) Write a command that deletes all customers with no current orders.

		delete from customers where cnum = any (select cnum from customers where cnum not In (select cnum from orders));

-- 3) Write a command that increases by twenty percent the commissions of all salespeople with total orders above Rs. 3,000.
	update salespeople set comm= (1.20 * comm) where snum In (select snum from orders where amt >  3000);

