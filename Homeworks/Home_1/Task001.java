// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Java_projects.Homeworks.Home_1;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        double n = scanner.nextInt();
        double res = (n / 2) * (n + 1);
        System.out.println(res);
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(fact);

    }
}
