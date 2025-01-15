package Practice;

public class sumofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1234;
		int sum =0;
		while (n!=0) {
			int val = n%10;
			sum = sum+val;
			n = n / 10;
		}
		System.out.println(sum);
	}

}
