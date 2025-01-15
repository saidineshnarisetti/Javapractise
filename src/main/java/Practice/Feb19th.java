package Practice;

import java.util.ArrayList;

import javax.management.AttributeList;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Feb19th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []  = {5,2,3,5,67,1,8,9,1};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			if (!al.contains(a[i])) {
				al.add(a[i]);
				
			}
			
		}
		System.out.println(al);
			
//		String a = "Dinesh";
//		String b ="";
//		for(int i=a.length()-1;i>=0;i--) {
//			
//			b=b+a.charAt(i);
//			
//			
//			
//		}
//		System.out.println(b);
////		System.out.println(multiply(5,10));
//		
//		int a [] [] = {{5,2,3},{5,67,1},{8,9,1}};
//		int min=a[0][0];
//		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				if(a[i][j]<min) {
//					min= a[i][j];
//					
//					
//				}
//			}
//		}
//		System.out.println(min);
		
//		int one =0;
//		int two =1;
//		int val;
//		for(int i=0;i<=7;i++) {
//			val =one+two;
//			System.out.println(val);
//			i++;
//			one =two;
//			two=val;
//		}
		
//		int a =10;
//		int b= 20;
//		
//		a = a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
////		int a [] = {1,4,8,15,17,37,3,6,9};
////		int b []= 	{2,3,8,2,6,37};
//		int temp;
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					temp = a[i];
//					a[i] = a [j];
//					a[j]=temp;
//				}
//				
//			}
//			
//		}
//		for(int i=0;i<a.length;i++) {
//		System.out.print(a [i] + " " );
//		}
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<b.length;j++) {
//				if(a[i]==b[j]) {
//					al.add(a[i]);
//				}
//			}
//			
//		}
//		System.out.println(al);
		
//		int maxaj=0;
//		
//		for(int i=0;i<a.length-1;i++) {
//				
//			if((a[i+1]-a[i])>maxaj) {
//				maxaj= a[i+1]-a[i];
//				
//			}
//			
//			
//		}
//		System.out.println(maxaj);
//		int sum = 0;
//		
//		for(int i=0;i<a.length;i++) {
//			
//			sum= sum+a[i];
//			
//			
//		}
//		System.out.println(sum);
		
			
	}

//	private static int multiply(int i, int j) {
//		int l =0;
//		// TODO Auto-generated method stub
//		for(int k=0;k<j;k++) {
//			 l=l+i;
//		}
//		
//		return l;
//	}

}
