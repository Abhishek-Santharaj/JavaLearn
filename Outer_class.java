abstract class AnonymousInnerClass {
   public abstract void testmethod();
}

public class Outer_class {

   public static void main(String args[]) {
      AnonymousInnerClass inner = new AnonymousInnerClass() {
         public void testmethod() {
            System.out.println("This is an example of anonymous inner class");
         }
      };
      inner.testmethod();	
   }
}