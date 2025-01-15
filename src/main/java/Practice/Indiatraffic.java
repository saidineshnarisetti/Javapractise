package Practice;

public class Indiatraffic implements TrafficInterfaace, ContinentalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficInterfaace it= new Indiatraffic();
		it.green();
		it.red();
		it.yellow();
		Indiatraffic its= new Indiatraffic();
		its.walksymbol();
		ContinentalInterface ct = new Indiatraffic();
		ct.Train();
		ct.Bus();
		
	}

	public void green() {
		// TODO Auto-generated method stub
		System.out.println("Green Go");
		
	}


	public void red() {
		// TODO Auto-generated method stub
		System.out.println("Red stop");
		
	}


	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow see and go");
		
	}
	public void walksymbol() {
		// TODO Auto-generated method stub
		System.out.println("Walk");
		
	}

	
	public void Train() {
		// TODO Auto-generated method stub
		System.out.println("Train stop");
		
	}


	public void Bus() {
		// TODO Auto-generated method stub
		System.out.println("It's bus stop");
		
	}

}
