package practicejava;

public class AssertPrograminJava //22nd April
{
	static void add(int a, int b) {
        assert a == 100 : "Value of 'a' must be 100"; // Assertion to check if a equals 100
        int sum = a + b; // Perform addition
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        add(100, 200); // Calling the add method
    }
}

    