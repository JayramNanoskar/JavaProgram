package data_type;

public class TypeCastingDemo {

	/**
	 * Boolean require true/ false value. Even 'If_else' condition & 'while' loop need boolean value to enter into condition/loop otherwise it will give compilation error.
	 * Char must be in '' not in "". We can assign UNICODE(same as ASCII in other lanuages) values to them.
	 */
	public static void main(java.lang.String[] args) { //need to write full path to predefined String class because somewhere inside this package there is custom class named String exist.
		System.out.println("============Non-Numeric data types - Boolean and Char ==========");
	
		char ch = 'c'; //valid
//		char ch1 = 'ch'; //gives compilation error as Invalid character constant. '' expect only one character.
//		char ch2 = "c"; //gives compilation error as Type mismatch: cannot convert from String to char. "" require for String only not for char.
		
		char ch3 =  97; //valid //passing UNICODE value
		char ch4 =  65535; //valid //we get '?' because corresponding font is not supported
//		char ch5 =  65536; //compilation error - cannot convert from int to char
		
		/**
		 * In graphics based application development for colors and all hexadecimal representation mostly used.
		 * We get output '?' because corresponding font is not supported
		 */
		char ch6 = '\u0061'; //representing UNICODE character with 4 digit hexadecimal form //0061(97/16 -> quotient 6, reminder 1) in hexadecimal = 97 in decimal = a
		char ch7 = '\uabcd'; 
		
		System.out.println(ch+" , "+ch3+" , "+ch4+ " , "+ ch6+ " , "+ch7); //c , a , ? , a , ?

		
		
		System.out.println("============ Primitive - Implicit Type casting ==========");
		/**
		 * Implicit Type casting
		 * When smaller data type value is getting assign to bigger data type variable by compiler, it's implicit type casting.
		 * It is done by compiler.
		 * No loss of information.
		 * Widening(small value to bigger place) or Up casting
		 * byte(1 bytes) < short(2 bytes) < int(4 bytes) < long(8 bytes) < float(4 bytes) < double(8 bytes)
		 * char(2 bytes)
		 * In Implicit Type casting, we can have LHS(bigger/same data type variable) = RHS(smaller data type value)
		 * But the way of representing value for integral & floating point values in memory are different. 
		 * So there is special case that we can assign long(8 bytes) inside float(4 bytes) but reverse is not possible(get compilation error).
		 * and another special case is between char & byte, short because of bit reserved for signed.
		 */
		int x = 'a';
		double d = 10; 
		System.out.println(x+" , "+d); //97 , 10.0
		
		byte s = 'a'; //assigning char to byte directly
//		long l = 4.4f; //compilation error
		float f = 4L; //special case due to different in memory representation of long(Integral) & float(Floating point) types.
		System.out.println(s+" , "+f); //97 , 4.0
		
		
		System.out.println("============ Primitive - Explicit Type casting ==========");
		/**
		 * When a bigger data type value is getting assign to smaller data type variable, it is explicit type casting.
		 * It is done by programmer explicitly.
		 * May be loss of information.
		 * Narrowing(bigger value to small place) or Down casting.
		 */
		int w = 130;
//		byte by = w; //compilation error - cannot convert from int to byte - because not happening implicit type casting
		byte by = (byte)w; // using explicit type casting
		System.out.println(by); //-126 //loss of information
		
		
		/**
		 * char - 2 bytes, unsigned data type, all 16 bits represent values, 0-65535
		 * short - 2 bytes, signed data type, one bit reserved for sign, only 15 digits represent values, -32768 to 32767
		 * byte - 1 byte, signed data type, one bit reserved for sign, only 7 digits represent values, -128 to 127
		 * So due to unmatched compatibility, implicit type casting not happens with char <-> short, byte <-> char.
		 * We can do explicit type casting.
		 */
		char chh = 'a';
		byte b = 10;
//		chh = b; //compilation error - implicit type casting is not possible due to unmatched compatibility
//		b = chh; //compilation error - implicit type casting is not possible due to unmatched compatibility
		b = (byte)chh;
		ch = (char)b;
		
		byte b1 = 'a'; //assigning char to byte directly means like fix/constant
		final char cf = 'C'; //making final
		byte byt = cf; //works as we are assigning final value, so it not going to change at runtime. But it would have given compilation error in case value is not final.
		
		System.out.println(b+" , "+ch+" , "+b1+" , "+byt); //97 , a , 97 , 67
		//JVM always provide integral type output only into decimal form. Above ch is char so it's 'a'
	}
}
