
//Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

//Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
package Practice;

import java.util.Arrays;

public class Addextrazerotoarray {

	public static void main(String[] args) {
//		Input: arr = [1,0,2,3,0,4,5,0]
//				Output: [1,0,0,2,3,0,0,4]
//				Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
//				Example 2:
//				Input: arr = [1,2,3]
//				Output: [1,2,3]
		int a []= {1,0,2,3,0,4,5,0};
		int j=0;
		int n=a.length;
		int [] temp = new int[n];
		
		
		for(int i=0;i<a.length && j<n;i++) {
			temp[j++]= a[i];
			
			if(a[i]==0 && j<n) {
				temp[j++]=0;
				
			}
			
			 
		}
		for (int k = 0; k < n; k++) {
            a[k] = temp[k];
        }
	System.out.println(Arrays.toString(temp));
		
		}
		
		
		
	}


