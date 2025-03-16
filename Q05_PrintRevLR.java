import java.util.Scanner;

public class Q05_PrintRevLR{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close(); 

        int mid = n / 2; // Calculate the midpoint

        for (int i = 1; i <= n; i++) {
            if (i <= mid) {
                // Print the left side in reverse order
                System.out.print((mid - i + 1) + " ");
            } else if (i == mid + 1) {
                // Print the middle number (if odd) or the start of the right side
                System.out.print((mid + 1) + " ");
            } else {
                // Print the right side in reverse order
                System.out.print((n - (i - mid - 2)) + " ");
            }
        }
    }
}