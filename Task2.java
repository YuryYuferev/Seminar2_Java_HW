/*Дана строка (получение через обычный текстовый файл!!!)
"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
"фамилия":"Краснов","оценка":"5","предмет":"Физика"
Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/
 
import java.io.*;
import java.util.logging.Logger;

public class Task2 {
    public static void main(String[] args) throws IOException {
        logger(getText(new File("students.txt")));
    }

    public static String getText(File file) throws FileNotFoundException {
        StringBuilder text = new StringBuilder("");
        try {
            try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
                String line = bf.readLine();
                while (line != null) {
                    text.append(String.format("{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}"));
                    line = bf.readLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return String.valueOf(text);
    }

    public static void logger(String message) {
        Logger l = Logger.getAnonymousLogger();
        l.info(message);
    }
}


