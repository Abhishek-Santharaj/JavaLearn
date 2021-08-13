public class SuperMarket
{
int price,discount; // Non - static field
String brand; //Non-static field
// Object creation - automaticalllly constructore will get called
// Object specific values Intialize

public SuperMarket(int price, int discount, String brand)
{
    this.price = price; // this refers to current instance of same class
    this.discount = discount;
    this.brand =brand;
}
public static void main(String[] args)
{
SuperMarket prod1 = new SuperMarket(100,5,"ABC");
SuperMarket prod2 = new SuperMarket(80,7,"PQR");
SuperMarket prod3 = new SuperMarket(150,20,"BCD");

System.out.println(prod1.price);
System.out.println(prod2.discount);
System.out.println(prod3.brand);

}





}










/*public static void main(String[] args)
{   
    SuperMarket prod1 = new SuperMarket();
    //int purse = prod1.buy(20);

    //System.out.println(purse);
    //prod1.take(prod1.buy(20));
    prod1.buy(20);
    //prod1.take(prod1.buy(21.5));
    prod1.buy(21.5);
    

}
// Method - Input - Datatype - Difference - Separate Method Definitions
// Method Overloading - Polymorphism
// Compile Time Polymorphism (Method Overloading)
public void buy(int amount)
{
        System.out.println(amount);
    //return 123;
} 
public void take(int balance)
{
    System.out.println(balance);
}
public void buy(double amount)
{
    System.out.println(amount);
    int mrp = 12;
    //System.out.println("Balance is " + (amount - mrp));
    //return amount-mrp;
    
}

} */


