package Practice;

public class testReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Saidinesh narisetti";
		String s1 ="Testing1";
		String s2 ="Testing2";
		String temp =s1;
		s1=s2;
		s2=temp;
		
		System.out.println(s1);
		System.out.println(s2);
		Character ch;
		String nch = null;
		for (int i=0;i< test.length();i++) {
			ch = test.charAt(i); 
			nch =  ch+ nch;
			
		}
		System.out.println(nch);
	}

}
