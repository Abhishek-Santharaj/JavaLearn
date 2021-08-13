public class StaticBlock
{
	public StaticBlock()
	{	System.out.println("Hello from Constructor");}
	
	{
	System.out.println("Hello from non static block");

	}
	{
	System.out.println("Hello from non static block 2");

	}
	static 
	{
	System.out.println("Hello from static block");

	}
	static 
	{
	System.out.println("Hello from static block 2");

	}
public static void main(String[] args)
{
System.out.println("Hello from main(static) method");
	StaticBlock sb1 = new StaticBlock();
	StaticBlock sb2 = new StaticBlock();
	StaticBlock.test();
}
	public static void test()
	{
	System.out.println("Static void test");

	
	}
	
	

}
/* 
Hello from static block
Hello from main(static) method
Hello from non static block
Hello from Constructor */
