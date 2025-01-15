package Practice;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reversenum(100);
		}

	private static void Reversenum(int i) {
		// TODO Auto-generated method stub
		if (i>=0) {
			System.out.println(i);
			Reversenum(i-1);
			
		}
	}
}


