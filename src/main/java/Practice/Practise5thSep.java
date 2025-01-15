package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Practise5thSep {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World!");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		int [] s= {1,5,72,23,323,1000};
		int a []= {2,4,5,64,92,79,10,20};
		int b []= {2,3,4,64,93,749,15,20};
		int [] ab = new int[4];
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		Arrays.sort(array);   
		System.out.println("Elements of array sorted in ascending order: ");  
		int x =10;
		int y= 20;
		
		String name ="MADAM";
		String news="";
		
		for(int h=name.length()-1;h>=0;h--) {
			System.out.println(name.charAt(h));
			news= news +name.charAt(h);
		}
		System.out.println(news);
		if(name.equals(news)) {
			System.out.println("PAL");
		}else {
			System.out.println("Non-pal");
		}
		
		y=x+y;
		x=y-x;
		y=y-x;
		System.out.println("Y:" +y);
		System.out.println("X:" +x);
		
		for (int i = 0; i < array.length; i++)   
		{       
		System.out.println(array[i]);   
		} 
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		for(int x =0;x<a.length;x++) {
//			if(a[x]==b[x]) {
//				al.add(a[x]);
//			}
//		}
//		System.out.println(al);
		
		int Sum =Sumofarry(s);
		System.out.println(Sum);
		int mul =multiply(5,10);
		System.out.println(mul);
		int temp=0;
		for(int i=0;i<s.length-1;i++) {
				temp = s[i+1]-s[i];
				if(s[i+1]-s[i]> temp) {
					temp = s[i+1]-s[i];
				}
		}
		System.out.println(temp);
		
	}

	private static int  multiply(int i, int j) {
		// TODO Auto-generated method stub
		int mul=0;
		for(int k=0;k<j;k++) {
			
			mul=mul+i;
			
		}
		return mul ;
		
	}

	private static int Sumofarry(int[] s) {
		// TODO Auto-generated method stub
		int Sum=0;
		for(int i=0;i<s.length;i++) {
			Sum=Sum+s[i];
		}
		return Sum ;
	}

}
