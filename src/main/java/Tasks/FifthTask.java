package Tasks;

import java.util.Scanner;

public class FifthTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            printMenu();
            System.out.print("Выберите пункт: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Введите число от 1 до 4");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            if (choice == 1) {
                calculateBmiProcess(scanner);
            } else if (choice == 2) {
                showAbout();
            } else if (choice == 3) {
                showAuthor();
            } else if (choice == 4) {
                System.out.println("Выход");
            } else {
                System.out.println("Такого пункта нет");
            }
        }

        scanner.close();
    }

    static void printMenu() {
        System.out.println("МЕНЮ");
        System.out.println("1. Выполнить расчёт");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
    }

    static double readPositiveDouble(Scanner scanner, String message) {
        double value;
        while (true) {
            System.out.print(message);

            if (!scanner.hasNextDouble()) {
                System.out.println("Введите число");
                scanner.next();
                continue;
            }

            value = scanner.nextDouble();

            if (value <= 0) {
                System.out.println("Число должно быть больше нуля");
                continue;
            }

            return value;
        }
    }

    static void calculateBmiProcess(Scanner scanner) {
        double weight = readPositiveDouble(scanner, "Введите ваш вес в кг: ");
        double height = readPositiveDouble(scanner, "Введите ваш рост в метрах: ");

        double bmi = calculateBmi(weight, height);

        System.out.printf("Ваш ИМТ: %.2f%n", bmi);
        printCategory(bmi);
        System.out.println();
    }

    static double calculateBmi(double weight, double height) {
        return weight / (height * height);
    }

    static void printCategory(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Недостаточная масса тела");
        } else if (bmi < 25) {
            System.out.println("Нормальная масса тела");
        } else if (bmi < 30) {
            System.out.println("Избыточная масса тела");
        } else {
            System.out.println("Ожирение");
        }
    }

    static void showAbout() {
        System.out.println("Программа для расчёта индекса массы тела");
    }

    static void showAuthor() {
        System.out.println("Выполнил Худяков В.А.");
    }
}