package Practice;

import static org.testng.Assert.assertFalse;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {34,10,2,1,1,4,5,1,2};
		int sumtwo=0;
		int count=0;
		Boolean countval = false;
		for(int i =0;i<a.length-1;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) { 
					//System.out.println(a[i]);
					count++;
					
				}
				
				
			}
		
			if (count > 0) {
	            System.out.println("Number " + a[i] + " is repeated " + count + " times.");
	        }
		}
		
		
		
		

	}
}


