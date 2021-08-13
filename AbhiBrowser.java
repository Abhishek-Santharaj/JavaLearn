public class AbhiBrowser implements Browser, Software
{
public static void main(String[] args)
{
AbhiBrowser ab = new AbhiBrowser();
//System.out.println(ab.click());
System.out.println(AbhiBrowser.version);
System.out.println(AbhiBrowser.category);

//AbhiBrowser.version = 15;


}
public void releaseCode()
{}
public int click()
{
    System.out.println("click");
    return 5;
}
public String type()
{
    System.out.println("type");
    return "Hi";
}
public void rightClick()
{
    System.out.println("right click");


}
public void doubleClick()
{
    System.out.println("Double click");
}


}
