package Practice;

public class Minmaxmultiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,4,9},{7,5,3},{2,94,90}};
		int min =a[0][0];
		int max = a[2][2];
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {

				if(a[i][j]<min) {
					min = a[i][j];
				}
				if(a[i][j]>max) {
					max =a[i][j];
				}
				
			}
		}
		System.out.println(min);
		System.out.println(max);

	}

}
