package Practice;

public class ReverseString {
public static void main (String[]args) {
	
	String str= "reverse this string";
	
	int a=str.length(); //19
	
	for(int i=a-1;i>=0;i--) 
	{
		//if(str.charAt(i) != ' ') 
		{
			System.out.print(str.charAt(i));
		}
		
	}
}
}
