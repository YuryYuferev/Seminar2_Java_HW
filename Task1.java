/*Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл. */

import java.util.Arrays;
import java.io.FileWriter;
import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {
        int[] mas = { 11, 3, 14, 16, 7, 23, 55, 1, 99, 10 };

        boolean isSorted = false;
        int buf;
        while (!isSorted) {

            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        logger("обработка массива");
        System.out.println(Arrays.toString(mas));
    }

    public static void logger(String text) { 
        try {
            try (FileWriter log = new FileWriter("log2.txt", true)) {
                log.write(LocalDateTime.now() + " " + text + "\n");
                log.flush();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}

