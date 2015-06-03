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
            Massiv.add(i);
        }
        System.out.println("Размер текущего массива=" + Massiv.size()+"\nВнутренности массива: " + Massiv);
        return Massiv;
    }

    public void Algoritm (ArrayList Massiv, int N){
        int endGOTO=0;
        int k = 0;
        System.out.println("//////////Старт алгоритма\\\\\\\\\\\\\\\\\\\\");
        Random rand = new Random();
        for (int i = N; endGOTO<100; i++) {
            int p = rand.nextInt((N)) + 1;
            int count = Collections.frequency(Massiv, p);
            if (count==1) {
                Massiv.add(p);
                if (Massiv.size()==(N*2)){
                    System.out.println("Новый размер массива: " + Massiv.size()+"\n"+
                            "Вывод нового массива со случайным порядком," +
                            " не затрагивающим элементый начального массива: " + Massiv);
                    int t = rand.nextInt(N)+N;
                    System.out.println("Рандомный индекс для удаления элемента массива= " + t);
                    k = (int) Massiv.get(t);
                    Massiv.remove(t);
                    System.out.println("Вывод обрезанного массива, " +
                            "не затрагивающего элементов изначального массива: " + Massiv+"\n" +
                            "Вычлененный нами элемент массива содержал цифру= " + k);
                    System.out.println();
                    endGOTO=100500;
                }
            }
        }
    }
}
