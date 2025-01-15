package Practice;

public class Countnooccurencechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countocr("madam",'a');
	}

	private static void countocr(String string, Character string2) {
		// TODO Auto-generated method stub
		int n=0;
		for(int i=0;i<string.length();i++) {
			string.charAt(i);
			
			
			if((string.charAt(i) == string2)) {
				
				n++;
			}
			//System.out.println(string.charAt(i));
		}
		System.out.println(n);
	}

}
