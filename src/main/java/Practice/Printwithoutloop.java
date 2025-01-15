package Practice;

public class Printwithoutloop {

    public static void main(String[] args) {
        printNumbers(100);
    }

    private static void printNumbers(int n) {
        if (n >= 1) {
            System.out.println(n);
            printNumbers(n - 1);
        }
    }
}