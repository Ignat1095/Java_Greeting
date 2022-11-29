//Первый семинар.
//1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//Пункты реализовать в методе main
//*Пункты реализовать в разных методах
//
//int i = new Random().nextInt(k); //это кидалка случайных чисел!)


import java.util.Arrays;
import java.util.Random;

public class task_1 {

    static int max = 10;
    static int min = 1;
    public static void main(String[] args) {


        // 1.
        int i = new Random().nextInt(min,max);
//        int i = getRandom_X(min, max);
        System.out.println("i = "+i);

        // 2.
        int n = get_high_order_bit(i);
        System.out.println("n = "+n);

        // 3.
        int m1[] = multiples_n(i, n);
//        Arrays.sort(m1);
        System.out.println("Кратные n = "+Arrays.toString(m1));

        // 4.
//        int m2[] = not_multiples_n(i, n);
//        System.out.println("Некратные n = "+Arrays.toString(m2));

        // 4*
//        for (int v: m2){
//            System.out.println(v);
//        }
    }



    // Рандомное число от Min до Max
//    public static int getRandom_X(int min, int max) {
//        return (int) (Math.random() * ((max - min) + 1)) + min;
//    }


    //    номер старшего значащего бита выпавшего числа
    public static int get_high_order_bit (int n) {
        int res = 0;
        while (n != 1) {
            n >>= 1;
            res++;
        }
        return res;
    }


    //    Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

    public static int[] multiples_n(int i, int n){
        int[] m1 = new int[10];
        int max_value = 30;
        for (int j = 0; i < max_value ; j++,i++) {
            if (j>= m1.length){
                int[] tmp = Arrays.copyOf(m1,m1.length+1);
                m1 = tmp;
            }
            if (i % n == 0){
                m1[j] = i;
            }

        }
        return m1;
    }


    //    Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//    public static int[] not_multiples_n(int i, int n){
//        int[] m2 = new int[100];                                 //TODO
//        int min_value = Short.MIN_VALUE;
//
//        for (int j = 0; min_value < i ; min_value++) {
//            if (j % n !=0){
//                m2[j] = min_value;
//                min_value++;
//            }
//        }
//        return m2;
//    }
}