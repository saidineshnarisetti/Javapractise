package Practice;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		for (int i=0;i<=5;i++) {
			
			for(int j=0;j<i;j++) {
				
				System.out.print("*");
				System.out.print("\t");
				
			}
			
			System.out.println();
		}
	}

}
