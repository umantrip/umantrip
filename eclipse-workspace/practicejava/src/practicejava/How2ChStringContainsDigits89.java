package practicejava;

public class How2ChStringContainsDigits89 {

	public static void main(String[] args) {
        String str = "12345";
        
        // To Check if all characters are digits
        boolean allDigits = true;
        
        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the character at index i is a digit
            if (!Character.isDigit(str.charAt(i))) {
                allDigits = false;
                break; // Exit the loop if a non-digit character is found
            }
        }
        
        if (allDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains non-digit characters.");
        }
    }
}
	
	
	
	
	
	
	
	
	
	
	


    