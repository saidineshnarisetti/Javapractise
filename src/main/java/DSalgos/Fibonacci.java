package DSalgos;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		//int val =Fibonacciseries(n);
		System.out.println(Fibonacciseries(1));

	}

	private static int Fibonacciseries(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return Fibonacciseries(n-1)+Fibonacciseries(n-2);
		// TODO Auto-generated method stub
		
		
	}

}
