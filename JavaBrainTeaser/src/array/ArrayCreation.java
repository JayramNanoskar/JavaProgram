package array;

public class ArrayCreation {
/**
 * Every array in Java is an object.
 * Object is made for classes so array is also class, we can verify it using getClass().getName()
 * At the time of declaration we cannot specify the size. If we do so, gets compilation error.
 * At the time of creating/defining an array we must specify the size. If we do so, gets compilation error.
 */
	public static void main(String[] args) {
		
		System.out.println("===========  Array Creation/Definition/Default initialization ==========");
		int[] a = new int[3]; //when we use new keyword it gets memory in heap & reference in stack.

		int[] x = new int[4];
		int[][] y = new int[4][3];
		double[][] z = new double[4][3];
		byte[] b = new byte[3];
		boolean[] bo = new boolean[3];
		String[] st = new String[3];
		String[][] str = new String[3][8];
		Student[][] s = new Student[3][5];

		System.out.println(x.getClass().getName()); //gives [I because it 1D array
		System.out.println(y.getClass().getName()); //gives [[I because it 2D array
		System.out.println(z.getClass().getName()); //gives [[D
		System.out.println(b.getClass().getName()); //gives [B
		System.out.println(bo.getClass().getName()); //gives [Z - for boolean
		System.out.println(st.getClass().getName()); //gives [Ljava.lang.String - L may be for an object type
		System.out.println(str.getClass().getName()); //gives [[Ljava.lang.String
		System.out.println(s.getClass().getName()); //gives [[Larray.Student
		  
//		int[] ar = new int[]; //invalid as size is unknown at the time of defining/creating
		int[] br = new int[0]; //valid
		
		System.out.println(args.length); //gives '0' as we are not passing any argument to program
		
		int[] c = new int[0];
//		c[0] = 10; //gives runtime exception ArrayIndeOutOfBound as we have array with size zero so cannot access element	
//		System.out.println(c[0]); ////gives runtime exception ArrayIndeOutOfBound as we have array with size zero so cannot access element	
		  
		/**
		 * LOC below gives runtime exception NegativeArraySize as we have array with negative size	
Compiler duty is to check syntax, type. So here syntax is right & even type of size is also integer type means right.
But while allocating memory JVM will find wrong and throw runtime exception.
		 */
//		int[] xx = new int[-3]; //gives runtime exception NegativeArraySize as we have array with negative size
		
		/**
		 * Array Size must be integer type.
		 * So passing short/ byte/ char/ int is acceptable due to implicit type casting.
But passing long/ float/ double won't acceptable.
		 */
		int[] u = new int['a']; 
		System.out.println(u.length); //gives 97
		
		byte bb = 40;
		int[] zk = new int[bb]; 
		System.out.println(zk.length); //gives 40, acceptable due to implicit type casting.

		long d = 20;
//		int[] zf = new int[d]; //gives compilation error, unacceptable type casting.
		
//		int[] sb = new int[2147483647]; //passing max value of int
//		System.out.println(sb.length); // above line compiles fine, will runs also. But we might get runtime exception(OutOfMemoryError) if that much memory(4*2147483647) is not available in our system.

		System.out.println(Integer.MAX_VALUE); //2147483647
		
		
//		int aa = 2147483648; //compilation error as of type int is out of range 
		int aa = (int)2147483648L; //doing lossy conversion(explicit type casting) that why range exceeded value allowed 
		System.out.println(aa); //-2147483648
		
		
		/**
		 * Multidimensional array
		 * 2D/3D, Array of Arrays(Jagged arrays)improves memory utilization.
		 * Also called Matrix/table(having same row & column) in other languages but in Java it is not implemented like that because it waste the memory.
		 * In java, we implement like Array of Arrays(Jagged arrays). Eg. Array of Student having arrays of Subject chosen.[here two levels means 2D array]
		 * In Multidimensional array at least we need to specify base size for an array while creating/defining else compilation error occur.
		 * Prior specifying base level/prior level dimension, we cannot specify next level dimension.
		 * After initialization array get default value as per data type(for eg. int has zero)
		 */
		
		int[][] x1 = new int[2][]; //just providing base/root/first level size for 2D array. column size will provide later on as below because it is not fix.
		x1[0] = new int[2]; //providing second level size
		x1[1] = new int[3]; //providing second level size
		
		int[][][] yy = new int[2][][]; //root/first level 
		yy[0] = new int[3][]; //second level
		yy[0][0] = new int[1]; //third level
		yy[0][1] = new int[2]; //third level
		yy[0][2] = new int[3]; //third level
		yy[1] = new int[2][2]; //second and third level
		
		
		int[] x2 = new int[3]; //After initialization array get default value as per data type(int has zero)
		System.out.println(x2); //gets [I@123772c4 - print output of toString() as 'x' is reference variable to array object
		System.out.println(x2[0]); //print '0' i.e. default value for int data type

		
		int[][] x3 = new int[3][2]; //[2D array - Here base/first level(2D) array has reference to second level(1D) array]
		System.out.println(x3); //print [[I@2d363fb3 - gets toString() output for reference - It is 2D array reference
		System.out.println(x3[0]); //print [I@7d6f77cc - gets toString() output - It is 1D array reference
		System.out.println(x3[0][0]); //gets '0' i.e. default value for int dat atype

		/**
		 * 'null' is default value for object reference if reference get created it gets some reference toString() value.
		 */
		int[][] x4 = new int[3][];
		System.out.println(x4); //print [[I@12ccabbb - gets toString() output for reference - It is 2D array reference
		System.out.println(x4[0]); //print null - default value for object reference
//		System.out.println(x4[0][0]); //gets Null pointer exception - runtime exception - For 2D array, 1D array is not get created 

		
		int[] x5 = new int[2];
		x5[0] = 10; //providing custom values
		x5[1] = 20;
//		x5[2] = 15; //gets ArrayIndeOutOfBound exception - runtime exception
//		x5[-2] = 25; //gets ArrayIndeOutOfBound exception - runtime exception
		//Compiler will just check whether index is a valid i.e. here int value or not.
		
		

	}

}
