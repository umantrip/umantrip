package practicejava;

public class Averageof4NosArray87 {

	
    public static void main(String[] args) {
        // Create an array of integers with length 4
        int[] numbers = new int[4];

        // Assign values to the array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;

        // Calculate the sum of the numbers in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Display the result
        System.out.println("Array elements: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3]);
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}
