package test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class test {

    public static void main (String []args) {
        int N;
        int norm;
        int k = 0;
        System.out.println("Введите цифровое значение N массива ниже и нажмите Enter");
        Scanner in = new Scanner(System.in);
        try {
            N = in.nextInt();
            norm = 1;
        } catch (Exception e) {
            System.out.println("Ошибка вводного числа! : " + e + "\n Программа прекратила свою работу");
            N = 0;
            norm = 0;
        }
        if (N == 0) {
            System.out.println("Массив не может быть равен нулю!");
        } else {
            if (norm == 1) {
                System.out.println("Принятое значение N=" + N);
                System.out.println("//////////Заполнение существующего массива для старта задания\\\\\\\\\\\\\\\\\\\\");
                ArrayList<Integer> vah = new ArrayList<>();
                for (int i = 1; vah.size() < (N) ; i++) {
                    System.out.println(i);
                    vah.add(i);
                    System.out.println(vah);
                }
                System.out.println("Размер текущего массива=" + vah.size());
                System.out.println("Внутренности массива:" + vah);
                System.out.println("//////////Старт алгоритма\\\\\\\\\\\\\\\\\\\\");
                Random rand = new Random();
                System.out.println("Размер массива: "+vah.size());
                for (int i = N; vah.size() < (N*2); i++) {
                    System.out.println("Размер массива: "+vah.size());
                    int p = rand.nextInt((N)) + 1;
                    int count = Collections.frequency(vah,p);
                    System.out.println("Count of doubles= "+String.valueOf(count));
                    System.out.println("p= "+p);
                    if (count==1) {
                        vah.add(p);
                        System.out.println(vah);
                        if (vah.size()==(N*2)){
                            System.out.println("Новый размер массива: " + vah.size());
                            System.out.println("Вывод нового шуффла массива: " + vah);
                            int t = rand.nextInt((N * 2));
                            System.out.println("Рандомный индекс для удаления элемента массива: " + t);
                            k = vah.get(t);
                            vah.remove(t);
                            System.out.println("Вывод обрезанного массива: " + vah);
                            System.out.println("Вычлененный нами элемент массива содержал цифру= " + k);
                        }
                    }
                }
            }
        }
    }
}


