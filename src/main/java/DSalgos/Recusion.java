	package DSalgos;

public class Recusion {
		static int [] arr = {4,5,13,15};
	
	public static void main(String[] args) {
		int val =sumofDigits(arr.length-1);
		System.out.println(val);
	}

	private static int sumofDigits(int n) {
		// TODO Auto-generated method stub
		
		if(n==0) {
			return arr[n];
		}
		return arr[n]+sumofDigits(n-1);
	}

}
