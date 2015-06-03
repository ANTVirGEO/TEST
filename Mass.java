package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Mass {

    public ArrayList Generate (int N){
        System.out.println("Принятое значение N=" + N);
        System.out.println("//////////Заполнение существующего массива для старта задания\\\\\\\\\\\\\\\\\\\\");
        ArrayList<Integer> Massiv = new ArrayList<>();
        for (int i = 1; Massiv.size() < (N) ; i++) {
            System.out.println(i);
            Massiv.add(i);
            System.out.println(Massiv);
        }
        System.out.println("Размер текущего массива=" + Massiv.size());
        System.out.println("Внутренности массива:" + Massiv);
        return Massiv;
    }

    public void Algoritm (ArrayList Massiv, int N){
        int endGOTO=0;
        int k = 0;
        System.out.println("//////////Старт алгоритма\\\\\\\\\\\\\\\\\\\\");
        Random rand = new Random();
        System.out.println("Размер массива: " + Massiv.size());
        for (int i = N; endGOTO<100; i++) {
            System.out.println("Размер массива: " + Massiv.size());
            int p = rand.nextInt((N)) + 1;
            int count = Collections.frequency(Massiv, p);
            System.out.println("Count of doubles= "+String.valueOf(count));
            System.out.println("p= "+p);
            if (count==1) {
                Massiv.add(p);
                System.out.println(Massiv);
                if (Massiv.size()==(N*2)){
                    System.out.println("Новый размер массива: " + Massiv.size());
                    System.out.println("Вывод нового шуффла массива: " + Massiv);
                    int t = rand.nextInt((N * 2));
                    System.out.println("Рандомный индекс для удаления элемента массива: " + t);
                    k = (int) Massiv.get(t);
                    Massiv.remove(t);
                    System.out.println("Вывод обрезанного массива: " + Massiv);
                    System.out.println("Вычлененный нами элемент массива содержал цифру= " + k);
                    endGOTO=100500;
                }
            }
        }
    }
}
