public class subclass extends superclass {
         
 
    public  void print()
         
    {
        System.out.println("print in subclass.");
     
    }
     
    public static void main(String[] args)
     
    {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
     
    }
 
}
