package practicejava;

public class StringFunction 
{

	public static void main(String[] args) 
	{
		String name="School";
		String firstname="Manish";
		String lastname ="Tiwari";
		name.length();//return Type is int It will find the length of the string
		System.out.println(name.length());//Output will be 6 as length of the string 
		name.charAt(2);
		System.out.println(name.charAt(2));// Output Will be h as indexing position is 2.
		System.out.println(name.indexOf('c'));//Output will be 1 as index position of c is 1.
		System.out.println(name.indexOf('l'));//output will be 5 as index position of l is 5.
		System.out.println(name.indexOf('S'));//output will be 0 as index position of S is 0.
		System.out.println(name.toUpperCase());//output will be SCHOOL as it converts from Lower to Upper Case
		System.out.println(name.toLowerCase());//output will be SCHOOL as it converts from Upper to Lower Case
		System.out.println(name.concat( " name is Delhi Public School"));//Output concat name School and name of the school as School name is Delhi Public school
		System.out.println(firstname.concat(" ").concat(lastname));//Output will be First name and Lastname space between them.
	    System.out.println(name.contains("ool"));//Output it will check whether the given string is present in the name School if yes!! it returns the boolean vale as true else false.Here it is true
	    System.out.println(name.contains("sch"));//Output False as S is lower case
	    System.out.println(name.contains("cho"));//Output True
	}

}
