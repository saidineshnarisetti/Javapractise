package Practice;

import java.util.Iterator;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={3,60,35,2,45,320,5};  
		int temp;
		
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
