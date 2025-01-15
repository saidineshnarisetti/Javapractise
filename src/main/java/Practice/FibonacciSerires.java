package Practice;

public class FibonacciSerires {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;

		int firstTerm = 0;
        int secondTerm = 1;
        System.out.print(firstTerm + " " + secondTerm + " ");

		// TODO Auto-generated method stub
        for(int i=0;i<n;i++) {
        	int sumval = firstTerm + secondTerm;
        	System.out.print(sumval+ " ");
        	firstTerm=secondTerm;
        	secondTerm=sumval;
        }
	
	}

}
