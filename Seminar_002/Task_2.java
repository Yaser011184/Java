package Java_projects.Seminar_002;

public class Task_2 {
    public static void main(String[] args) {
        String line = "aaaabbbcddaaa";
        System.out.println(commpresLine(line));
    }

    private static String commpresLine(String line) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        for (int i = 0; i < line.length() - 1; i++) {

            if (line.charAt(i) == line.charAt(i + 1))
                count++;
            else {
                str.append(line.charAt(i));
                if (count > 1)
                    str.append(count);
                count = 1;
            }

        }
        str.append(line.charAt(line.length() - 1));
        if (count > 1)
            str.append(count);
        return str.toString();
    }

}
