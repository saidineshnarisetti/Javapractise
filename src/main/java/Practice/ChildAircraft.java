package Practice;

public class ChildAircraft extends ParentAircraft{
	
	
	public static void main(String[] args) {
		ChildAircraft ca = new ChildAircraft();
		ca.Color();
		ca.engine();
		ca.Safety();
	}
	
	public void Color() {
		System.out.println("Blue");
		
	}

}
