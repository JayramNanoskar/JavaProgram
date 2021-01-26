package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAssignment {

	/**
	 * Array assignments
	 * Array element assignments[RHS] & Array variable assignments[LHS]
	 */
	public static void main(String[] args) {
		System.out.println("==========Array element assignments: case 1- Primitive arrays ==========");
		/**
		 * In case of primitive type arrays, as an array element we can provide any type which can be implicitly promoted to declared type.
		 */
		
		int[] a =  new int[10];
		a[0] = 10;
		a[1] = 'a'; //valid because of implicit type casting
		a[2] = 0677; //valid
//		a[3] = 10L; //invalid
		
		float[] f =  new float[10];
		f[0] = 10; //valid - as by default type will be int in case of integral data
		f[1] = 'a'; //valid because of implicit type casting
//		f[2] = 10.5; //invalid - as by default type will be double in case of floating point data
		f[3] = 10.5f; //valid because of explicit type casting
			
		
		System.out.println("==========Array element assignments: case 2- Object type arrays ==========");
		/**
		 * In the case of object type arrays, as array element we can provide either declared type or its child class object.
		 */
		Object[] o = new Object[10];
		o[0] = new Object(); //valid
//		o[1] =  new int(10); //invalid 
		o[2] =  new String("ok"); //valid
		
		
		System.out.println("==========Array element assignments: case 3- Abstract type arrays ==========");
		/**
		 * In the case of abstract class type arrays, as an array elements we can provide its child class object.
		 */
		Number[] n = new Number[10]; //ok -not creating Abstract class object , creating array of type Number
		n[0] = new Integer(10);  //valid as it is child class of Number(abstract class) class
//		n[1] = new String("ok"); //invalid
		
		
		System.out.println("==========Array element assignments: case 4- Interface type arrays ==========");
		/**
		 * In the case of Interface class type arrays, as an array elements we can provide its implemented class object.
		 */
//		Runnable r = new Runnable(); //invalid as we cannot create interface object
		Runnable[] r = new Runnable[10]; //valid - because we are not creating Runnable object but we are creating runnable type array object.
		r[0] = new Thread(); //valid - because it is child class

		List[] l = new List[10]; //valid - because we are not creating List interface object but we are creating List type array object.
		l[0] = new ArrayList(); //valid as we are providing implemented class object
		l[0] = new LinkedList();
		
		
		
		System.out.println("========== Array variable assignments =========");
		/**
		 * char can be promoted to int type but char array cannot be promoted to int array.
		 * For Primitive data types, element level promotion is not applicable for array level but for Object, array level promotion is applicable.
		 * for example, char can be promoted to int type but char[] cannot be promoted to int[] type
		 * For Primitive arrays, child type array cannot be promoted to parent type array(char[] cannot be converted to int[])
		 * But for Object type arrays, child type array can be converted to parent type array.(String[] can be converted to Object[])
		 * Compiler always consider only reference type, but at runtime JVM will always consider 'runtime object' type.
		 */
		int[] y = {10, 20, 30};
		char[] z = {'a', 'b', 'c'};

		int[] v = y; //valid
//		int[] w = z; //invalid - because [C cannot be converted to [I

		String[] s2 = {"a", "b", "c"};
		Object[] o2 = s2; //valid
		
		/**
		 * Compiler always consider only reference type, but at runtime JVM will always consider 'runtime object' type.
		 */
		Object[] aa = new String[3];
//		aa[0] = new Object(); //gives runtime exception -  ArrayStoreException

//		aa[1] = new Integer(10); //gives runtime exception -  ArrayStoreException
//		aa[2] = new StringBuffer("ok"); //gives runtime exception -  ArrayStoreException
//		aa[3] = new Object(); // gives runtime java.lang.ArrayIndexOutOfBoundsException:

		
		/**
		 * Whenever we are assigning one array to another array, internal elements won't get copied, just reference variables will be reassigned.
		 * Hence sizes are not required to match, but types must be matched.
		 */
		int[] m = {10, 20, 30};
		int[] nn = {12, 40};
		System.out.println(m); //[I@7d6f77cc
		System.out.println(nn); //[I@5aaa6d82
		m = nn; //valid - because internally just changing references(2 - [i.e. 'm' & 'nn'] references will point to same location) and 'm' will be ready for garbage collection
		nn = m; //valid
		System.out.println(m); //[I@5aaa6d82
		System.out.println(nn); //[I@5aaa6d82
		
		
		/**
		 * Whenever we assign one array to another array, dimensions must be matched.
		 */
		int[][] j = new int[2][]; //2D array
//		j[0] = new int[1][2]; //compilation error
		j[0] = new int[1]; //providing 1D array with size one to 1st element of 2D array
		j[1] = new int[2]; //providing 1D array with size 2 to 2nd element of 2D array
		j[0][0] = 35; //providing first element to 1D array of 1st element of 2D array
		j[1][0] = 15; //providing first element to 1D array of 2nd element of 2D array
		j[1][1] = 25; //providing second element to 1D array of 2nd element of 2D array

		
		/**
		 * we can provide null value to anywhere for 1D array also. It will compile/run fine. 
		 * But accessing if we try to access it will get Null pointer exception.
		 */
		int[][] k = new int[2][]; //2D array
		k[0] = null; //valid - we can provide null value to anywhere for 1D array also. It will compile/run fine. But accessing if we try to access it will get Null pointer exception.

		
	}

}
