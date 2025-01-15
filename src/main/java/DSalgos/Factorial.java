package DSalgos;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int val =Factorial(n);
		System.out.println(val);

	}

	private static int Factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			n =(n*Factorial(n-1));
			return n;
		}
		
	}

}
