package practicejava;

import java.util.Date;

public class DateClassPr_Past_Future {

	public static void main(String[] args) 
	{
		Date d1=new Date();//It is a predifined class as scanner class
		System.out.println("Present Time: " + d1);//Prints or display the present time of the System
		String input=d1.toString();//Return Type is string and coming from date class
		//System.out.println((input.substring(4, 7)));
		String month=input.substring(4, 7);
		System.out.println("Displays the month: "+month);
		String date=input.substring(8, 10);
		System.out.println("Displays the Date: "+date);
		String year=input.substring(24);
		System.out.println("Displays the Year: "+year);
		//String year1=input.substring(input.length()-4);
		//System.out.println(year1);
		System.out.println("Displays the Present Date: " + date.concat(" ").concat(month).concat(" ").concat(year));
		System.out.println("Displays the current Date with Seperator: "+ date.concat("-").concat(month).concat("-").concat(year));
		System.out.println("Displays the current Date with Seperator: "+ date.concat("/").concat(month).concat("/").concat(year));


	}

}
