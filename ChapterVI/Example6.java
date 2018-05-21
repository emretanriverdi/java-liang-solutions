/**
 *  Created by User on 15.12.2016.
 */
public class Example6 {
    public static void main(String[] args) {
        displayPattern(9);
    }
    public static void displayPattern(int n) {
        int padding = n - 1;	// Holds number of whitespace
        for (int r = 1; r <= n; r++) {
            // Print padding
            for (int p = 0; p < padding; p++) {
                System.out.print("  ");
            }

            // Print numbers
            for (int i = r; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            padding--; // Decrement padding
        }
    }
}
