package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practicejan15th {
    
public static void main(String[] args) {
    int a [] = {1,3,22,33,44,123,323};
    int b [] = {4,9,22,1,43,123,2};
    int sum = sumofarray(a);
    System.out.println(sum);
    int m =10;
    int n =20;
    int temp;
    String val = "Testing";
    String val2 ="";
    
    for(int i=val.length()-1;i>=0;i--) {
    	System.out.println(val.charAt(i));
    	val2 = val2+val.charAt(i);
    }
    System.out.println(val2);
    if(val==val2) {
    	System.out.println("palandrome");
    }
    else {
    	System.out.println("Not a palandrome");
    }
    
    for(int i=0;i<b.length;i++) {
    	
    	for(int j=i+1;j<b.length;j++) {
    		if(b[i] >b[j]) {
    			temp = b[i];
    			b[i]=b[j];
    			b[j]=temp;
    		}
    	}	
    	
    }
    System.out.println(Arrays.toString(b));
   
    
    //swap numbers 
    m =m+n;
    n=m-n;
    m=m-n;
    System.out.println("m: "+ m);
    System.out.println("n: "+ n);
    
    ArrayList<Integer> list = new ArrayList<Integer>();  
    list.add(55);  
    list.add(34);  
    list.add(98);  
    list.add(67);  
    list.add(39);  
    list.add(76);  
    list.add(81); 
    Collections.sort(list);
    System.out.println(list);
    
    
    
    
    
    int mul = multiply(5,10);
    System.out.println("Multiplication:" + mul);
        
    int maxdiff = maxdiff(a);
    System.out.println("maxdiff:" + maxdiff);
    
    for(int i=0;i<a.length;i++) {
    	for (int j=0;j<b.length;j++) {
    		if(a[i]==b[j]) {
    			System.out.println(a[i] + " is present b array" + b[j]);
    		}
    	}
    }
    }

	public static int maxdiff(int[] a) {
	int diff =0;
	for (int i=1;i<a.length-1;i++) {
		 if(a[i+1]-a[i]>diff) {
			 diff =a[i+1]-a[i];
		 }
	}
		
	return diff;
}
	public static int multiply(int i, int j) {
    	int mul =0;
	for (int k=0;k<j;k++) {
		mul=mul+i;
	}
	return mul;
}
	public static int sumofarray(int[] a) {
        int val=0;
        for(int i=0; i< a.length;i++){
            val= val+a[i];
        }       
        return val;
    }
    
}
