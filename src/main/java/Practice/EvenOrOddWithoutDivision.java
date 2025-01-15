package Practice;

public class EvenOrOddWithoutDivision {

    public static void main(String[] args) {
        int number = 16; // Replace with your number

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    private static boolean isEven(int number) {
        // Check the least significant bit
        return (number & 1) == 0;
    }
}