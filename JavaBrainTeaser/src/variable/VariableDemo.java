package variable;

public class VariableDemo {

	/**
	 * Types of variables
	 * Division 1 - Based on Type: 1)Primitive variable 2)Reference  variable
	 * Division 2 - Based on Behavior/Position of declaration: 1)Instance variable 2)Static variable 3)Local variable
	 */
	public static void main(String[] args) {

		//Unreferenced object will get removed by garbage collector and primitive values get removed by JVM only.

		System.out.println("======== Based on Type: Primitive variable  =========");
		int x = 10;//represent primitive values

		System.out.println("======== Based on Type: Reference  variable  =========");
		Student s = new Student(); //represent reference to an object

		
		System.out.println("======== Based on Behavior/Position of declaration: Instance  variable  =========");
		/**
		 * Value of Instance variable varies from object to object.[For every object different variable copy will be there]
		 * Instance variable will be created at the time of object creation
		 * They will be destroyed at the time of object destruction.
		 * Scope of instance variable is same as object. As long as object is there instance variable will be there.
		 * They get Stored in heap area.
		 * They should be declared within a class directly.
		 * To access instance variable inside static area/method require object
		 * To access instance variable inside non-static/instance area/method don't require object, we can call directly because it take automatically reference of that method calling.
		 * For instance variable we are not require to provide compulsory initialization, JVM will initialize them to default values.
		 */
		
		//Code Snippet 1 
		/**
		 * class Test{
			int a;
			String s;
			boolean b;
			char c;
			public static void main(Sting[] args){
				Test t = new Test();
				System.out.println(a+"-"+s+"-"+b+"-"+c);//compilation error - we cannot access instance variable directly from static area.
				System.out.print(t.a+"-"+t.s+"-"+t.b+"-"+t.c); // 0 null false space(not visible) - gives default values
			}
		}
		 */
		
		System.out.println("======== Based on Behavior/Position of declaration: Static  variable  =========");
		/**
		 * For every object same variable copy will be there.
		 * They are associated with class not with an object.
		 * We cannot declared static variable even inside static method. Static variable must be declared within class directly.
		 * At the time of class loading, static variable will get created.
		 * At the time of class unloading, static variable will get destroyed.
		 * Single class -> Static variable inside same class we can access directly or using class name or using object, within instance area/method & static area/method because they get created at class loading time only.
		 * Multiple class -> Static variable inside another class can be access using class name(most recommended) or using object.
		 * They get stored in method area as .class file get stored in method area only.
		 * For static variable also we are not require to provide compulsory initialization, JVM will initialize them to default values.
		 */
		
		//Code Snippet 2
		/**
		 * public class Test {
			static int x = 10;
			public static void main(String[] args){ //static area
				System.out.println(x); //valid // 10
			}
			public void m1(){ //instance area
				System.out.println(x); //valid
			}
			}
		 */
		
		//Code Snippet 3
		/**
		 * class Test{
			int y = 20;
			static int x = 10;
			public static void main(String[] args){ //static area
				Test t = null;
				System.out.println(t.x); //10 - for static object is not require as it is associated with class only
				System.out.println(t.y); //runtime exception- null pointer exception
			}
		} 
		 */
		
		//Code Snippet 4
		/**
		 * class Test{
			int a = 10;
			static int b = 20;
			public static void main(String[] args){ //static area
				Test t1 = new Test();
				t1.a = 888;
				t1.b = 999;
				Test t2 = new Test();
				System.out.println(t2.a+" "+t2.b); //10 999 - as for each object separate copy of instance variable & same copy of static variable
			}
			}
		 */
		
		
		System.out.println("======== Based on Behavior/Position of declaration: Local  variable  =========");
		/**
		 * Variable those are not declared within class directly (they may be inside any method, constructor etc.)
		 * They get stored in stack area.
		 * For every execution separate copy will be created.
		 * Scope of local variable is like where we declared, there only exist.
		 * For Local variable JVM will not provide default values because they are available for particular scope only.
		 * So programmer need to initialize them explicitly before using that variable else compilation fails.
		 * If we are not using local variable, then we are not required to perform initialization explicitly.
		 * Local variable doesn't have public, private, protected, default, static modifier.
		 * For local variable only final modifier is applicable.
		 */
		
		//Code Snippet 5
		/**
		 * class Test{
			public static void main(String[] args){
				int i = 0;
				for(int j=0; j<3; j++) {
					i=i+j;
				}
				System.out.println(i+" "+j); //compilation error because out of scope local var accessing
			}
		}
		 */
		
		
		//Code Snippet 6
		/**
		 * class Test{
			public static void main(String[] args){
				try {
					int  x = Integer.parseInt("10");
				}
				catch(NumberFormatException e) {
					x =10; //compilation error as it is unreachable scope for local variable
					System.out.println(e);
				}
				System.out.println(x); //compilation error because it is unreachable scope
			
			}
		 */
		
		//Code Snippet 7
		/**
		 * class Test{
			public static void main(String[] args){
				int j;
				System.out.println("Hello"+x); //compilation error
			}
		}
		 */
		
		//Code Snippet 8
		/**
		 * class Test{
			public static void main(String[] args){
				int j;
				if(args.length > 0) {
					j = 10;
				}
				System.out.println(j); //compilation error because there is chance that not all the time we will get that 'j' initialization
			}
		}
		 */
		
		//Code Snippet 9
		/**
		 * class Test{
			public static void main(String[] args){
				
				int j = 10; //normal variable
				int i;
				if(j<5) {
					j = j++;
				}
				else {
					j =j++;
					i= j--;
				}
				System.out.println(i+"-"+j); //compilation error because there is chance that at runtime value of 'j' might change. So possibility of executing if block only and still we are accessing 'i'
				//For normal variable compiler never assume any value, get calculate at runtime so might change
			}
		}
		 */
		
		//Code Snippet 10
		/**
		 * class Test{
			static int i;
			public static void main(String[] args){
				
				int j = 10; //normal variable
				if(j<5) {
					j = j++;
				}
				else {
					j = ++j; //j = 11, i = 0 
					i= --j; //j = 10, i = 10
				}
				System.out.println(i+"-"+j); //10-10
			}
		}
		 */
		
		
		System.out.println("========  Local variable Type inference(LVTI) ========");
		/**
		 * Improves readability, program become simple.
		 */
		
		int[] h = new int[]{10, 20, 30, 40, 50}; //without using LVTI prior JDK 10

		var ha = new int[]{10, 20, 30, 40, 50}; //using LVTI since JDK 1.10 - similar to Java script concept

		var ko = new Integer[]{10, 20, 30, 40, 50}; //we can use primitive in place of wrapper classes & wise-versa because of AutoBoxing, AutoUnboxing came since JDK 1.5

//		var uu = {10, 20, 30, 40, 50}; //compilation error -invalid - not allowed in java, need type on RHS
//		var rt = [10, 20, 30, 40, 50]; //compilation error -invalid
//		var rr = (10, 20, 30, 40, 50); //compilation error -invalid

		var xx = new int[]{10, 20, 30, 40, 50};
		for(int y : xx){
			System.out.print(y); //1020304050
		}
		
		var xy = "welcome";
		System.out.print(xy.getClass().getName());  //java.lang.String
//		xy = true; //compilation error - as once  type defined cannot be change

	}

}

class Student{
	
}
