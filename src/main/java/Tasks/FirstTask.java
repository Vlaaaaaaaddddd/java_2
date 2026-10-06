package Tasks;
import java.util.Scanner;
//Даны целые A и B (A < B).
//Вывести по возрастанию все числа от A до B включительно и их количество.
public class FirstTask {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        int a = scanner.nextInt();

        System.out.print("B: ");
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("A должно быть меньше B");
            return;
        }

        System.out.print("Числа: ");
        for (int i = a; i <= b; i++){
            System.out.print(i + " ");
        }
        System.out.println(' ');
        System.out.println("Количество: " + (b - a + 1));

        scanner.close();
    }
}
