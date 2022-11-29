import java.util.*;

public class lesson2 {

    public static void main(String[] args) {

        int[] ar1 = {1,4,8,7,43,2,2,21};
        Arrays.sort(ar1,0,ar1.length/2);
//        System.out.println(Arrays.toString(ar1));


        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = new Random().nextInt(20);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] tmp = new int[arr.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[tmp.length-i-1] = arr[i];
        }
        System.out.println(Arrays.toString(tmp));

        String s = "";
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.append("asd");
        s = stringBuilder.toString();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            s += Character.toString(i);
        }
        System.out.println(System.currentTimeMillis() - start);

    }
}
