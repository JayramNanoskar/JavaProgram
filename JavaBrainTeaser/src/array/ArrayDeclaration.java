package array;

/**
 * Array Holds multiple value by using single variable.
 * Array is an indexed collection of fixed number of homogeneous data elements.
 * Limitations: Holds homogeneous(same type) value, size is fixed.
 * To Fix Limitations: collections can be used.
 * At the time of declaration we cannot specify the size. If we do so, gets compilation error.
 * At the time of creating/defining an array we must specify the size.
 */
public class ArrayDeclaration {

	public static void main(java.lang.String[] args) {
		System.out.println("============= Array Declararion =============");
		/**
		 * Valid 1D array declaration
		 * 3 possible ways
		 * Most recommended is 'int[] ar' as mentioned below
		 * because of clear readability means name of variable & array are clearly separated.
		 */
		int[] ar;
		int arr[];
		int []arrr;
		
		Student[] s;
		char[] c;
		String[] st;
		
//		int[10] cc; //compilation error
		
//		int[] aa = new int[]; //gives compilation error because at the time of creating/defining an array we must specify the size.
		int[] b = new int[10]; 
		
		/**
		 * Valid 2D array declaration
		 * 6 possible ways
		 */
		int[][] br;
		int [][]brr;
		int brrr[][];
		int []brrrr[];
		int[] []brrrrr;
		int[] brrrrrr[];
		
		/**
		 * Valid 3D array declaration
		 * 10 possible ways
		 */
		int[][][] cr;
		int [][][]crr;
		int crrr[][][];
		int[][] []crrrr;
		int[][] crrrrr[];
		int[] [][]dr;
		int[] drr[][];
		int [][]drrr[];
		int []drrrr[][];
		int[] []drrrrr[];
		
		
		System.out.println("============= Mixup between Arrays ==============");
		/**
		 * If we want to add dimensions before variable then we can do it for 1st variable only.
		 * If we add before other(except first) variable then we will get compilation error.
		 */
//		int[] c,[]d; //gives compilation error
		
		int[] av[],bv; //here 'av' is 2D array, 'bv' is 1D array
		
		int[] []a,bb; //valid here 'a'-2D, 'bb'-2D dimensions specify before first variable will get apply to all, here compiler ignores that space
		
		int[] ab,bbb; //here 'ab' is 1D array, 'bbb' is also 1D array

	}

}

class Student{
	
}
