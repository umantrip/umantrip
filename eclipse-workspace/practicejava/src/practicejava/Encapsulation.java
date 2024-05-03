package practicejava;

public class Encapsulation
{
	 private String name;
	    private int age;

	    // Getter method for name
	    public String getName()
	    {
	        return name;
	    }

	    // Setter method for name
	    public void setName(String name) 
	    {
	        this.name = name;
	    }

	    // Getter method for age
	    public int getAge() 
	    {
	        return age;
	    }

	    // Setter method for age
	    public void setAge(int age) {
	        if (age >= 0) {  // Checking for valid age
	            this.age = age;
	        } else {
	            System.out.println("Age cannot be negative.");
	        }
	    }
	 // Main method to test the EncapsulationDemo class
	    public static void main(String[] args) {
	        Encapsulation obj = new Encapsulation();

	        // Setting values using setter methods
	        obj.setName("John");
	        obj.setAge(30);

	        // Getting values using getter methods
	        System.out.println("Name: " + obj.getName());
	        System.out.println("Age: " + obj.getAge());

	        // Trying to set invalid age
	        obj.setAge(-5); // This will print "Age cannot be negative."

	        // Accessing variables directly (which violates encapsulation)
	        // obj.name = "Jane"; // This would be an error since 'name' is private
	        // obj.age = 25;      // This would be an error since 'age' is private
	    }
	}
	


   

    