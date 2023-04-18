package Java_projects.Homeworks.Home_1;

import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        double b = scanner2.nextDouble();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите действие: ");
        char c = scanner3.next().charAt(0);
        double res = 0;
        if (c == '+') {
            res = a + b;
        }
        else if (c == '-') {
            res = a - b;
        }
        else if (c == '*') {
            res = a * b;
        }
        else if (c == '/') {
            res = a / b;
        }
        System.out.println(res);
    








    }
}
