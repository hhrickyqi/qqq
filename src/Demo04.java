import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println("请输入月份：");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("这个月有31天");
                break;
            case 2:
                System.out.println("这个月有28天");
               break;
            default:
                System.out.println("这个月有30天");


        }


    }
}
