package Practice;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,7,2,3,9,12};
		int temp;
		// sort the array 
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}
		}
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
