package test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class test {

    public static void main (String []args) {
        int N;
        int norm;


        System.out.println("Введите цифровое значение N массива ниже и нажмите Enter");
        Scanner in = new Scanner(System.in);
        try {
            N = in.nextInt();
            norm = 1;
            if (N == 0) {
                System.out.println("Массив не может быть равен нулю!");
            } else {
                if (norm == 1) {
                    Mass m = new Mass();
                    m.Algoritm(m.Generate(N),N);
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка вводного числа! : " + e + "\n Программа прекратила свою работу");
            N = 0;
            norm = 0;
        }
    }
}


