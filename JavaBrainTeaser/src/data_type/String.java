package data_type;

/**
 * Identifiers - Names in Java program. For eg. variable name, method name, class name, label name
 * Rules :
 * 1)Allow characters - a to z, A to Z, 0 to 9, _ and $
 * 2)Identifiers should not start with digit.
 * 3)We cannot use keyword as an identifier. eg. int int = 10; is invalid(int, class etc. are keywords)
 * 4)Identifiers are case sensitive. eg. int Int = 10; is valid
 * 5)All predefined class name, interface name can be used as identifier(but it is not recommended.)
 * 6)No length restriction.
 */
public class String { //using predefined class as Identifiers

//	 static int String = 12; //class/static variable
	 
	 java.lang.String String = "ok"; //instance variable
	 
	/**
	 * Main method always expect predefined String class. 
	 */
	public static void main(java.lang.String[] args) { //Here we need to explicitly specify predefined String class path else gives runtime error main method not found.
		
		System.out.println("Hello");
		
		int Runnable = 15; //using predefined interface as Identifiers
		System.out.println(Runnable); //15
		
		java.lang.String String = "String"; //using predefined class as Identifiers
		System.out.println(String); //string
		
//		System.out.println(new String().String); //printing class variable -> 12
		
		System.out.println(new String().String); //printing instance variable -> ok
	}

}
