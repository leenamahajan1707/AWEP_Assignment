use sales;
show tables;

		--			Using the UNION clause.
-- 1) Create a union of two queries that shows the names, cities, and ratings of all customers. 
-- Those with rating of 200 or greater will also have the words “High Rating”, while the others will have the words “Low Rating”.
SELECT cname, city, rating, 'High Rating' 
FROM customers
WHERE rating >= 200
UNION
SELECT cname, city, rating, 'Low Rating'
FROM customers
WHERE rating < 200;

-- 2) Write a command that produces the name and number of each salesperson and each customer with more than one current order. 
-- Put the results in alphabetical order.
-- select salespeople.snum,sname,cnum,count(cnum) as cust from salespeople , orders group by cnum having cust >1;
    select salespeople.snum,customers.cnum,salespeople.sname,customers.cname from customers,salespeople where salespeople.snum=customers.snum and customers.snum In 
     (select snum from customers group by snum having count(snum) >1) order by sname,cname; 


-- 3) Form a union of three queries. Have the first select the snums of all salespeople in San Jose; the second,
-- the cnums of all customers in San Jose; and the third the onums of all orders on October 3. Retain duplicates between the last two queries 
-- but eliminate any redundancies between either of them and the first.
-- (Note: in the sample tables as given, there would be no such redundancy. This is besides the point.)

	select snum from salespeople where city='San Jose'
    union
    select cnum from customers where city='San Jose'
    union
    select onum from orders where odate = '2020-10-3';
    