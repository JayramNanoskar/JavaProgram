package operator;

public class OperatorDemo {
/**
 * Operators and Assignments
 * 1) Increment and Decrement operator => ++, --
 * 2) Arithmetic operator =>  +, -, *, /, %
 * 3) String concatenation operator => +
 * 4) Relational operator => >, >=, <, <=
 * 5) Equality operator =>  ==, !=
 */
	public static void main(String[] args) {
		System.out.println("======= Increment and Decrement operator ======");
		/**
		 * We cannot use increment/decrement operator on constant values. It applies to variables only.
		 * We cannot use increment/decrement on final variables.
		 * Nesting of increment/decrement operator is not allowed.
		 * Increment/Decrement operator applicable for every primitive type except boolean.
		 * Increment:
			pre increment: y = ++x; //here first 'x' value will get increment & then get incremented value get assign to y 
			post increment: y = x++; //here first 'x' will be assign to y & then 'x' value will get increment 
			
		   Decrement:
			pre decrement: y = --x; //here first 'x' value will get decrement & then get assign to y 
			post decrement: y = x--; //here first 'x' will be assign to y & then 'x' value will get decrement
		 */
		
		//Code Snippet 1
		/**
		 *  int x = 10;
			int y = ++x;
			x-->11 y-->11
			
			int x = 10;
			int y = x++;
			x-->11 y-->10
			
			int x = 10;
			int y = --x;
			x-->9 y-->9
			
			int x = 10;
			int y = x--;
			x-->9 y-->10
		 */
		
		//Code Snippet 2
		/**
		 * class Test{
				public static void main(String[] args){
					int x = 10;
					int y = ++x;
					System.out.println(x+":"+y); //11:11
				}
			}
		 */
		
		//Code Snippet 3
		/**
		 * class Test{
				public static void main(String[] args){
					int x = 10;
					int y = ++10; //compilation error //We cannot use increment/decrement operator on constant values. It applies to variables only.
					System.out.println(x+":"+y); 
				}
			}
		 */
		
		//Code Snippet 4
		/**
		 * class Test{
				public static void main(String[] args){
					int x = 10;
					int y = ++(++x); //compilation error //We cannot use increment/decrement operator on constant values. once we apply operator (++x) it become constant, so again we cannot apply operator ++(++x).
					System.out.println(x+":"+y); 
				} //Nesting of increment/decrement operator is not allowed.
			}
		 */
		
		//Code Snippet 5
		/**
		 * class Test{
				public static void main(String[] args){
					int x = 10; //compilation error if variable is final
					++x; 
					System.out.println(x); //11
				}
			}
		 */
		
		//Code Snippet 6
		/**
		 * class Test{
				public static void main(String[] args){
					var ch = 'a'; 
					System.out.println(++ch); //b - because for increment/decrement operator internally type casting happens. [ ch = (char) ch+1 ]
					var d = 10.5; 
					System.out.println(++d); //11.5
					var b = true; 
					System.out.println(++b); //compilation error
				} //for increment/decrement operator internally type casting happens.
			}
		 */
		
		//Code Snippet 7
		/**
		 * class Test{
				public static void main(String[] args){
					byte b = 127; 
					b++; //It's fine because of internal typecasting even though byte range(-128 to 127) it does lossy compression - internally happens typecasting as [ b = (byte) b+1 ]
					System.out.println(b); //-128
				}
			}
		 */
		
		//Code Snippet 8
		/**
		 * class Test{
				public static void main(String[] args){
					byte b = 127; 
					b++; //It's fine because of internal type casting even though byte range(-128 to 127) it does lossy compression - internally happens type casting as [ b = (byte) b+1 ]
					System.out.println(b); //-128
				}
			}
		 */
		
		//Code Snippet 9
		/**
		 * class Test{
				public static void main(String[] args){
					byte b = 127; 
					b += 1; //It's fine because of internal type casting even though byte range(-128 to 127) it does lossy compression - internally happens type casting as [ b = (byte) b+1 ]
					System.out.println(b); //-128
				}
			}
		 */
		
		System.out.println("======= Arithmetic operator ======");
		/**
		 * If a+b then result type will be -> max(int, type of a, type of b)
		 * So   byte + byte -> int
				byte + short -> int
				short + short -> int
				char + char -> int
				int + long -> long
				float + int -> float
				double + float/any other -> double
		 * Arithmetic exception will be raised only in integral arithmetic but not in floating point arithmetic.
		 * The only operators which causes Arithmetic exception are / and %.
		 */
		
		//Code Snippet 10
		/**
		 * class Test{
				public static void main(String[] args){
					byte a = 12;
					byte b = 20;
					byte c = a + b; //compilation error because int cannot be assign to byte 'c' - when compiler not know the value(i.e. if they can change at runtime) then compiler throws compilation error
					//As a solution we can typecaste it to byte or can take  a, b as a final so they won't change at runtime(given their sum inbetween byte range)
					System.out.println(c); 
				}
			}
		 */
		
		//Code Snippet 11
		/**
		 * class Test{
				public static void main(String[] args){
					System.out.println('a'+'b'); //195 
					System.out.println(10+'b'); //108
					System.out.println('a'+'b'+'c'); //294
				}
			}
		 */
		
		
		/**
		 * Number/Zero = infinity
		 * In integral(byte, short, int, long) mathematics there is no way to represent infinity. So we get runtime exception, Arithmetic exception.
		 * In floating point(float, double) mathematics there is way to represent infinity. So we do not get runtime exception, gets output as infinity.
		 */
		//Code Snippet 12
		/**
		 * System.out.println(10/0); //runtime error - Arithmetic exception - because result is int type
			System.out.println(10.0/0); //Infinity - because result is double type & there we have constant available
			System.out.println(-10.0/0); //-Infinity - because result is double type & there we have constant available
		 */
		
		
		/**
		 * Zero/Zero = undefined
		 * In integral(byte, short, int, long) mathematics there is no way to represent undefined. So we get runtime exception, Arithmetic exception.
		 * In floating point(float, double) mathematics there is way to represent undefined. So we do not get runtime exception, gets output as NaN.
		 */
		//Code Snippet 13
		/**
		 * System.out.println(0/0); //runtime error - Arithmetic exception - because result is int type
			System.out.println(0.0/0); //NaN - because result is double type & there we have constant available
			System.out.println(-0.0/0); //NaN - because result is double type
			System.out.println(0/0.0); //NaN - because result is double type
			System.out.println(Float.POSITIVE_INFINITY/Float.POSITIVE_INFINITY); //NaN 
			
			
			//For Float & Double class we have constant like
			// public static final float POSITIVE_INFINITY;
			//public static final float NEGATIVE_INFINITY;
			// public static final float NaN;
		 */
		
		//Code Snippet 14
		/**
		 * System.out.println(10> Float.NaN); //false
			System.out.println(10< Float.NaN); //false
			System.out.println(10>= Float.NaN); //false
			System.out.println(10<= Float.NaN); //false
			System.out.println(10== Float.NaN); //false
			System.out.println(Float.NaN == Float.NaN); //false
			System.out.println(Float.NaN != Float.NaN); //true
			System.out.println(10 != Float.NaN); //true
		 */
		
		
		System.out.println("======= String concatenation operator ======");
		/**
		 * Java does not allow operator overloading by default.
		 * The only overloaded operator in java is + operator for only two cases, string & number.
		 * i.e. 10+20  and "wel"+"come"
		 * If both arguments are number then '+' acts as a arithmetic addition operator.
		 * If at least one arguments is String type, then '+' operator acts as concatenation operator.
		 */
		
		//Code Snippet 15
		/**
		 * class Test{
				public static void main(String[] args){
					String a = "Hello";
					int b= 10, c= 20, d = 30;
					System.out.println(a+b+c+d); //Hello102030 - first a+b = concatenation 
					System.out.println(b+a+c+d); //10Hello2030
					System.out.println(d+a+(c+b)); //30Hello30
					System.out.println(b+c+d+a); //60Hello
				}
			}
		 */
		
		//Code Snippet 16
		/**
		 * class Test{
				public static void main(String[] args){    
				
				String a = "Hello";
				int b= 10, c= 20, d = 30;
				a = b+c+d; //invalid - cannot assign number to String
				b = a+c+d; //invalid
				a = a+c+d; //valid
				d = b+c+d; //valid}
			}
		 */
		
		//Code Snippet 17
		/**
		 * class Test{
			public static void main(String[] args){
				int a = 10;
				int b = 20;
				System.out.println("a+b="+a+b); //a+b=1020 
				System.out.println("a+b="+(a+b)); //a+b=30 - here (a+b) gets priority
				System.out.println("a+b="+(a)+(b)); //a+b=1020
			}
		}
		 */
		
		//Code Snippet 18
		/**
		 * class Test{
				public static void main(String[] args){
					int a = 10;
					int b = 20;
					System.out.println(a+b+"a+b="+a+b); //30a+b=1020 
					System.out.println((a)+(b)+"a+b="+a+b); //30a+b=1020 
					System.out.println((a)+(b)+"a+b="+(a+b)); //30a+b=30
				}
			}
		 */
		
		
		
		System.out.println("======= Relational operator ======");
		/**
		 * Relational operators are not applicable for boolean type. If we do so gets compilation error immediately.
		 * We cannot apply relational operators for object types.
		 * We can apply relational operators for wrapper classes.
		 * Nesting of relational operators are not allowed.
		 * Relational operators are applicable for any primitive types except boolean. We cannot apply for object types.
		 */
		
		//Code Snippet 19
		/**
		 * class Test{
				public static void main(String[] args){
					Integer i = 15;
					Double d = 15.0;
					System.out.println(i>d); // false
					System.out.println(10>20); // false
					System.out.println('a'>'b'); //false 
					System.out.println(100>'a'); //true
					System.out.println(10<10.0); //false - immediately lower datatype value get promoted to higher .i.e. here int to float
					System.out.println(false<true); //compilation error
					System.out.println("Hi"<"Hello"); //compilation error in case of String object
					System.out.println("Hi".length()<"Hello".length()); //true
					System.out.println(10<20<30<40); //compilation error - nesting operators here - also because true<30 as we cannot use boolean with relational operator
				}
			}
		 */
		
		
		
		System.out.println("======= Equality operator ======");
		/**
		 * Applicable everywhere means for primitives and object types also.
		 * r1==r2 returns true if and only if both reference pointing to same object.
		 * Here we are doing reference/address comparison.
		 * To use equality operator between object reference, compulsory there should be some relation between argument types(either parent to child or child to parent or same type).
		 * If there is no relation then we will get compilation error.
		 * For any object reference r, r==null is always returns false but null==null is always returns true.
		 */
		
		//Code Snippet 20
		/**
		 * class Test{
				public static void main(String[] args){
					System.out.println(10 == 20); // false
					System.out.println('a' == 97.0); //true - immediately lower datatype value get promoted to higher by compiler
					System.out.println(false == false); //true
					System.out.println(10.0 == 10.5); //false 
				}
			}
		 */
		
		//Code Snippet 21
		/**
		 * class Test{
				public static void main(String[] args){
					Thread t1 = new Thread();
					Thread t2 = new Thread();
					Thread t3 = t1;
					
					System.out.println(t1==t2); //false
					System.out.println(t1==t3); //true
				}
			}
		 */
		
		//Code Snippet 22
		/**
		 * class Test{
				public static void main(String[] args){
					Object o = new Object();
					Thread t = new Thread();
					String s = new String("Hi");
					StringBuffer sb = null;
					
					System.out.println(o==t); //false
					System.out.println(t==s); //compilation error
					System.out.println(s==0); //compilation error
					
					System.out.println(o==null); //false
					System.out.println(t==null); //false
					System.out.println(s==null); //false
					System.out.println(sb==null); //true
					System.out.println(null==null); //true
					
				}
			}
		 */
		
		
		System.out.println("======== '==' operator and equals() method  =======");
		/**
		 * Difference between == operator and equals() method
		 * In general, == operator always meant for reference comparison
		 * and equals meant for content comparison.
		 */
		//Code Snippet 23
		/**
		 * class Test{
				public static void main(String[] args){
					String s1 = new String("Hi");
					String s2 = new String("Hi");
					System.out.print(s1 == s2); //false
					System.out.print(s1.equals(s2)); //true
				}
			}
		 */
		
		//Code Snippet 24
		/**
		 * class Test{
				public static void main(String[] args){
					String s1 = new String("Hi");
					String s2 = new String("Hi");
					s1 = s2;
					System.out.print(s1 == s2); //true
					System.out.print(s1.equals(s2)); //true
				}
			}
		 */
		
		
		/**
		 * Object is parent class for String, StringBuffer, StringBuilder classes.
		 * Object class has equals method for reference comparison and String class has overridden equals method for content comparison but StringBuffer/StringBuilder class does not have overridden equals method.
		 * So calling equals method on StringBuffer/StringBuilder will call Object(Parent) class equals method for reference comparison only.
		 * HashCode is sometime based on content, sometime based on address.
		 * Whenever we are overriding equals() method, it is highly recommended to override hashCode() method such that two equivalent objects should have same hashCode.
		 * In String class equals() method is overridden based on content and hence hashCode() method is also overridden based on content.
		 * In StringBuffer/StringBuilder classes, equals() method is not overridden based on content and hence hashCode() method is also not overridden.
		 * If arguments are different types, then equals() method returns false and it won't raise any error.
		 * If there is no relation between argument types, then == operator will raise compile time error.
		 */
		//Code Snippet 25
		/**
		 * class Test{
				public static void main(String[] args){
					StringBuilder sb1 = new StringBuilder("Hi");
					StringBuilder sb2 = new StringBuilder("Hi");
					System.out.print(sb1 == sb2); //false
					System.out.print(sb1.equals(sb2)); //false
				}
			}
		 */
		
		//Code Snippet 26
		/**
		 * class Test{
				public static void main(String[] args){
					String s1 = new String("Hi");
					String s2 = new String("Hi");
					System.out.print(s1 == s2); //false
					System.out.print(s1.hashCode() == s2.hashCode()); //true - String has hashCode based on content
				}
			}
		 */
		
		//Code Snippet 27
		/**
		 * class Test{
				public static void main(String[] args){
					StringBuilder sb1 = new StringBuilder("Hi");
					StringBuilder sb2 = new StringBuilder("Hi");
					System.out.print(sb1 == sb2); //false
					System.out.print(sb1.hashCode() == sb2.hashCode()); //false  - StringBuffer/StringBuilder has hashCode based on address
				}
			}
		 */
		
		//Code Snippet 28
		/**
		 * class Test{
				public static void main(String[] args){
					String s = new String("Hi");
					StringBuilder sb = new StringBuilder("Hi");
					System.out.print(s == sb); //compilation error
					System.out.print(s.equals(sb)); //false
				}
			}
		 */
		
		
	}

}
