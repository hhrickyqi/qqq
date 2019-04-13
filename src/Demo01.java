import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入高：");
        int h = sc.nextInt();
        System.out.println("请输入半径：");
        int r = sc.nextInt();
        System.out.println("体积" + 3.14 * r * r * h);*/
       //定义一个五位数，各个位数上的和
        int a = 54321;
        int q = a / 10000 % 10;
        int w = a / 1000 % 10;
        int e = a / 100 % 10;
        int r = a / 10 % 10;
        int y = a % 10;
        System.out.println("各个位数上的和:\n" + (q + w + e +r +y));
    }
}
