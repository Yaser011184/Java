import java.time.LocalTime;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
       
        Scanner iScanner = new Scanner(System.in, "866");
        System.out.println(" Введите имя");
        String name = iScanner.nextLine();

        LocalTime time = LocalTime.now();
        if (time.getHour()>= 5 && time.getHour()<= 12) {
            System.out.printf(" Доброе утро, %s!", name);
        }
        if (time.getHour()>= 12 && time.getHour()<= 18) {
            System.out.printf(" Добрый день, %s!", name);
        }
        if (time.getHour()>= 18 && time.getHour()<= 22) {
            System.out.printf(" Добрый вечер, %s!", name);
        }
        else {
            System.out.printf(" Доброй ночи, %s!", name);
        }
        
    }
}
