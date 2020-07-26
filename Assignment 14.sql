
											-- Assignment – 14
											-- Entering, Deleting, and Changing Field Values.

use sales;
show tables;
select * from orders;
select * from customers;
select * from salespeople;
                                            
-- 1) Write a command that puts the following values, in their given order, into the salespeople table: city – San Jose, 
-- name – Blanco, comm – NULL, cnum – 1100.
	INSERT INTO salespeople (city,sname,comm,snum) VALUES('San Jose','Blanco',NULL,1100);


-- 2) Write a command that removes all orders from customer Clemens from the Orders table.
	delete from orders where cnum In (select cnum from customers where cname='Clemens'); 

-- 3) Write a command that increases the rating of all customers in Rome by 100.
	UPDATE customers SET rating=rating+100 where city='Rome';

-- 4) Salesperson Serres has left the company. Assign her customers to Motika.
	UPDATE customers SET snum=(SELECT snum FROM salespeople WHERE sname='Motika')
	WHERE snum = (SELECT snum FROM salespeople WHERE sname='serres');