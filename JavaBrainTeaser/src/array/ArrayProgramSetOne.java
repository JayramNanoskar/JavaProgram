package array;

public class ArrayProgramSetOne {

	static int[] m;
	public static void main(String[] args) {
		String[] s;
//		s = String[3]; //give compilation error as new keyword not used while creating array object.
		
		System.out.println("====one====");
		double[] d = new double[3];
		int k = 3;
		for(int i = 0; i>k ; i++){
			d[i] = i;
		}
		for(double d1 : d){
			System.out.print(d1);
		} //gives 0.0 0.0 0.0
		
		System.out.println();
		System.out.println("====two====");
		
		int[][] evenodd = new int[2][2];
		
		for(int i = 0; i<2&i%2==0; i++){
			for(int j = 0; j<2; j++){
				evenodd[i][j] = i; //j //0 1 0 0
			}
		}

		for(int i = 0; i>2&i%2!=0; i++){
			for(int j = 0; j<2; j++){
				evenodd[i][j]= j;
			}
		}

		for(int[] x: evenodd){ //using enhanced for loop to print 2D data
			for(int y : x){
				System.out.print(y);
			}
		} //gives 0000
		
		
		System.out.println();
		System.out.println("====Array basic======");
		int[] a; //declaring an array
		a = new int[3]; //creating an array(involves default initialization)
		a[0] = 10; //initializing an array
		a[1] = 20;
		a[2] = 30;
		
		int[] aa = {10,20,30}; //declaring, creating, initializing in a single line. So  reduces LOC
	
		int[] aaa = {10,20,30}; //1D array
		int[][] x = {{10,20,30}, {40,50}};  //2D array


		System.out.println("====three====");
		int[] z = {10,20,30}; //valid
		int[] y;
//		y = {10, 20,30}; //gives compilation error - because while using {}, array declaring, creating, initializing must be in a single line
	
		
		System.out.println("====four====");
		/**
		 * Using anonymous array
		 */
//		m= {10,20,30}; //invalid
//		m= new int[3]; //valid
//		m= new int[3]{10,20,30}; //invalid because of with Anonymous array putting size
		m= new int[]{10,20,30}; //valid because of using Anonymous array
		
		int[] g = new int[] {30, 50, 10}; //valid Anonymous array
		
		
		System.out.println("====five====");
		Course[] c = new Course[3];
		c[0] = new Course("Java", 12000);
		c[2] = new Course("Python", 1500);
		for(Course co: c) {
//			System.out.println(co.name+"-"+co.fee); //gives Null pointer exception - runtime exception because we are asking name,fee to null
		}
		
	}

}

class Course{

	String name;
	double fee;
	Course(String name, double fee){
		this.name = name;
		this.fee = fee;
	}
	
}
