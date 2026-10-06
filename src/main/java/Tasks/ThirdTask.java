package Tasks;
import java.util.Scanner;

public class ThirdTask {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        long n = scanner.nextLong();

        System.out.println(fibonacci(n));
        scanner.close();
    }

    static boolean fibonacci(long x){
        if (x < 0) {
            return false;
        }
        if (x == 0 || x == 1) {
            return true;
        }
        long before = 1;
        long current = 1;
        while (true) {
            long next = before + current;
            if (next > x) {
                return false;
            } else if (next == x) {
                return true;
            }
            before = current;
            current = next;
        }
    }
}
