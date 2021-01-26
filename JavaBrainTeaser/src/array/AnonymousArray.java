package array;

public class AnonymousArray {

	/**
	 * length VS length()
	 * length variable applicable for arrays but not String. String requires length()
	 */
	public static void main(String[] args) {
		
		System.out.println("========= length vs length() ==========");
		int[] x1 = new int[3];
//		System.out.println(x1.length()); //compilation error because method not supported, need property/variable
		System.out.println(x1.length); // 3//valid as used property/variable
		
		String s = "OK";
//		System.out.println(s.length); //compilation error because property not supported, need method
		System.out.println(s.length()); // 2//valid as used method
		
		/**
		 * In multidimensional array length represent only base size.
		 */
		int[][] x = new int[6][3]; // base/first level/first size - 6 & second level size - 3
		System.out.println(x.length); //6 - only base size
		//Here, x[0].length + x[1].length + x[2].length  => 9
		
		String[] s1 = {"a", "aa", "aaa"};
		System.out.println(s1.length); //3 - valid because 's1' is String array
//		System.out.println(s1.length()); //compilation error because for array length() not applicable even though it it String array
//		System.out.println(s1[0].length); //compilation error - String requires length()
		System.out.println(s1[0].length()); //valid - gives 1 - String requires length()
		
		
		System.out.println("======== Anonymous(without name) array ========");
		/**
		 * Array without name called Anonymous array.
		 * One time usage, instant use
		 * Like to call sum method taking array. example. sum(new int[]{12, 46, 84, 50});
		 * Anonymous array should not pass array size because we provide element in line there only.
		 */
		int[] arr = new int[]{10, 20, 30}; //valid 1D anonymous array
//		int[] arr1 = new int[3]{10, 20, 30}; //invalid- compilation error
		
		int[][] arr2 = new int[][]{{10,20, 30}, {40, 50}}; //2d anonymous array
		
		
		
	}

}
