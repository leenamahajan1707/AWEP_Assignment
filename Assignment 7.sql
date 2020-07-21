use sales;
show tables;
select * from orders;
select * from customers;
select * from salespeople;
-- 1) Write a query that counts all orders for October 3.
	select count(*) "no of orders" from orders where odate='1990-10-3';

-- 2) Write a query that counts the number of different non-NULL city values in the Customers table.
	select count(distinct(city)) city from customers where city is not null;

-- 3) Write a query that selects each customer’s smallest order.
	select min(amt) from orders group by cnum  ;

-- 4) Write a query that selects the first customer, in alphabetical order, whose name begins with G.
	select * from customers where cname like 'G%' order by cname asc limit 1;

-- 5) Write a query that selects the highest rating in each city.
	select city, max(rating) from customers group by city;

-- 6) Write a query that counts the number of salespeople registering orders for each day. (If a salesperson has 
-- more than one order on a given day, he or she should be counted only once.).
	SELECT count(odate),odate FROM orders GROUP BY odate;
    
