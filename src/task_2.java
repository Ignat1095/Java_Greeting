/* 1) Напишите программу на Java, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
2) Напишите программу на Java, чтобы проверить, являются ли две данные строки вращением друг друга.
3) *Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.
4) Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
5) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
6) *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
7) **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.*/
public class task_2 {

    public static void main(String[] args) {
        String a = "Sasha walked along the highway and sucked dry.";
        String b = "Sasha walked";
        System.out.println(b);


//        1.
        System.out.println("\n1) Поиск строки \"b\" в \"a\". ");
        if (a.contains(b)) System.out.println("Наименьшее окно в строке: \"" + b + "\"");


//        2.
        System.out.println("\n2) вращение строки. ");
        if (searchForReverse(a, b)) {
            System.out.println("Строки являются вращением друг друга");
        } else System.out.println("Строки не являются вращением друг друга _/()-()\\_");


//        3.
        System.out.println("\n3) перевоот рекурсией. ");
        char[] c = b.toCharArray();
        reverse(c, 0, c.length - 1);
        b = new String(c);
        System.out.println("Реверс рекурсией строки  \"b\": " + b);


//        4.
        System.out.println("\n4) StringBuilder.append(). ");
        int mum1 = 3;
        int num2 = 56;
        StringBuilder summa = new StringBuilder();
        summa.append(String.format("%d + %d = %d \n",mum1,num2, mum1+num2));
        summa.append(String.format("%d - %d = %d \n",mum1,num2, mum1-num2));
        summa.append(String.format("%d * %d = %d ",mum1,num2, mum1*num2));
        System.out.println(summa);


//        5.
        System.out.println("\n5) замените символ “=” на слово “равно”, " +
                "с помощью методов:\n" +
                "StringBuilder.insert() и\n" +
                "StringBuilder.deleteCharAt()\n");
        System.out.println(changeEquals(summa));


//        6.
        System.out.println("\n6) Замените символ “=” на слово “равно”, спомощью методов: \n" +
                "StringBuilder.replace(). \n");
        System.out.println(replaceEquals(summa));
    }

//    ===============================================================
//    ===============================================================


//    2
//    являются ли две данные строки вращением друг друга.
    public static boolean searchForReverse(String a, String b){
        return a.equals(new StringBuilder(b).reverse().toString());
    }

//    3
    // Рекурсивная функция для обращения заданной строки
    private static void swap(char[] c, int i, int j)
    {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
    public static void reverse(char[] c, int l, int h)
    {
        if (l < h)
        {
            swap(c, l, h);
            reverse(c, l + 1, h - 1);
        }
    }

//    5
//    Замените символ “=” на слово “равно”. Используйте методы
//    // StringBuilder.insert(),
//    // StringBuilder.deleteCharAt().
    public static StringBuilder changeEquals(StringBuilder summa){
        StringBuilder newSumma = new StringBuilder(summa);
        int count = 0;
        while (count!=3){
            int index = newSumma.indexOf("=");
            System.out.println(index);
            newSumma.deleteCharAt(index).insert(index,"равно");
            count += 1;
        }
        return newSumma;
    }

//    6
//    --//--
//    StringBuilder.replace()
    public static StringBuilder replaceEquals(StringBuilder summa){
        StringBuilder newSumma2 = new StringBuilder(summa);
        int count = 0;
        while (count!=3){
            int index = newSumma2.indexOf("=");
//            System.out.println(index);
            newSumma2.replace(index,index + 1,"равно");
            count += 1;
        }
        return newSumma2;
}


}
