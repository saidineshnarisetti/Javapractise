package Practice;

public class Reversestring {
	public static void main (String[] args) {
	String str = "Testing";
	String nstr= "";
	char ch;
	for(int i=0; i <str.length(); i++) {
		ch = str.charAt(i);
		nstr= ch+nstr;
	}
	System.out.println(nstr);
	//	 Reversing string with string builder
	String input = "Testing with string";
	StringBuilder input1 = new StringBuilder();
	input1.append(input);
	input1.reverse();
	System.out.println(input1);
	
	}

}
