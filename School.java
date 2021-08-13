public class School
{
int sTime;
boolean  admissionOn;
public  static void main (String[] args)
{
School assistant = new School();
assistant.admit();
assistant.maintain();
assistant.prepareTestPapers();

}
public void prepareTestPapers()
{
int admissionFees = 45;
System.out.println("Admission Process " + admissionFees);
System.out.println(sTime);
System.out.println(admissionOn);
}
public void admit()
{
    double admissionFees = 75000.0f;
	System.out.println("Admission Process " + admissionFees);
System.out.println(sTime);
System.out.println(admissionOn);
}
public void maintain()
{
	System.out.println("Maintain Record");
System.out.println(sTime);
System.out.println(admissionOn);
}
}
