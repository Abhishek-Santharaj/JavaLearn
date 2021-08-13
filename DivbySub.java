import java.util.Scanner; 
class DivbySubs
{
static float count;
public static void main(String[] args)
{
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    int number = myObj.nextInt(); 
    int divisor = myObj.nextInt(); 

    


if(divisor==0)
    {
        System.exit(0);
        
    }
    else
    {
        while(number>=divisor)
        {
            number=number-divisor;
            count++;
            
        }}
    
    
    System.out.println("Ans is " + count);
    


}}
