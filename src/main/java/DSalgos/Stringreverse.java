package DSalgos;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Dinesh";
		System.out.println(revstring(a));

	}

	private static String revstring(String a) {
		
		
		if(a.isEmpty()) {
			return a;
		}
		else {
			return  revstring(a.substring(1))+a.charAt(0);
		}
		
	}

}
