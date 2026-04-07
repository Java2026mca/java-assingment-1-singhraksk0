import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        def hollow_diamond(n):
    # Upper half including middle
    for i in range(n):
        # Leading spaces
        print(" " * (n - i - 1), end="")
        # First star
        print("*", end="")
        if i > 0:
            # Inner spaces
            print(" " * (2 * i - 1), end="")
            # Second star
            print("*", end="")
        print()  # Newline

    # Lower half
    for i in range(n - 2, -1, -1):
        print(" " * (n - i - 1), end="")
        print("*", end="")
        if i > 0:
            print(" " * (2 * i - 1), end="")
            print("*", end="")
        print()

# Example usage:
hollow_diamond(4)

        // TODO: Print a hollow diamond pattern of half-height n using '*'
        //
        // Rules:
        //   - Only border cells have '*', inside is spaces
        //   - No trailing spaces on any line
        //
        // Input: 4
        // Output:
        //    *
        //   * *
        //  *   *
        // *     *
        //  *   *
        //   * *
        //    *

    }
}
