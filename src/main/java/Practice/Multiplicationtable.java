package Practice;

public class Multiplicationtable {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int result = multiply(5, 10);

        System.out.println(result);
    }

    private static int multiply(int i, int j) {
        // without multiplication

        int k = 1;
        int result = 0; // Initialize result outside the loop
        while (k <= j) {
            result = result + i; // Accumulate the sum of 'i' in each iteration
            k++;
            
        }

        return result;
    }
}
