package method;

public class MethodDemo {

	/**
	 * Parameter Passing Mechanisms :
	 * 1)If we pass any 'primitive values' to method then those primitive values won't get reflected by any changes performed inside that method.
	 * 2)If we pass any 'object values' to method then those object will get reflected by any changes performed inside that method because we don't get new object just different reference get created and both references point to same object.
	 * Means while passing an objects, Duplicate object reference get created but no new object get created. Both reference points to the same object.
	 * General example for Parameter Passing Mechanisms are 
	 * m1(int 10, int 20)->accepting int
	 * m1(Demo d)->accepting Demo class object
	 * m1(String s)->accepting String object
	 * m1(Student st)->accepting Student object
	 */
	public static void main(String[] args) {
		
		System.out.println("=======  Parameter Passing Mechanisms - Passing primitives ======");
		//Code Snippet 1
		/**
		 * class Test{
			public void m1(int i, int j) {
				i = i+10;
				j = j+20;
				System.out.println("Inside method: "+i+" : "+j); //110 : 220
			}
			public static void main(String[] args) {
				System.out.println("=======  Method ======");
				int i = 100;
				int j = 200;
				Test t  = new Test();
				t.m1(i, j);
				System.out.println("After completing method : "+i+" : "+j); //100 : 200
			}
		}
		 */
		
		//Code Snippet 2
		/**
		 * class Test{
			int x;
			
			Test(int x){
				m1(x);
			}
			
			public void m1(int x) {
				x = 3*x;
				this.x = 4*x;
				System.out.println(x); //30 - local variable
				System.out.println(this.x); //120 - instance variable
			}
			
			public static void main(String[] args) {
				int x = 10;
				Test t  = new Test(10);
				System.out.println(x); //10 - local variable
				System.out.println(t.x); //120 - instance variable
			}
		}
		 */
		
		//Code Snippet 3
		/**
		 * class Test{
			int x;
			
			public int m1(int x) {
				this.x = x+ x*x;
				return x;
			}
			
			public static void main(String[] args) {
				int x = 10;
				Test t  = new Test();
				t.m1(x);
				t.m1(x);
				t.m1(x);
				System.out.println(t.x+" : "+x); //110 : 10
			}
		}
		 */
		
		
		//Code Snippet 4
		/**
		 * class Test{
			int x;
			
			public int m1(int x) {
				this.x = this.x+ x*x;
				return x;
			}
			
			public static void main(String[] args) {
				int x = 10;
				Test t  = new Test();
				System.out.println(t.m1(x)); //10
				System.out.println(t.m1(x)); //10
				System.out.println(t.x+" : "+x); //200 : 10
			}
		}
		 */
		
		System.out.println("=======  Parameter Passing Mechanisms - Passing objects ======");
		//Duplicate object reference get created but no new object get created. Both reference points to the same object.
		
		//Code Snippet 5
		/**
		 * class Demo{
				int x;
				int y;
			}
			class Test{
				int x;
				public void m1(Demo d) {
					d.x =  888;
					d.y = 999;
					System.out.println("Inside method : "+d.x+" : "+d.y); //888 : 999
				}
				public static void main(String[] args) {
					Demo d1 =  new Demo();
					d1.x = 10;
					d1.y = 20;
					Test t = new Test();
					t.m1(d1); //passing object reference
					System.out.println("Inside main method : "+d1.x+" : "+d1.y); //888 : 999
				} 
				//Because both references d1 & d points to same object so value changes in one affects another.
			}
		 */
		
		//Code Snippet 6
		/**
		 * class Book{
				int pages;
				double cost;
				Book(int p, double c){
					this.pages = p;
					this.cost = c;
				}
			}
			class Test{
				int x;
				public void updateBook(Book b, double c) { //creates local reference variable for book pointing same object
					b.pages = 500;
					b.cost = b.cost + c;
				}
				public static void main(String[] args) {
					Book b = new Book(264, 100);
					Test t = new Test();
					t.updateBook(b, 200);
					System.out.println(b.pages +" : "+b.cost); //500 300.0
					double newCost =  400;
					t.updateBook(b, newCost); 
					System.out.println(b.pages +" : "+b.cost); //500 700.0
					System.out.println(b.pages +" : "+newCost); //500 400.0
				} 
			}
		 */
		
		
		System.out.println("========== Main method  ========");
		/**
		 * JVM always looks for main method in our program for execution.
		 * Additionally, it looks for syntax like -> public static void main(String[] args)
		 * If we do not follow same syntax, our program may compile but will get runtime error by JVM.
		 * Compiler won't check for main method prototype but JVM does. So we get error at runtime not at compile time.
		 */
		
		/**
		 * Writing public static void main(String[] args) in different possible ways
		 * 1) we can write 'static public' - altering order is acceptable
		 * 2) String[] args
		 * String []args
		 * String args[]
		 * 3) args - may be any valid identifier
		 * 4) m1(int... x) - vararg method - variable number of arguments - creates 1D array
		 * main(String... args) is acceptable
		 * 5) keyword acceptable -> final, synchronized(allows access to one thread only at a time), strictfp(Follows IEE 754 STD - all floating point calculations gives same results across platform)
		 * 6) Overloading concept is applicable to main method
		 * 7) Recursive method calling gives runtime exception- stack overflow exception but Recursive constructor calling gives compile time error 
		 * 8) Inheritance concept applicable for main method. Hence while executing child class, if child class does not contain main method then parent class main method will be executed.
		 * 9) It seems overriding concept is applicable for main method.
		 * 10) Main method is not mandatory for every java class (bean, POJO)
		 * 11) If class does not contain main method then we will get runtime exception not compile time error.
		 */
		
		
		//Code Snippet 7
		/**
		 * class Test{
			final static synchronized strictfp public void main(String... a){
				System.out.println("Valid main method"); //completely valid 
			}
		}
		 */
		
		
		//Code Snippet 8
		/**
		 * class Test{
			final static synchronized strictfp public void main(String... a){
				System.out.println("Valid main method"); //completely valid 
			}
			final static synchronized strictfp public void main(Object... a){
				System.out.println("Valid object main method"); //completely valid 
			}
		}
		 */
		
		//Code Snippet 9
		/**
		 * class Test{
			final static synchronized strictfp public void main(String... a){
				System.out.println("Valid main method"); 
				main(new String[]{"A", "B", "C"}); //recursive method calling
			}
			final static synchronized strictfp public void main(Object... a){
				System.out.println("Valid object main method");
			}
		}
		 //gets runtime exception- StackOverFlow exception on recursive method calling
		 */
		
		
		//Code Snippet 10
		/**
		 * Test.java main class
			class Parent{
				public static void main(String args[]){
					System.out.println("Parent main method");
				}
			}
			 class Child extends Parent{
			 
			 }
			
			javac Test.java
			java Child
			O/P: Parent main method
		 */
		
		//Code Snippet 11
		/**
		 * Test.java
			class Parent{
				public static void main(String args[]){
					System.out.println("Parent main method");
				}
			}
			 class Child extends Parent{
				public static void main(String args[]){
					System.out.println("Child main method");
				}
			 }
			
			javac Test.java
			java Child
			o/p: Child main method
		 */
		
		//Code Snippet 12
		/**
		 * class Test{
			static{
				System.ouy.println("static block");
			}
		}
		//gets runtime error
		//First JVM checks for main method availability and then only load the .class file.
		//static block won't get execute because to start program execution main method is mandatory. 
		 */
		
	}

}
