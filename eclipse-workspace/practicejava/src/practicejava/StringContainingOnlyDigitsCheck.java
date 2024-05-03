package practicejava;

public class StringContainingOnlyDigitsCheck //22nd April
{

	public static void main(String[] args)
	{
		        String str1 = "12345"; // Contains only digits
		        String str2 = "abc123"; // Contains both digits and non-digits
		        String str3 = "abc"; // Contains no digits

		        // Check if a string contains only digits
		        if (str1.matches("\\d+")) {
		            System.out.println(str1 + " contains only digits.");
		        } else {
		            System.out.println(str1 + " does not contain only digits.");
		        }
		        
		        // Calculate the length of the string
		        int lengthStr1 = str1.length();
		        System.out.println("Length of " + str1 + " is " + lengthStr1);

		        // Check if a string contains no digits
		        if (str3.matches("\\D*")) {
		            System.out.println(str3 + " contains no digits.");
		        } else {
		            System.out.println(str3 + " contains digits.");
		        }
		        
		        // Calculate the length of the string
		        int lengthStr3 = str3.length();
		        System.out.println("Length of " + str3 + " is " + lengthStr3);
	}

}
