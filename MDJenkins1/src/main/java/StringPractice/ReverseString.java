package StringPractice;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="ahadujjaman";
		String r=" ";
		
		System.out.println(s.charAt(0));
		for(int i=0; i<s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		
		for(int i=s.length()-1; i>=0; i--) {
			r=r+s.charAt(i);
		}
		System.out.println(r);

	}

}
