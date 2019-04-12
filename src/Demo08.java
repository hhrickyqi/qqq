public class Demo8 {
    public static void main(String[] args) {
        int[][] no = {{54, 78, 79}, {66, 74, 34}, {96, 99, 78}};

        for (int i = 0; i < no.length; i++) {
            float sum =0.0F;
            for (int j = 0; j < no[i].length; j++) {

                sum += no[i][j];

            }
            System.out.println((i+1) + "班平均分:" + sum/no[i].length);
        }
    }
}
