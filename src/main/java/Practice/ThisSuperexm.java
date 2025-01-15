package Practice;

public class ThisSuperexm extends Animal {
	
	String sound = "Bark";
	public void printsounds() {
		// TODO Auto-generated method stub
		
		System.out.println(sound);
		System.out.println(super.sound);
		System.out.println(this.sound);

	}
	public static void main(String[] args) {
		ThisSuperexm spr = new ThisSuperexm();
		spr.printsounds();
    }

}
