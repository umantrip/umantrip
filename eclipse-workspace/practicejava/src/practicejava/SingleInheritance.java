package practicejava;


	// Parent class
	class parentclass {
	    void parentMethod()
	    {
	        System.out.println("This is parent1 method.");
	    }
	}

	// Child class inheriting from Parent class
	class childclass extends parentclass {
	    void childMethod() {
	        System.out.println("This is child method.");
	    }
	}

	public class SingleInheritance 
	{
	
	    public static void main(String[] args) {
	        // Creating an object of Child class
	        childclass c1= new childclass();

	        // Calling methods from parent class
	        c1.parentMethod();

	        // Calling method from child class
	        c1.childMethod();
	    }
	}

	


