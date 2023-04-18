// Вывести все простые числа от 1 до 1000.

package Java_projects.Homeworks.Home_1;

public class Task002 {

    public static void main(String[] args) {

        boolean b = true;
        for (int P = 2; P <= 1000; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.print(P + " ");
            else
                b = true;

        }
    }

}
