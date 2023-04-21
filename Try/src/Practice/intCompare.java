package Practice;

public class intCompare {

	public static void main(String args[]) {

		int a[] = {1,2,3,4,5};
		int b[] = {1,5,4,2,0};
		
		int sum = 0;
		int size = a.length; //4 

		for (int i = 0; i < size; i++) {
			sum = sum + a[i] - b[i];         
		}
		System.out.println("missing number is = " + sum);
	}
}
