package Practice;

public class Maxadjucentdiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,4,31,5,9,25,60};
		int diff =0;
		for (int i=0;i<a.length-1;i++) {
			if(a[i+1] - a[i]>diff)
			{ 
				diff = a[i+1]-a[i];
				System.out.println(diff);
				
			}
			
		}
		System.out.println(diff);
 
	}

}
