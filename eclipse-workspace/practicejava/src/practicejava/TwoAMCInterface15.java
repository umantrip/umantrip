package practicejava;

//First abstract interface with two abstract methods
interface AMInterface1 {
 void abstractMethod1();
 void abstractMethod2();
}

//Second abstract interface with two abstract methods
interface AMInterface2 {
 void abstractMethod3();
 void abstractMethod4();
}

//Concrete class implementing both interfaces and providing implementations for all abstract methods
class ConcreteClass implements AMInterface1, AMInterface2 {
 public void abstractMethod1() {
     System.out.println("Implementation of abstractMethod1 in ConcreteClass");
 }

 public void abstractMethod2() {
     System.out.println("Implementation of abstractMethod2 in ConcreteClass");
 }

 public void abstractMethod3() {
     System.out.println("Implementation of abstractMethod3 in ConcreteClass");
 }

 public void abstractMethod4() {
     System.out.println("Implementation of abstractMethod4 in ConcreteClass");
 }


 class TwoAMCInterface15
{
 public static void main(String[] args) {
     ConcreteClass obj = new ConcreteClass();

     // Calling methods implemented by the ConcreteClass
     obj.abstractMethod1();
     obj.abstractMethod2();
     obj.abstractMethod3();
     obj.abstractMethod4();
 }
}
}










