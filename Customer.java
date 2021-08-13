public class Customer
{
int b; // 0
byte by; // 0
short sh; // 0
long l; // 0
float fl; // 0.0
double d; // 0.0
char ch;
boolean bl;
String s; // Non Primitive Datatype

public static void main(String[] args)
{
//int a; // local varaiable might not have been initalized
Customer c = new Customer();
c.buy(100);
c.travel(100, 20.5);

/*System.out.println(c.b); 
System.out.println(c.by);
System.out.println(c.sh);
System.out.println(c.l);
System.out.println(c.fl);
System.out.println(c.d);
System.out.println(c.ch);
System.out.println(c.bl);
System.out.println(c.s);*/

}
public void buy(int cash)
{
System.out.println("Buying for " + cash);

}
public void travel(int busFare,double snacksCash)
{
System.out.println("Ticket is " + busFare + ", Bought snacks for " + snacksCash);

}
}
