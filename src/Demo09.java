public class Demo09 {
    public static void main(String[] args) {
        int[] a = {-10, 58, 74, 56};
        int max = Integer.MIN_VALUE;
        for (int y : a) {
            if (max < y) {
                max = y;
            }

        }
        System.out.println(max);
    }
}
