
							-- Assignment – 11
-- 							Subqueries.

use sales;
show tables;
select * from orders;
select * from customers;
select * from salespeople;
-- 1) Write a query that uses a subquery to obtain all orders for the customer named
-- Cisneros. Assume you do not know his customer number (cnum).
	select * from orders where cnum = (select cnum from customers where cname='Cisneros');

-- 2) Write a query that produces the names and ratings of all customers who have
-- above-average orders.
	select cname,rating from customers where rating > (select Avg(rating) from customers);
	
-- 3) Write a query that selects the total amount in orders for each salesperson for
-- whom this total is greater than the amount of the largest order in the table.
	select snum,sum(Amt) from orders group by snum having sum(Amt) > (select max(Amt) from orders);
    
    
							   --  Assignment – 12
							-- Using the operators IN, ANY, and ALL.
                            
-- 1) Write a query that selects all customers whose ratings are equal to or greater than
-- ANY of Serres’.
	 select * from customers where rating >= any (select rating from customers where snum In (select snum from salespeople where sname='Serres' )) ;
	
-- 2) Write a query using ANY or ALL that will find all salespeople who have no
-- customers located in their city.
	select * from salespeople where (snum,city) not in  (select snum,city from customers);
	select * from salespeople where (snum,city) != all (select snum,city from customers);
    
-- 3) Write a query that selects all orders for amounts greater than any for the
-- customers in London.
	select * from orders where amt > any(select amt from orders where cnum In  (select cnum from customers where city ='London')); 
	SELECT * FROM orders WHERE amt> any(SELECT amt FROM customers,orders WHERE customers.cnum = orders.cnum and city='london');
    
-- 4) Write the above query using MIN or MAX.
select * from orders where amt > (select min(amt) from orders where cnum In  (select cnum from customers where city ='London')); 
 SELECT * FROM orders WHERE amt> (SELECT min(amt) FROM customers,orders WHERE customers.cnum = orders.cnum and city='london');
