package practicejava;


//Abstract class C with 2 concrete methods
abstract class C {
 public void concreteMethod1() {
     System.out.println("Concrete method 1 in class C");
 }

 public void concreteMethod2() {
     System.out.println("Concrete method 2 in class C");
 }

 // Abstract method to be implemented by subclasses
 public abstract void abstractMethod1();

 // Abstract method to be implemented by subclasses
 public abstract void abstractMethod2();
}

//Abstract class CA extending class C with 2 abstract methods and 2 concrete methods
abstract class CA extends C {
 // Concrete implementation of abstractMethod1
 public void abstractMethod1() {
     System.out.println("Abstract method 1 implementation in class CA");
 }

 // Concrete implementation of abstractMethod2
 public void abstractMethod2() {
     System.out.println("Abstract method 2 implementation in class CA");
 }

 // Additional concrete method in class CA
 public void additionalConcreteMethod() {
     System.out.println("Additional concrete method in class CA");
 }
}

//Concrete class implementing class CA
class ConcreteClass extends CA {
 // Implementing abstractMethod1
 public void abstractMethod1() {
     System.out.println("Abstract method 1 implementation in ConcreteClass");
 }

 // Implementing abstractMethod2
 public void abstractMethod2() {
     System.out.println("Abstract method 2 implementation in ConcreteClass");
 }

 // Additional concrete method in ConcreteClass
 public void additionalConcreteMethod2() {
     System.out.println("Additional concrete method 2 in ConcreteClass");
 }
}
public class CAAbstractClass14 {

 public static void main(String[] args) {
     ConcreteClass obj = new ConcreteClass();

     // Calling concrete methods from class C
     obj.concreteMethod1();
     obj.concreteMethod2();

     // Calling abstract methods implemented in class CA
     obj.abstractMethod1();
     obj.abstractMethod2();

     // Calling additional concrete method from class CA
     obj.additionalConcreteMethod();

     // Calling additional concrete method from ConcreteClass
     obj.additionalConcreteMethod2();
 }
}


