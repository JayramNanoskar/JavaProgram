package lvti;

public class LVTIDemo {
/**
 * LVTI(Local Variable Type Inference) since Java 10
 * Type inference - automatic detection/identification of data type by compiler based on provided value.
 * Until java 9, for local variables we have to declare the type explicitly. But from java 10 version onwards, we are not required to declare type explicitly.
 * Based on our provided value, the type will be considered automatically by the compiler. This concept is Local Variable Type Inference.
 * We are not required to specify the type multiple times. It reduces length of code and readability will be improved.
 * It is more convenient to the programmer.
 */
	public static void main(String[] args) {

		System.out.println("======== Local Variable Type Inference ========");
		
		//Code Snippet 1
		/**
		 * class Test{ //Until Java 9
			public static void main(String[] args){
				String s = "Hello"; //declaring data type explicitly
				System.out.println(s);
				
				ArrayList<Interger> al = new ArrayList<Integer>(); //declaring data type explicitly
				System.out.println(al.size());
			}
		}
		 */
		
		//Code Snippet 2
		/**
		 * class Test{ //Since Java 10
			public static void main(String[] args){
				var s = "Hello"; //inferring data type implicitly
				System.out.println(s);
				
				var al = new ArrayList<Integer>(); //inferring data type implicitly
				System.out.println(al.size());
			}
		}
		 */
		
		
		/**
		 * Usage of LVTI
		 * 1) We can use local variables inside method.
		 * 2) We can use local variables inside static/instance block.
		 * 3) We can use local variables as iteration variable inside for-each loop.
		 * 4) We can use local variables as loop index variable.
		 * 5) We can use var as a local variables to return value inside a method and to store method return values.
		 */
		
		//Code Snippet 3
		/**
		 * class Test{
				public static void main(String[] args){
					var i = 10; //inferring data type implicitly
					System.out.println(i); //10
				}
			}
		 */
		
		//Code Snippet 4
		/**
		 * class Test{
				static{
					var x = 'a';
					System.out.println(x);
				}
				public static void main(String[] args){
					System.out.println("Welcome");
				}
			}
		 */
		
		//Code Snippet 5
		/**
		 * class Test{
				public static void main(String[] args){
					var x =  new int[]{10, 20, 30};
					for(var x1 : x){
						System.out.println(x1);
					}
					System.out.println(x.getClass().getName()); //[I
				} 
			}
		 */
		
		//Code Snippet 6
		/**
		 * class Test{
				public static void main(String[] args){
					var x =  new int[]{10, 20, 30};
					for(var i = 0; i<x.length; i++){
						System.out.println(i);
					}
				} 
			}
		 */
		
		//Code Snippet 7
		/**
		 * class Test{
				public static int m1(){
					var x = 10;
					return x;
				}
				public static void main(String[] args){
					var y = m1();
					System.out.println(y); //10
				} 
			}
		 */
		
		
		/**
		 * LVTI Error cases 
		 * 1) We can use LVTI only for local variable but not for instance variables and static variables. If we are trying to for instance and static variables then we will get compilation error.
		 * 2) We cannot use LVTI for uninitialized local variable. 
		 * 3) For null value variables we cannot use var because null is allowed to any object type. Hence compiler cannot guess type uniquely.
		 * 4) We cannot use var for method parameter type, because compiler cannot guess the type as values will come at runtime. 
		 * 5) For method return type we cannot use var.
		 * 6) transient variable are class level variables. So we cannot use var with them.
		 */
		
		//Code Snippet 8
		/**
		 * class Test{
					var x = 10; //LVTI for instance variable -compilation error 
					static var y = 20; //LVTI for static variable - compilation error 
				
			}
		 */
		
		//Code Snippet 9
		/**
		 * class Test{
				public static void main(String[] args){
					var x ; //LVTI for local variable -compilation error because need to initialized it to infer data type.
				}
			}
		 */
		
		//Code Snippet 10
		/**
		 * class Test{
				public static void main(String[] args){
					var x = null; //-compilation error because need to initialized it except null to infer data type.
				}
			}
		 */
		
		//Code Snippet 11
		/**
		 * class Test{
				public static void main(String[] args){
					
				}
				public void m2(var y){ //compilation error .
				
				}
			}
		 */
		
		//Code Snippet 12
		/**
		 * class Test{
				public static var m2(){ //compilation error .
				
				}
			}
		 */
		
		//Code Snippet 13
		/**
		 * class Test{
				public static void m2(){ //compilation error .
					var var = 10; //valid declaration
					var x = null; //invalid
					var if = 10.5; //invalid
					var _ = 10; //invalid
					var y; //invalid
					
					var x2; 
					x = 10; //invalid
					
					int[] a = {10, 20, 30}; //valid
					var b = {10, 20, 30}; //invalid
					var x1 = {"A", "B", "C"}; //invalid
					var c = new int[]{10, 20, 30}; //valid
					var d = new int[3]{10, 20, 30}; //invalid
					var e = new int[3]; //valid
				}
			}
		 */
		
		//Code Snippet 14
		/**
		 * class Test{
				public static void main(String[] args){ 
					int if = 20;
					System.out.println(if); //compilation error because 'if' keyword is checked at compile time & also runtime
					
					var var = 10;
					System.out.println(var); //completely fine because 'var' keyword is just checked at compile time & not runtime
				}
			}
			//var concept applicable only at compile time but not at runtime. Hence var is not required to be keyword in java.
			//So we can use var can be use as identifier in java.
		 */
		
		//Code Snippet 15
		/**
		 * class Test{
				public static vaoid main(String[] args){ 
					int _x = 20;
					System.out.println(_x); //completely fine 
					var __x = 10;
					System.out.println(__x); //completely fine 
					var _ = 1000;
					System.out.println(_); //compilation error because since java 9 '_' is keyword. So alone it cannot be used.	
				}
			}
		 */
		
		//Code Snippet 16
		/**
		 * class Test{
				public static void main(String[] args){ 
					int _x = 20;
					System.out.println(_x); //completely fine 
					var __x = 10;
					System.out.println(__x); //completely fine 
					var _ = 1000;
					System.out.println(_); //compilation error because since java 9 '_' is keyword. So alone it cannot be used.	
				}
			}
			javac -source 1.8 Test.java - will give warning only but program will run.
		 */
		
		//Code Snippet 17
		/**
		 * class Test{
				public static void main(String[] args){ 
					public void m1(var x){ //invalid as method parameter cannot be var
			
					}
			
					public var m11(var y){ //invalid as method return type cannot be var
			
					}
			
					public void m111(var z){ //invalid as void method is returning
						var z = 10;
						return z;
					}
			
					public int m1111(var p){ //invalid method declaration
						var p = 10;
						return p;
					}
			}
		 */
		
		//Code Snippet 18
		/**
		 *  import java.util.ArrayList;
			import java.util.LinkedList;
			
			class Student{
				String name;
				int rollno;
				Student(String name, int rollno){
					this.name = name;
					this.rollno = rollno;
				}
				public String toString(){
					return "Name: "+this.name+",Roll No:"+this.rollno;
				}
			}
			
			class Test{
			//	static var students = new LinkedList<Student>(); 	//line-1 //compilation error
				public void info(){ 									//line-2 //compilation error if used var
					var s = new Student("Chinny", 101); 			//line-3 //fine
					var students = new ArrayList<>(); 				//line-4 //fine //creates arraylist of object type because we are not specifying student type explicitly on RHS
					students.add(new Student("Sunny", 101)); 
					students.add(new Student("Binny", 102));
					for(var student : students){ 					//line-5 //fine
			//			System.out.println("Name: "+student.name+"Roll No: "+student.rollno);//by commenting toString method and using student type on line-4 //by using dimond operator(<>) only
						System.out.println(student); //we cannot access properties as it it just object
			
						Student s1 =  (Student)student; //type casting to student so we can access properties
						System.out.println("Name: "+s1.name+"Roll No: "+s1.rollno); //by using dimond operator(<>) only on line-4
					}
				}
				
				public static void main(String[] args){
					Test t = new Test();
					t.info();
				}
			}
		 */
		//When we try to print any object reference, internally toString() will get called.
	}

}
