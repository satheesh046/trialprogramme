package satheesh;

public class stringprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="satheesh",word="";

for (int i=s.length()-1;i>=0;i--) {
	
	word=word+s.charAt(i);
}
System.out.print(word);
	if(word.equals(s))
		System.out.println("is palindrome");
	else
		System.out.println(" not palindrome");
	
	
	
		
		
	

}


	}


