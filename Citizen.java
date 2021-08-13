public class Citizen
{
int aadharNo;
String name;
public static void main(String[] args)
{
    Citizen c1 = new Citizen();
    c1.applyAadhar("Abhishek");
    c1.callParents(c1.aadharNo);
    c1.eat(100);




}
public void applyAadhar(String name)
{
   System.out.println(name); 
   aadharNo= 12345;
   System.out.println("Your aadhar card is " + aadharNo); 

}
public void callParents(int aadharNo)
{
       System.out.println("Hello " + aadharNo); 
} 
public int eat(int money)
{
       System.out.println("Money for eating " + money); 
       int bill = 70;
       int balance = money - bill;
       System.out.println("After eating, balace is " + balance); 
       return balance;
}


}
