package practicejava;

public class MMethodOverloading90 
{
	// Overloaded main method with no parameters
    public static void main() {
        System.out.println("Inside main() method with no parameters.");
    }

    // Overloaded main method with a single String array parameter
    public static void main(String[] args) {
        System.out.println("Inside main(String[] args) method.");
        // You can access command-line arguments through the 'args' parameter
        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
        main(); // Invokes main() with no parameters
       
        main(10); // Invokes main(int value) with an integer argument
        main(5.5); // Invokes main(double value) with a double argument
        main("Hello", "Simba"); // Invokes main(String arg1, String arg2) with two string arguments
        main(args, 20); // Invokes main(String[] args, int value) with command-line arguments and an additional value
        main("Test", 15); // Invokes main(String arg1, int value) with a string argument and an additional value
    }
    

    // Overloaded main method with a different parameter type
    public static void main(int value) {
        System.out.println("Inside main(int value) method with value: " + value);
    }

    public static void main(double value) {
        System.out.println("Inside main(double value) method with value: " + value);
    }

    public static void main(String arg1, String arg2) {
        System.out.println("Inside main(String arg1, String arg2) method.");
        System.out.println("Arguments: " + arg1 + ", " + arg2);
    }

    public static void main(String[] args, int value) {
        System.out.println("Inside main(String[] args, int value) method.");
        System.out.println("Number of arguments: " + args.length);
        System.out.println("Additional value: " + value);
    }

    public static void main(String arg1, int value) {
        System.out.println("Inside main(String arg1, int value) method.");
        System.out.println("Argument: " + arg1);
        System.out.println("Additional value: " + value);
    }

    
        
}

