package Java_projects.Seminar_002;

import java.io.FileWriter;
import java.io.IOException;

public class Task_3 {
    public static void main(String[] args) {
        String text = "TEXT";
        int repeat = 100;
        String result = strRepeat(text, repeat);
        System.out.println(result);
        writeToFile(result);
    }

    private static String strRepeat(String word, int count) {
        StringBuilder result = new StringBuilder();
         result.append(word.repeat(count));  // Эквивалент умножения строк
        // String result = word * count;
        // for (int i = 0; i < count; i++) {
        //     result.append(word);
    //     }
        return result.toString();
     }

    private static void writeToFile(String text) {

        try (FileWriter writer = new FileWriter("text.txt")) {
            writer.append(text);
        } catch (IOException ex) {
            System.out.println(" Ошибка записи в файл. ");
        }
    }
}
