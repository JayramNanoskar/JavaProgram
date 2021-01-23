package data_type;

/**
 * Data Types - Total 8 primitive data types
 * ->Numeric data types
 * 		->Integral(to represent whole number)
 * 			->1)byte
 * 			->2)short
 * 			->3)int
 * 			->4)long
 * 				byte < short < int < long
 * 		->Floating point(to represent number with decimal values)
 * 			->5)float
 * 			->6)double
 * 				float < double
 * ->Non-Numeric data types
 * 			->7)boolean
 * 			->8)char
 */
public class LiteralDemo {
	
	static String s;
	static boolean bool;
	
	public static void main(java.lang.String[] args) {
		
		System.out.println("==========Using literals=========");
		
		byte b =127;
//		byte b =128; //compilation error because of exceed in range
		System.out.println(b); //127
		
		System.out.println(s); //null - default value for object
		
		System.out.println(bool); //false - default value for boolean
		
		
		System.out.println("==========Integral literal=========");
		/**
		 * Integral literal(for integral data types) can be of below form
		 * 1) Decimal form(base-10)
		 *   must be from 0 to 9
		 * 2) Octal form(base-8)
		 *   values must be in 0 to 7 and Prefix '0' means Octal literal
		 * 3) Hexa decimal form(base-16)
		 *   values must be in 0 to 9 and a to f(A to F) and Prefix '0x' or '0X'(zero with suffix x/X) means Hexa decimal literal
		 * 4) Binary form(base-2)
		 *   values must be in digits (0,1) and Prefix '0b' or '0B'(zero with suffix b/B) means Binary literal
		 *   
		 */
		
		int p = 10; //decimal form literal
		int q = 010; //octal form literal //(0*8^0 + 1*8^1 = 0 + 8 = 8)
		int r = 0x10; //hexa decimal form literal //(0*16^0 + 1*16^1 = 0 + 16 = 16)
		int s = 0b10; //binary form literal //(0*2^0 + 1*2^1 = 0 + 2 = 2)
		
		int t = 0x32; //hexa decimal form literal //(2*16^0 + 3*16^1 = 2 + 48 = 50)
		int u = 015; //octal form literal //(5*8^0 + 1*8^1 = 5 + 8 = 13)
		int v = 0b11; //binary form literal //(1*2^0 + 1*2^1 = 1 + 2 = 3)
		
		System.out.println(p+" , "+q+" , "+r+" , "+s); //10 , 8 , 16 , 2 //JVM always provide integral values only into decimal form.
		System.out.println(t+" , "+u+" , "+v); //50 , 13 , 3
	
	
		/**
		 * By default every integral literal of int type. 
		 * If we need another type then it should be explicitly specify suffix (L/l).
		 * We know, size order: byte(1 byte) < short(2 byte) < int(4 byte) < long(8 byte)
		 */
		int c = 12;
		long d = 12L; //explicitly specifying 'L'/'l' to change default value(int) of integral literal to long type. 
		long e = 12; //Perfectly fine as 4 byte value can be assign to 8 byte
//		int f = 12L; //Compilation error as 8 byte value cannot be assign to 4 byte
	
		System.out.println(c+" , "+d+" , "+e); //12 , 12 , 12
		
		
		/**
		 * We cannot explicitly specify suffix for byte and short.
		 */
		byte by = 127;
//		byte byt = 128; //compilation error- cannot convert fron int to byte as it's not within range
		short sh = 32767;
//		short sho = 32768; //compilation error- cannot convert fron int to short
		
		System.out.println(by+" , "+sh); //127 , 32767
		
		
		
		System.out.println("==========Floating point literal=========");
		/**
		 * By default every Floating point literal of double type.
		 */
//		float f1 = 123.456;//compilation error as cannot convert from double to float
		float f = 123.456f;
		double doub = 123.456; //assigning double to double
		double doubl = 123.456D;
		
		System.out.println(f+" , "+doub+" , "+doubl); //123.456 , 123.456 , 123.456
		
		
		/**
		 * Floating point literal supports only decimal form & scientific notation(exponential form)
		 * Valid Integral literal(i.e. without any decimal point) can be assigned to Floating point literal.
		 */
		double d1 = 123.567;
		double d2 = 0123.567; //considering it(octal) as a decimal only
//		double d3 = 0x123.567; //compilation error as Floating point literal cannot be hexa decimal form
		double d3 = 0x123; //assigning valid Hexa decimal form Integral literal
		double d4 = 0xFace; //assigning valid Integral literal
//		double d5 = 0786; //compilation error as not valid octal Integral literal because of '8'
		double d6 = 0786.0; //with decimal point it making Floating point literal & prefix 0 is become valid
		
		System.out.println(d1+" , "+d2+" , "+d3+" , "+d4+" , "+d6); //123.567 , 123.567 , 291.0 , 64206.0 , 786.0
	
		
	
		System.out.println("=============Some Mixup============");
		/**
		 * Integral literal can be assign to Floating point data types
		 * but Floating point literal cannot be assign to Integral data types
		 */
		
		double dd = 10; //perfectly fine
//		int xx = 10.0; //compilation error - cannot convert from double to int
		double ddd = 1e3; //exponential form //1*10^3 = 1000.0
		System.out.println(dd+" , "+ddd); //10.0 , 1000.0
		
		
		/**
		 * Java supports usage of '_' in Numeric data types(Integral & Floating point data types)
		 * '_' is just for readability purpose. After compilation it gets remove.
		 * '_' is not acceptable at beginning of number, end of number & immediate to decimal point
		 * eg. _123.0 , 123_ , 123_.0 , 123._0  -> will get compilation error.
		 */
		double num = 1_24_567.01;
		int i = 1_0;
		byte ii = 1_2_7;
		double num1 = 1____24__567.01; //no issue with number of '_' used.
		System.out.println(num+" , "+i+" , "+ii+" , "+num1); //124567.01 , 10 , 127 , 124567.01
	}

}
