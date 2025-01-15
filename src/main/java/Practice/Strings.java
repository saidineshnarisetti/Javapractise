package Practice;

public class Strings {
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Testing";
		String b = "Testing";
		
		String c =new String("Testing");
		
		if(a==b) {
			System.out.println("True");
		}
		if(a==c) {
			System.out.println("True");
		}
		StringBuffer sb = new StringBuffer("Testing");
		System.out.println(sb.append("Dinesh"));
		
		StringBuilder sbr =new StringBuilder("Dinesh");
		System.out.println(sbr.reverse());
		System.out.println(a.equals(sb));
		

	}

}
