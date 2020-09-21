// 33.	Write a program to demonstrate functionalities of this keyword in java

import java.util.Scanner;

class Book{
    private int bid;
    private String bname;

    void set(int bid,String bname)
    {
        this.bid = bid;
        this.bname = bname;
    }
    void show()
    {
        System.out.println(bid+" "+bname);
    }
}

class Thisfun{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter book id and book name ");
        int bid = sc.nextInt();
        String bname = sc.next();

        Book b1 = new Book();
        b1.set(bid,bname);
        b1.show();
    }
}