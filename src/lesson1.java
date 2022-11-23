
public class lesson1 {
    public static final int LESSON_MAX = 6;

    public lesson1() {
    }

    public static void main(String[] args) {

        boolean ch = true;
        boolean b = true;
        float fl = 4.235634F;
        double d = 44.56;
        boolean[] b_array = new boolean[6];
        int i = (int)fl;
        int j = 0;

        for(boolean s = true; j < 10; ++j) {
            ++i;
        }

        while(i < 46) {
            i = 47;
        }

        if (b_array[2]) {
            b_array[2] = false;
        }

        String strOne = "sdg";
        strOne = strOne + "new";
        String.valueOf(b_array);
        strOne.split("n");
        strOne.contains("wef");
        "hello".repeat(5);
        strOne.matches("Ne Hello World");
        strOne.compareTo("Wo");
        char[] chOne = new char[256];
        char[] tmp = new char[chOne.length + 5];
        System.out.println(strOne);
        Integer i2 = 4;
        int m = Integer.max(2, 5);
        Integer.bitCount(56);
    }
}