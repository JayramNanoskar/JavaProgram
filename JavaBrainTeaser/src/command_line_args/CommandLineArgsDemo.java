package command_line_args;

public class CommandLineArgsDemo {
/**
 * Using command line arguments We can customize behavior of main method
 * Command line arguments are always string type because string is most commonly used data type. We can convert accepted arguments into another type later on.
 * If our command line argument have space in between then we must include that argument within "" else it will treated as single arguments.
 */
	public static void main(String[] args) {
		System.out.println("========= Using command line arguments =========");
		
		//Code Snippet 1
		/**
		 * class Test{
				public static void main(String[] args){
					for(int i=0; i<= args.length; i++){
						System.out.println(args[i]);
					}
				}
			} 
			java Test X Y Z
			//gives runtime exception - ArrayIndexOutOfBound for printing args[3]
		 */
		
		//Code Snippet 2
		/**
		 * class Test{
				public static void main(String[] args){
					String[] argh = {"A", "B", "C"};
					args = argh;
					for(String s : args){
						System.out.println(s);
					}
				}
			} 
			java Test
			java Test X Y
			//gives A B C
		 */
		
		//Code Snippet 3
		/**
		 * class Test{
				public static void main(String[] args){
						System.out.println(args[0]);		
				}
			} 
			java Test Akshay Khanna
			//gives Akshay
			
			java Test "Akshay Khanna"
			//gives Akshay Khanna
		 */
		
		//Code Snippet 4
		/**
		 * class Test{
				public static void main(String[] args){
						System.out.println(args[0]+args[1]); //performing just string concatination	// 1020
						System.out.println(Integer.parseInt(args[0])+Integer.pasrseInt(args[1])); //performing addition	//30
				}
			} 
			java Test 10 20
			//gives 1020
		 */
		
		//Code Snippet 5
		/**
		 * class Test{
				public static void main(String[] args){
						System.out.println(args.length); //getting String array length	// 2
						System.out.println(args[0].length()); //getting String length  //1
						System.out.println(args[1].length()); //getting String length  //5
				}
			} 
			java Test A "    B"
		 */
		
		//Code Snippet 6
		/**
		 * class Test{
			
			}
			
			javac Test.java
			//The code compiles fine. Import, package statements are optional. Compiler won't check whether class contain main method or not.
			//We will get runtime error because JVM will look for main method.

		 */
		
		//Code Snippet 7
		/**
		 * class Test{
				public static void main(String[] args){
						System.out.println("Hello");
						
				}
			}
			javac D:\jayram\Test.java
			java D:\jayram\Test
			
			//gives runtime exception - ClassNotFoundExceeption
			//Compile fine but won't run because 'D:\jayram\Test' class file is not available. 
			//The location where .class files are available should be specified in the classpath
			//java -cp 	D:\jayram Test - This command will work.
		 */
		
	}

}
