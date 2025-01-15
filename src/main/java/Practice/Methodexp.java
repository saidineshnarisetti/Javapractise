package Practice;

public class Methodexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodexp me = new Methodexp();
		me.getData();
		System.out.println(me.postData("Dinesh"));
		
	}
	public void getData() {
		System.out.println("Hello");
	}
	public String postData(String s) {
		
		return ("Hello welome " + s);
		
	}
	
}
