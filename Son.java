public class Son extends Father
{
int amount = 1000;
public static void main(String[] args)
{
Son s = new Son(); // Object Memory creates in Run time
//System.out.println(s.amount);
s.play();
///s.watchTV();
//s.runHotel();
Father f = new Father();
//f.runHotel();

//Son.test();
//Father.test();




}
public static void test()
{
System.out.println("PQRS");
}
public void runHotel() // Method overriding
{
System.out.println("Running Hotel in son's' way");
}
public void play()
{
// this - current instance of same class
//Father f = new Father();
//System.out.println(f.amount); // curent instance of parent class
System.out.println(super.amount);

// Parent - Super, base     Child - Sub, derived class

super.watchTV();

System.out.println(amount);
System.out.println("Playing Football");

}




}

// In heritance, parent and child classess maintain same method
// Runtime Polymorphism
