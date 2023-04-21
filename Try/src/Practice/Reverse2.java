package Practice;

public class Reverse2 {
	
	public static void main(String[] args) {

		String str = "my name is badal";
		
		String[] Sword= str.split(" "); 
		// String[] Sword= str.split("\\s ");
		
		String Rwords="";
		
		for(String w:Sword) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			Rwords= Rwords+sb.toString()+" ";
		}
		System.out.println(Rwords);
	}
}
