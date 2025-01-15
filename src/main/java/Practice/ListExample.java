package Practice;
import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List allows duplicate values 
		// In List insertion order is preserved 
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        System.out.println(fruits);
        System.out.println("First fruit: " + fruits.get(0));
        
        System.out.println(fruits.size());
        fruits.remove(2);
        System.out.println(fruits);
        for (String fruit:fruits) {
        	System.out.println(fruit);
        }

	}

}
