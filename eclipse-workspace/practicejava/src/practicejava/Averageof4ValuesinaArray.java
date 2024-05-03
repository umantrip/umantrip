package practicejava;

public class Averageof4ValuesinaArray {
	static double average = 0;
	static int sum = 0;
	public static void main(String[] args) {
		// Creating an array of int data type
      //  int[] intArray = {10, 20, 30, 40};
		//int[] intArray = {14, 15, 57, 90};
          int number[]=new int[4];
          number[0]=14;
          number[1]=15;
          number[2]=57;
          number[3]=90;
          
        // Calculating the sum of all elements in the array
       // int sum = 0;
       // for (int i = 0; i < 4; i++) {
        for (int i = 0; i < number.length; i++) {
            sum=sum + number[i];
        }

        // Calculating the average of the four numbers
        double average = (double) sum / 4;

        // Printing the result
        System.out.println("Average of the four numbers: " + average);
    }


	}

