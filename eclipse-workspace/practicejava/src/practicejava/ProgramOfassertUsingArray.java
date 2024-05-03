package practicejava;

public class ProgramOfassertUsingArray //22nd April
      {

	/*static void checkArray(int[] arr) {
	     assert arr.length > 0 : "Array must not be empty"; // Asserting that the array is not empty
	        
	        int sum = 0;
	        for (int num : arr) {
	            assert num >= 0 : "Array must contain only non-negative integers"; // Asserting that each element is non-negative
	            sum += num;
	        }
	        
	        System.out.println("Sum of array elements: " + sum);
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40};
	        checkArray(numbers); // Calling the checkArray method with an array containing non-negative integers
	        
	        int[] emptyArray = {};
	        checkArray(emptyArray); // Calling the checkArray method with an empty array
	        */
	static void checkAscendingOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            assert arr[i] <= arr[i + 1] : "Array is not in ascending order"; // Asserting that each element is less than or equal to the next
        }
        
        System.out.println("Array is in ascending order");
    }
	    
	
        public static void main(String[] args) {
	    int[] numbers = {1, 3, 5, 7, 9};
	    checkAscendingOrder(numbers); // Calling the checkAscendingOrder method with an array in ascending order
	    
	    int[] numbers2 = {5, 3, 7, 9, 2};
	    checkAscendingOrder(numbers2); // Calling the checkAscendingOrder method with an array not in ascending order
}
      }
		 

