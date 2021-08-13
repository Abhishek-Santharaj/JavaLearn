public class Bank
{
private int minimumBalance =2500;

public int getMinimumBalance()
{
return this.minimumBalance;
}
public void setMinimumBalance(int value)
{
if(value>2500)
this.minimumBalance = value;
}


}
