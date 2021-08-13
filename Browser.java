 public interface Browser
{

 int version = 10; // static, final
 String category = "browser"; 


  int click(); //private methods are not possible
 String type(); // abstract methods
 void rightClick();
 void doubleClick();



}
