package Practice;

import java.util.ArrayList;

import javax.management.AttributeList;

public class InterviewPrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp= "MADAM";
		String temp2="";
		for(int a =temp.length()-1;a>=0;a--) {
			//System.out.println(temp.charAt(a));
			temp2=temp2+temp.charAt(a);
		}
		if(temp.equals(temp)) {
			System.out.println("Pal");
		}
		
		
	}
}
