package practicejava;

class Parent 
{
    public void main1() 
    {
        System.out.println("Main method in Parent class");
    }

	public void main2() {
		// TODO Auto-generated method stub
		
	}
}

class Child extends Parent 
{
    @Override
    public void main2() {
        System.out.println("Main method in Child class");
    }

    public class MmOvr91 
    {


    public static void main(String[] args) {
        Child child = new Child();
        // Invoking main method defined in Child class
        child.main2();
        
        // Invoking main method defined in Parent class
        Parent p1 = new Parent();
        p1.main1();
    }
}
}







