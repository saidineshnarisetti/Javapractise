package Practice;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		boolean isPrime = true;
		
		for(int i=2;i<n;i++) {
			if(n%i ==0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
		
	}

}
