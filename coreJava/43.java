// 43.	Create a class OneBHK with instance variables roomArea, hallArea and price. Then create
//  default constructor that initializes instance variables with some values and a parameterized 
//  constructor that takes values for all instance variables and stores them in instance variables. 
//  Now create a method named show()  to print OneBHK’s instance variable values.
// Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK 
// and a new instance variable room2Area. Then create default constructor to initialize all 4
//  instance variables and a parameterized constructor to take the values for initialization of
//   all instance variables. Override show() method to print all data member information.
// Write main method in another class (Say Demo) and store three TwoBHK flat’s information and 
// print information using show method. Also print total amount of all flats. 

class OneBHK{
    private double roomArea;
    private double hallArea;
    private double price;
    private static double totalAmount;

    OneBHK(){
        roomArea = 0.0;
        hallArea = 0.0;
        price = 0.0;
        totalAmount = 0.0;
    }

    OneBHK(double roomArea,double hallArea,double price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
        totalAmount = totalAmount + price;
    }

    void show(){
        System.out.println(" roomArea = "+roomArea+" hallArea = "+hallArea+" price = "+price+" totalAmount = "+totalAmount );
    }
}
class TwoBHK extends OneBHK{
    private double room2Area;

    TwoBHK(){
        
        room2Area = 0.0;
    }
    TwoBHK(double roomArea,double hallArea,double price,double room2Area){
         super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }

    void show(){
        super.show();
        System.out.println(" room2Area = "+room2Area);
    }
}

class Demo{
    public static void main(String arg[])
    {
        TwoBHK t1 = new TwoBHK(1.2,3.4,555.0,1.3);
        t1.show();
        TwoBHK t2 = new TwoBHK(3.3,4.4,6.3,1.2);
        t2.show();
        TwoBHK t3 = new TwoBHK(1.1,3.4,333.0,3.4);
        t3.show();
    }
}