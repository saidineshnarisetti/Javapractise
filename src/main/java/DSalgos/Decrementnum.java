package DSalgos;

public class Decrementnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =100;
		decrement(n);

	}

	private static void decrement(int n) {
		if(n>=1) {
			System.out.println(n);
			decrement(n - 1);
		}
		
	}

}
