package Practice;

public class OppTriangle {

	public static void main (String[]args) {
		
		int n=5;
		
		for(int i=5;i>=n;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++)
			{
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}
