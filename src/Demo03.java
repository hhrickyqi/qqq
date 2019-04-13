public class Demo03 {
    public static void main(String[] args) {
        int x = 2018;
        if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0) {
            System.out.println("是闰年");
        } else {
            System.out.println("是平年");
        }
    }
}
