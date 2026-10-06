package Tasks;
import java.util.Scanner;

public class SecondTask {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("X: ");
        double x = scanner.nextDouble();

        System.out.print("N: ");
        int n = scanner.nextInt();

        double term = x; // Первое слагаемое
        double result = term; // Ответ

        for (int k = 1; k <= n; k++) {
            term = -term * (x * x) / ((2 * k) * (2 * k + 1));
            result += term;
        }

        System.out.println("sin(X) ~ " + result);

        scanner.close();
    }
}

