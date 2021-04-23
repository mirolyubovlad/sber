package week1;
/*
Игра Угадай число
Компьютер генерирует случайное число в диапазоне от 0 до 10.
Игрок вводит ответ с клавиатуры. Если введенное число больше или меньше загаданного,
компьютер дает подсказку. Если число угадано, программа завершается.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int r = (int) (Math.random() * 10) +1;
        System.out.println("Введи число от 1 до 10");

        int i = 11;

        while (i != r)
        {
            i = Integer.parseInt(reader.readLine());
            if (i == r)
                break;

            if (i < r)
                System.out.println("больше");
            else
                System.out.println("меньше");
        }
        System.out.println("Угадано!");

    }
}
