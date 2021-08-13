public class MobileShop
{
int disc;
static String name = "LKG"; 
public MobileShop(int price, int disc)
{   
System.out.println(price - disc); 
}
public MobileShop()
{
  this(8000,400); 
System.out.println("Welcome"); 
  
  
}

public static void main(String[] args)
{
MobileShop mobile1 = new MobileShop(); 
MobileShop mobile2 = new MobileShop(10000,500); 
  
}
}
