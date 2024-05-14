import java.util.Scanner;

public class FibonaciiSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = scanner.nextInt();
        scanner.close();
        
        int first = 0, second = 1;
        System.out.println("Fibonacci series up to " + n + " is:");
        System.out.print(first + " " + second + " ");
        
        int next;
        while ((next = first + second) <= n) {
            System.out.print(next + " ");
            first = second;
            second = next;
}
}
}   