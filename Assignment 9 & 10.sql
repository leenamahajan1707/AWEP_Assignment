use sales;
show tables;
select * from orders;
select * from customers;
select * from salespeople;
-- 1) Write a query that lists each order number followed by the name of the customer
-- who made the order.
	select onum,cname from orders o ,customers c where o.cnum =c.cnum ; 

-- 2) Write a query that gives the names of both the salesperson and the customer for
-- each order along with the order number.
	select sname,cname,onum from salespeople s, customers c,orders o where o.cnum =c.cnum and s.snum=c.snum; 

-- 3) Write a query that produces all customers serviced by salespeople with a
-- commission above 12%. Output the customer’s name, the salesperson’s name,
-- and the salesperson’s rate of commission.
	select cname,sname,comm from customers c,salespeople s where comm>0.12 and c.snum=s.snum;
    
    -- 4) Write a query that calculates the amount of the salesperson’s commission on each
-- order by a customer with a rating above 100.
	select c.cname,s.sname ,o.amt*s.comm as commisssion from orders o , customers c,salespeople s where rating >100 and c.cnum=o.cnum and s.snum=c.snum;
    
							--	Assignment – 10
						--	Joining a Table to Itself.
-- 1) Write a query that produces all pairs of salespeople who are living in the same
-- city. Exclude combinations of salespeople with themselves as well as duplicate
-- rows with the order reversed.
	select distinct s1.sname ,s2.sname from salespeople s1,salespeople s2 where s1.sname < s2.sname and s1.city = s2.city ;

-- 2) Write a query that produces the names and cities of all customers with the same
-- rating as Hoffman.
	select cname ,city from customers where rating=(select rating from customers where cname='Hoffman');
    
	select c1.rating, c1.cname , c2.city 
		from customers c1, customers c2 
		where c1.rating=c2.rating
		group by c1.cname
		having c1.rating = (select rating from customers where cname='Hoffman');

    