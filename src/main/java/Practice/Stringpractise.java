package Practice;

public class Stringpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello"; // String litteral 
		String b = "hello"; // wont create a new object -- works a referance 
		
		a.concat("world"); // immutable -- wont change acctual content 
		System.out.println(a);
		
		System.out.println(a.equals(b));//true
		System.out.println(a==b);// true
		
		
		String s = new String ("hello"); // create a new object every time 
		
		System.out.println(a.equals(s));// true
		
		System.out.println(a==s);// false as comparing referances == is use for referances  
		
		String s1 = new String ("hello");
		
		System.out.println(s==s1);// false as referance are differant 
		
		System.out.println(s.equals(s1));// true as referance are differant 
		
		
		
		
		// String buffer and String builder are mutable (which can change )
		StringBuffer sb= new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(2, "she");
		System.out.println(sb);
		sb.replace(5, 7, "aa");
		System.out.println(sb);
		sb.deleteCharAt(12);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		// String builder is not thread safe and non-syn, it is faster 
		
	}

}
