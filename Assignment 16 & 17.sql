								-- Assignment – 16
								-- Creating Tables and Indexes.
        
        show tables;
       select * from salespeople1;
       
-- 1) Write a command that will enable a user to pull orders grouped by date out of the
-- Orders table quickly.
	create index i_date on orders(odate);
    show indexes from orders;
	
-- 2) If the Orders table has already been created, how can you force the onum field to
-- be unique (assume all current values are unique)?
	alter table orders add primary key(onum);
    desc orders;
    
-- 3) Create an index that would permit each salesperson to retrieve his or her orders
-- grouped by date quickly.
	create index i_date on orders(odate);

-- 4) Let us assume that each salesperson is to have only one customer of a given
-- rating, and that this is currently the case. Enter a command that enforces it.
	Alter table customers add primary key(rating);
    
				
										-- Assignment – 17
										-- Constraining the Values of your data.
                                            
                                            
-- 1) Create the Orders table so that all onum values as well as all combinations of
-- cnum and snum are different from one another, and so that NULL values are
-- excluded from the date field.
	create table orders1(cnum int(4),snum int(4),onum int(4), odate date NOT NULL ,constraint o_PK primary key(cnum,onum,snum));
	show tables;
    
-- 2) Create the Salespeople table so that the default commission is 10% with no
-- NULLS permitted, snum is the primary key, and all names fall alphabetically
-- between A and M, inclusive (assume all names will be uppercase).
	create table salespeople1 (snum int(4) primary key, comm float(4) default 0.10 NOT NULL,
    sname varchar(10) check(substr(upper(sname),1,1) BETWEEN 'A' AND 'M') );
	INSERT INTO salespeople1 (snum,sname) VALUES (30,'N');
    
-- 3) Create the Orders table, making sure that the onum is greater than the cnum, and
-- the cnum is greater that the snum. Allow no NULLS in any of these three fields.
	create table orders2 (onum int(4) NOT NULL,cnum int(4) NOT NULL,snum int(4) NOT NULL ,constraint on_cn_sn check(onum > cnum and cnum > snum));
    INSERT INTO orders2 VALUES(10,10,15);
