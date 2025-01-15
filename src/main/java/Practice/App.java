package Practice;
public class App {
    public static void main(String[] args) {
        int n = 10000; // Number of iterations
        String result = "";
        
        long startTime = System.nanoTime();
        
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("Iteration ").append(i).append("\n");
        }
        result = stringBuilder.toString();
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Milliseconds
        
//        System.out.println("Time taken with StringBuilder: " + duration + " ms");
//        
//        
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("Hello, ");
//        stringBuffer.append("World!");
//        System.out.println(stringBuffer.toString());
//        
//        StringBuilder stringBuilder1 = new StringBuilder();
//        stringBuilder1.append("Hello, ");
//        stringBuilder1.append("World!");
//        System.out.println(stringBuilder1.toString());
    }
}
