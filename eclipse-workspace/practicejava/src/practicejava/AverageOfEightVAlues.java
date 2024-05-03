package practicejava;

public class AverageOfEightVAlues {

	public static void main(String[] args) 
	{
				// Creating an array of int data type
		        int[] intArray = {1, 2, 3, 4};

		        // Creating an array of double data type
		        double[] doubleArray = {1.5, 2.5, 3.5, 4.5};

		        // Calculating the sum of all elements in both arrays
		        int intSum = 0;
		        double doubleSum = 0.0;
		        for (int i = 0; i < 4; i++) {
		            intSum += intArray[i];
		            doubleSum += doubleArray[i];
		        }

		        // Calculating the average of all eight values
		        double intAverage = (double) intSum / 4;
		        double doubleAverage = doubleSum / 4;

		        // Printing the results
		        System.out.println("Average of int array: " + intAverage);
		        System.out.println("Average of double array: " + doubleAverage);
		    }
		

	}


