//odd number
public class AddOddNmbers {
    public static int sumOddNumbers(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int start = 1; // Start of the range
        int end = 20; // End of the range
        int sum = sumOddNumbers(start, end);
        System.out.println("Sum of odd numbers between " + start + " and " + end + ": " + sum);
    }
}