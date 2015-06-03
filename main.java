package test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main (String []args){
        int N;int norm;
        System.out.println("Введите N массива");
        Scanner in = new Scanner(System.in);
        try {
            N = in.nextInt();
            norm=1;
        } catch (Exception e){
            System.out.println("Ошибка вводного числа! : "+e+"\n Программа прекратила свобю работу");
            N=0;
            norm=0;
        }
        if (norm==1){
            System.out.println("//////////Заполнение существующего массива для старта задания\\\\\\\\\\\\\\\\\\\\");
            ArrayList<Integer> vah= new ArrayList<>();
            for (int i = 1; i < N+1 ; i++) {
                vah.add(i);
            }
            System.out.println("Принятое значение N="+N);
            System.out.println("Размер текущего массива="+vah.size());
            System.out.println("Внутренности массива:"+vah);
            System.out.println("//////////Старт алгоритма\\\\\\\\\\\\\\\\\\\\");
            for (int i = N; i <N*2 ; i++) {
                vah.add(vah.get(i-N));
            }
            System.out.println("Новый размер массива: "+N*2);
            System.out.println("Вывод нового массива: "+vah);
            Collections.shuffle(vah);
            System.out.println("Вывод шуффла массива: "+vah);
            Random rand = new Random();
            int t = rand.nextInt((N*2))+0;
            System.out.println("Рандомный индекс для удаления элемента массива: "+t);
            vah.remove(t);
            System.out.println("Обрезанный массив: "+vah);
            for (int counter : vah){
                int count = Collections.frequency(vah,counter);
                if (String.valueOf(count).equals("1")){
                    System.out.println("Вычлененный нами элемент массива содержал цифру= "+counter);
                }
            }
        }
    }
}


