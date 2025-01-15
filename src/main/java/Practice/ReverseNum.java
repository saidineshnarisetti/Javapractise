package Practice;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1234;
		int rev=0;
		while(n!=0) {
			int dig =n%10;
			rev = dig + rev*10;
			n=n/10;
			
			
		}
		System.out.println(rev);
	}

}
