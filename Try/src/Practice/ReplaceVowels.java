package Practice;

public class ReplaceVowels {
	public static void main(String[] args) {

		String str="this is code to replace all vowels from a any given String";
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(ch[i]=='a' || ch[i]=='e'||ch[i]=='i'||ch[i]=='o' || ch[i]=='u') {
				ch[i]='%';
			}
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(ch[i]);
		}
	}
}
