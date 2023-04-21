package Practice;

public class Blank {

	public static void main(String[] args) {
		int num = 145;

		String temp = Integer.toString(num);

		char a[] = temp.toCharArray();

		int size = a.length;

		for (int i = size - 1; i >= 0; i--) {
			System.out.print(a[i]);

		}
	}

}
