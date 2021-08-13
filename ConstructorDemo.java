public class ConstructorDemo
{
String s;
public ConstructorDemo()// No -arg constructor
{
this.s =s;
}
public static void main(String[] args)
{
ConstructorDemo c1= new ConstructorDemo("qwerty");
ConstructorDemo c2= new ConstructorDemo();
}


}
// If no constructor is available in the class java compiler provides a default constructor for the object created.
// In java, default constructor is invisible.
