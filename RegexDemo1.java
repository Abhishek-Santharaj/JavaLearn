

import java.util.Arrays;

public class RegexDemo1 { {
	String owner; 
	public RegexDemo1(String owner) {
		
		this.owner = owner; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no = {10,5,8,7, 15, 202,5}; 
		String[] names = {"abhishek", "lingesh", "gowrish", "priya"}; 
		ComparatorDemo cd = new ComparatorDemo(); 
		
		Arrays.sort(names, cd);
		


		
		
		
		  for(String i:names) System.out.println(i);
		  
		  

	String n1 = "ab"; 
	String n2 = "bc"; 
	n1.compareTo(n2);
	
	RegexDemo1 rd1 = new RegexDemo1("lingesh"); 
	RegexDemo1 rd2 = new RegexDemo1("lingesh"); 

	}


}
