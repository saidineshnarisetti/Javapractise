package Practice;

public class Practice20th {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,5,6,34,4,8,10};
//		int sum = sumofarry(a);
//		System.out.println(sum);
//		int mul = val(8,10);
//		System.out.println(mul);
		int temp;
		  for(int i = 0; i < a.length - 1; i++) {
	            for(int j = i + 1; j < a.length; j++) {
	                if(a[i] > a[j]) {
	                   
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
//		int diff =0;
//		for (int i=0;i<a.length-1;i++){
//				
//			
//				if(a[i+1]-a[i]> diff) {
//					diff= a[i+1]-a[i];
//					
//				}	
//		}
//		System.out.println(diff);
	}

//	private static int val(int i, int j) {
//		// TODO Auto-generated method stub
//		int mul =0;
//		for (int k =0;k<j;k++) {
//			mul =mul +i;
//		}
//		return mul;
//	}

//	private static int sumofarry(int [] a) {
//		// TODO Auto-generated method stub
//		int val=0;
//		for (int i=0;i<a.length;i++)
//		{
//			val=val+a[i];
//		}
//		return val;
//	}

}
