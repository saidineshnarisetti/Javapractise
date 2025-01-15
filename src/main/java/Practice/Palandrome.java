package Practice;

public class Palandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a = "ABCBA";
		for (int j =a.length()-1;j>=0;j--) {
			System.out.println(a.charAt(j));
			
			
		}
		String rev= "";
		
		for(int i = a.length()-1;i>=0;i--) {
			rev = rev+a.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(a)) {
			System.out.println(rev + "is a "+ "palandrome");
		}
		else {
			System.out.println("Not a palandrome");
		}

	}

}
