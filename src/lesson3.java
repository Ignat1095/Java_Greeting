public class lesson3 {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
        long start, stop;
        start = System.currentTimeMillis();

        for (int i = 0; i <1_000_000 ; i++) {
            s.append("+");
//            System.out.println(s);
        }
        stop = System.currentTimeMillis();
        System.out.println(stop-start);
    }

}
