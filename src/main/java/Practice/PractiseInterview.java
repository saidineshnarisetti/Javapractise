package Practice;

import java.util.ArrayList;

import javax.management.AttributeList;

public class PractiseInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isUnique = true;
		int a [] = {1,2,3,4,1,2,4,5,3};
		for(int i=0;i<=a.length-1;i++) {
			
			for(int j=i+1;j<=a.length-1;i++) {
				
				if(a[i]==a[j]) {
					isUnique = false;
					break;
				}
			}
			//if(isUnique) {
				System.out.println(a[i]);
			//}
			
		}
		
		
	}
	
	
//	
//	String n ="Madam";
//	String rev="";
//	for(int i=n.length()-1;i>=0;i--) {
//		
//		rev =rev+n.charAt(i);
//		
//		
//	}
//	System.out.println(rev);
//	if(rev.equalsIgnoreCase(n)) {
//		System.out.println("pallendrome");
//	}
	
//	int a [][]= {{1,4,6,},{2,8,10},{12,7,9}};
//	int min =a [0][0];
//	int max =a [1][1];
//	
//	
//	for(int i=0;i<3;i++) {
//		for(int j=0;j<3;j++) {
//			//System.out.println(a[i][j]);
//			
//			if(a[i][j]<min) {
//				min = a[i][j];
//			}
//			if(a[i][j]>max) {
//				max =a[i][j];
//			}
//			
//		} 
//		
//		
//	}System.out.println(min);
//	System.out.println(max);
	
//	int one =0;
//	int two = 1;
//	int sum=0;
//	
//	for(int i =0;i<=9;i++) {
//		sum=one+two;
//		
//		System.out.print(sum);
//		System.out.print("\t");
//		
//		one = two;
//		two= sum;
//		
//		i++;
//	}//System.out.println(sum);

//	int a =5;
//	for(int i=1;i<=a;i++) {
//		for(int j=1;j<i;j++) {
//			System.out.print("*");
//			System.out.print("\t");
//		}
//		System.out.println();
//		
//		
//		
//	}
	
//	for(int k=0;k<a.length;k++) {
//	System.out.print(a[k] +" ");
//	
//	}
//	int a =10;
//	int b = 12;
//	a =a+b;
//	b = a-b;
//	a= a-b;
//	System.out.println(a);
//	System.out.println(b);
//	int a [] = {1,4,8,15,3,17};
//	int b [] = {5,7,8,10,17};
//	int temp;
//	
//	for(int i=0;i<a.length;i++) {
//			
//		for(int j=i+1;j<a.length;j++) {
//			if(a[i]>a[j]) {
//				temp = a[i];
//				a[i]=a[j];
//				a[j]=temp;
//				
//			}
//		}
//		
//	}
	
//	int diff=0;
//	
//	for(int i=0;i<a.length-1;i++) {
//		
//		//diff =a[i+1]-a[i];
//		//System.out.println(diff);
//		
//		if(a[i+1]-a[i]>diff) {
//			diff=a[i+1]-a[i];
//				
//		}
//	}System.out.println(diff);
//	int sum =0;
//	for(int i=0;i<a.length;i++) 
//	{
//		sum= sum+a[i];
//	}
//	System.out.println(sum);
//	int n =5;
//	multiply(5,10);

//	private static void multiply(int i, int j) {
//		// TODO Auto-generated method stub
//		int sum=0;
//		for(int k=0;k<j;k++) {
//			sum =sum+i;
//			//System.out.println(k);
//			//k++;
//		}
//		System.out.println(sum);
//	}

}
