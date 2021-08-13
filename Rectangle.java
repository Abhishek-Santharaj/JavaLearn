class Rectangle
{
int area;
public static void main(String[] args)
{
Rectangle obj1=new Rectangle(15, 25);
obj1.show();
Rectangle obj2=obj1;
obj2.show();
}
Rectangle(int height, int width)
{
area=height*width;
}
void show()
{
System.out.println("Area of Rectangle is " + area);
}
}
