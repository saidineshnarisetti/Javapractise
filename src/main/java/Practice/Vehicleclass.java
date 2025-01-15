package Practice;

public class Vehicleclass implements VehicleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleInterface vi = new Vehicleclass();
		vi.color();
		vi.engine();
		vi.lights();
		vi.tyres();
		vi.threeweel();

	}
	public void tyres() {
		// TODO Auto-generated method stub
		System.out.println("MRF");
	}

	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Engine body");
	}


	public void lights() {
		// TODO Auto-generated method stub
		System.out.println("Flashing lights");
		
	}


	public void color() {
		System.out.println("Blue");
		
	}
	
	public void threeweel() {
		// TODO Auto-generated method stub
		System.out.println("Auto -- 3 wheel");
		
	}

}
