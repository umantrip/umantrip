package practicejava;

public class LocalVariable
{
		static void add()
		{
			int a=10;
			int b;
			b=20;
			System.out.println(a+b);
		}
		private String  age;
		private String name;
		private String weight;
	
		void mul()
		{
		    int a=100;
			int b;
			b=200;
			a=40;
			System.out.println("It is a Modulus Value:" +a*b);
		}
		void div(int age, String name, double weight)
		{
			System.out.println("non static values of a person" +age  + name + weight);
		}
		void mod()
		{
			int a1=200;
			int b1=100;
			System.out.println(a1%b1);
		}
		public static void main(String[] args)
		{
			add();
			sub();
			LocalVariable L1=new LocalVariable();
			L1.mul();
			L1.div(15, "Manish", 0.24f);
			L1.mod();
			
	}
		static void sub()
		{
			int a;
			a=10;
			int b=20;
			System.out.println(a-b);
		}
}
