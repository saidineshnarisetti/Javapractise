package Practice;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 371;
		int actn = n;
		double result = 0;
		while(actn!=0) {
			int var =actn%10;
			 result =result+Math.pow(var, 3);
			 actn = actn / 10;
		}
		if (result == n) {
			System.out.println(n + " is an Armstrong number");
			} else {
			System.out.println(n + " is not an Armstrong number");
			}

	}

	
}
