package Practice;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "madam";
		String rev= "";
		for(int i = a.length()-1;i>=0;i--) {
			rev = rev+a.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(a)) {
			System.out.println(rev + "is a "+ "palandrome");
		}

	}

}
