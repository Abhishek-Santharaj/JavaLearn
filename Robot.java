public class Robot
{
static int height = 6;
int amount = 50;
public static void main(String[] args)
{
Robot ro = new Robot();
ro.buy();
System.out.println(ro.amount);

}
public void buy()
{
System.out.println(amount);
}
}
