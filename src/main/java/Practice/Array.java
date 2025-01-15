package Practice;
import java.util.Arrays;
import java.util.Collections;

public class Array {

	public static void f1(){
		int[] number = {4,9,1,3,2,0,7,6,5};
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));	
	}
	
	public static void f2() {
		String[] fruits = {"apple", "mango", "pipeaple", "papaya", "guva"};
		Arrays.sort(fruits);
		Arrays.sort(fruits, Collections.reverseOrder());
		System.out.println(Arrays.toString(fruits));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1();
		f2();
		
		// Sting Comparision with Asci values 
		String a1 = "abc";
		String a2 = "abe";
		System.out.println(a1.compareTo(a2));
		
	}

}
