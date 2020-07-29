create table pl_output
(
	fir float(7,2),
    sec float(7,2)
);

create table tempp
(
	fir int(4),
    sec varchar(15)
);

show tables;
select * from pl_output;


-- 1. Write a program that computes the perimeter and the area of a rectangle. Define
-- your own values for the length and width. (Assuming that L and W are the length
-- and width of the rectangle, Perimeter = 2*(L+W) and Area = L*W.
	delimiter //
    create procedure abc()
	begin
		declare L int(4) default 5;
        declare w int(4) default 6;
        declare area float(5,2);
        declare perimeter float(5,2);
        set area=L*W;
        set perimeter = 2*(L+W);
        insert into tempp values(area,'Area');
        insert into tempp values(perimeter,'Perimeter');
    end;// 
    delimiter ;
    
    call abc();
    select * from tempp;
    drop procedure abc;
    show procedure status where db='demouser';
    
    
-- 2. Write a program that declares an integer variable called num, assigns a value to it,
-- and computes and inserts into the tempp table the value of the variable itself, its
-- square, and its cube.

	delimiter //
    create procedure abc()
	begin
		declare num int(4) default 5;
        declare squre int(4);
        declare cube1 int(4);
        set squre = num * num;
        set cube1 = num * num * num;
        insert into tempp values(squre,'Squre');
        insert into tempp values(cube1,'Cube');
    end;// 
    delimiter ;
    
    call abc();
    
    select * from tempp;
    
    drop procedure abc;
    show procedure status where db='demouser';

    
    

-- 3. Convert a temperature in Fahrenheit (F) to its equivalent in Celsius (C) and vice
-- versa. The required formulae are:- C= (F-32)*5/9
-- F= 9/5*C + 32

	delimiter //
    create procedure abc()
	begin
		declare F int(7) default 12;
        declare C int(5) default 3;
        declare farh double(7,4);
         declare celc double(7,4);
        set farh = 9/5*C + 32;
        set celc = (F-32)*5/9;
        insert into tempp values(farh,'Fahrenheit');
        insert into tempp values(celc,'Celsius');
    end;// 
    delimiter ;
    
    call abc();
    
    select * from tempp;
    
    drop procedure abc;
    show procedure status where db='demouser';


-- 4. Convert a number of inches into yards, feet, and inches. For example, 124 inches
-- equals 3 yards, 1 foot, and 4 inches.
	delimiter //
    create procedure abc(inch int)
	begin
		declare yard float(7,2) ;
        declare inch float(7,4) ;
        declare feet float(7,4);
         
        set yard = inch/36;
        set feet = (inch % 36)/12;
        set inch= inch*1;
        insert into tempp values(yard,'yard');
        insert into tempp values(feet,'feet');
         insert into tempp values(inch,'inches');
    end;// 
    delimiter ;
    
    call abc(124);
    
    select * from tempp;
    
    drop procedure abc;
    show procedure status where db='demouser';


-- 5. Write a program that enables a user to input an integer. The program should then
-- state whether the integer is evenly divisible by 5.
	delimiter //
    create procedure abc(x int)
	begin
        if (x % 5 = 0) then
        insert into tempp values(x,'divisible');
        else
        insert into tempp values(x,'not-divisible');
		end if;
    end;// 
    delimiter ;
    
    call abc(26);
    
    select * from tempp;
    
    drop procedure abc;
    show procedure status where db='demouser';


-- 6. Your block should read in two real numbers and tell whether the product of the two
-- numbers is equal to or greater than 100. 

	delimiter //
    create procedure abc()
	begin
		declare num1 float(4,2) default 12.1;
        declare num2 float(4,2) default 9.2;
        declare mul double(7,4);
        set mul = num1* num2;
        if (mul > 100) then
			insert into tempp values(mul,'greater');
        elseif(mul<100) then
			insert into tempp values(mul,'small');
        else 
			insert into tempp values(mul,'equal');
		end if;
    end;// 
    delimiter ;
    
    call abc();
    
    select * from tempp;
    
    drop procedure abc;
    show procedure status where db='demouser';
