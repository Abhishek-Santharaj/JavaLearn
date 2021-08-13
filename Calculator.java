public class Calculator
{
int number1=10, number2=2,result;
public  static void main (String[] args)
{

Calculator total = new Calculator();
total.add();
total.sub();
total.mul();
total.div();
}
public void add()
{
    result=number1+number2;
	System.out.println("The addition of two numbers is : " + result);
}
public void sub()
{   
    result=number1-number2;
	System.out.println("The subtraction of two numbers is: " + result);
}
public void mul()
{
    result=number1*number2;
	System.out.println("The multiplication of two numbers is : " + result);
}
public void div()
{
    result=number1/number2;
	System.out.println("The division of two numbers is : " + result);
}
}
