import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] no = {1, 3, 5, 7, 9};
        boolean flag = false;
        for (int b : no) {
            if (a == b) {
                flag = true;
                break;
            }
        }
        if (flag == false){
            System.out.println("no");
        }
        else {
            System.out.println("yes");
        }
    }
}