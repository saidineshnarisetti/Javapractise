package DSalgos;

public class Templ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =100;
		decrement(n);

	}

	private static int decrement(int n) {
		// TODO Auto-generated method stub
		if(n<=1000) {
		System.out.println(n);
		return decrement(n+1);
		}
		return 0;
		
	}

}
