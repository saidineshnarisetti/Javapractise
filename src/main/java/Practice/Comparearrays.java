package Practice;

import java.util.ArrayList;

public class Comparearrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// compare two arrays with index if matches print those in diff array
		int []a = {1,2,4,6,8,10};
		int []b = {0,3,4,7,8,11};
		int []c = new int[4]; 
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<b.length;j++) {
				if(a[i] == b[j]) {
//					int []c = a[i];
					al.add(a[i]);
					System.out.println(a[i]);
				}
			}
		}
		Object[] newobj = al.toArray();
		for (Object obj:c) {
			System.out.println(obj);
		}
		
	}

}
