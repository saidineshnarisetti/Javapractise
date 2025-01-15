package Practice;

import java.util.HashSet;
import java.util.Set;

public class PrintUniquenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 2, 5, 6, 7, 8, 7, 9, 10, 1};
		
//		for(int i=0;i<array.length;i++) {
//			boolean isUnique = true;
//			for(int j =0;j<i;j++) {
//				
//				if(array[i]==array[j]) {
//				//System.out.println(array[i]);
//					isUnique = false;
//					break;
//					
//				}
//				
//				
//			}
//			if(isUnique) {
//				System.out.print(array[i] + " ");
//				
//			}
//			
//			
//		}
		Set<Integer> unqset =new HashSet();
		for(int val:array) {
			unqset.add(val);
		}
		System.out.println(unqset);
		
	}

}
