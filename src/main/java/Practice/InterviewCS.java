package Practice;

public class InterviewCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {2,9,11,15,7};
		int target = 9;
		
//		for(int i=0;i<=a.length;i++) {
//			
//			for(int j= i+1;j<a.length;j++) {
//				if(target == a[i]+a[j]) {
//					System.out.println(i);//0
//					System.out.println(j);
//				}
//			}
//		}
		String s = "[)(]";
		int startCount =0;
		int endCount =0;
		
	    for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '{' || currentChar == '(' || currentChar == '[') {
                startCount++;
            } else if (currentChar == '}' || currentChar == ')' || currentChar == ']') {
                endCount++;
            }
        }
		if(startCount==endCount) {
			System.out.println("true");
		}
		else {
			System.out.println("False");
		}

	}

}
