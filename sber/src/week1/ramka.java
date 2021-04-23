package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ramka {

    public static void width(int i)
    {
        int count = 1;

        while (count <= i) {
            System.out.print("*");
            count++;
        }
        System.out.println();
    }

    public static void center(int ssize, int width, String s)
    {

        System.out.print("*");

        int probels = (width - ssize) / 2;
        int count2 = 1;

        while (count2 <= probels)
        {
            System.out.print(" ");
            count2++;
        }
        count2 = 1;

        System.out.print(s);

        while (count2 <= probels)
        {
            System.out.print(" ");
            count2++;
        }
        if (((probels * 2) + ssize) != width)
            System.out.print(" ");
        System.out.println("*");

    }

    public static void length (int length, int ssize, int width, String s)
    {
        int center = (length +2) / 2;
        int count = 1;
        int countprobel = 1;

        while (count <= length)
        {
            if (center == count)
            {
                center(ssize, width, s);
                count++;
                continue;
            }
            System.out.print("*");
            while (countprobel <= width) {
                System.out.print(" ");
                countprobel++;
            }
            System.out.println("*");
            countprobel = 1;
            count++;
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        int width = Integer.parseInt(reader.readLine());

        String s = reader.readLine();
        int ssize = s.length();

        if (ssize > width)
            System.out.println("Error: string > width");
        else if (length < 3)
        {
            System.out.println("length min 3");
        }
        else
        {
            width(width);
            length(length - 2, ssize, width -2, s);
            width(width);
        }


    }

}
