package Practice;

import java.util.ArrayList;

public class Basic {

	public static void main(String[] args) {
		int a =5;
		String sr = "Testing";
		Character N = 'a';
		System.out.println(a+ sr + N);
		
		int [] arr = {1,5,7,8,43,55,544};
		System.out.println(arr[2]);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		String [] arr_str= {"Saidinehs","dinesh","Anusha"};
		for(String s1:arr_str) {
			if(s1.contains("dinesh")) {
			System.out.println("Test found " + s1);
			}
		}
		int [] arr3 = {1,4,77,6,88,45,5488,99,100};
		for(int j=0;j<arr3.length;j++) {
			if(arr3[j] %2 == 0) {
			System.out.println(arr3[j]);
			}
		}
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Dinesh");
		ar.add("Anusha");
		System.out.println(ar.get(1));
		
		String s = "Sai Dinesh Narisetti";
		String [] spltittedsting= s.split(" ");
		System.out.println(spltittedsting[0]);
		System.out.println(spltittedsting[1]);
		for(int k=s.length()-1;k>=0;k--) {
			System.out.println(s.charAt(k));
		}
		

	}

}
