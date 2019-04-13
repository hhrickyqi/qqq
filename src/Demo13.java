import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        String[] pool = getPool();
        String[] sysRedBalls = getRedBalls(pool);
        Arrays.sort(sysRedBalls);
        System.out.println(Arrays.toString(sysRedBalls));
        Random r = new Random();
        String sysBlueBall = pool[r.nextInt(16)];
        System.out.println("选择方式：1、机选 2、人选");
        Scanner sc = new Scanner(System.in);
        int method = sc.nextInt();
        String[] userRedBalls = new String[6];
        String userBlueBall = "";
        switch (method) {
            case 1:
                userRedBalls = getRedBalls(pool);
                userBlueBall = pool[r.nextInt(16)];
                break;
            case 2:
                System.out.println("输入6个红球：");
                for (int i = 0; i < userRedBalls.length; i++) {
                    userRedBalls[i] = sc.next();
                }
                System.out.println("输入1个蓝球：");
                userBlueBall = sc.next();
                break;
            default:
                System.out.println("错误输入！");
                break;
        }
        System.out.println("系统蓝球:" + sysBlueBall);
        System.out.println("用户蓝球:" + userBlueBall);
        Arrays.sort(userRedBalls);
        System.out.println("用户红球:" + Arrays.toString(userRedBalls));
        int count = 0;
        for (int i = 0; i < sysRedBalls.length; i++) {
            for (int j = 0; j < sysRedBalls.length; j++) {
                if (sysRedBalls[i].equals(userRedBalls[j])) {
                    count++;
                }
            }
        }
        if(sysBlueBall.equals(userBlueBall))
        {
            switch (count){
                case 6:
                    System.out.println("一等奖");
                    break;
                case 5:
                    System.out.println("三等奖");
                    break;
                case 4:
                    System.out.println("四等奖");
                    break;
                case 3:
                    System.out.println("五等奖");
                    break;
                case 2: case 1: case 0:
                    System.out.println("六等奖");
                    break;
            }
        }
        else {
            switch (count){
                case 6:
                    System.out.println("二等奖");
                    break;
                case 5:
                    System.out.println("四等奖");
                    break;
                case 4:
                    System.out.println("五等奖");
                    break;
                case 3: case 2: case 1: case 0:
                    System.out.println("未中奖");
                    break;
            }
        }
    }

    private static String[] getRedBalls(String[] pool) {
        String[] redBalls = new String[6];
        boolean[] isUsed = new boolean[pool.length];
        int count = 0;
        Random r = new Random();
        while (true) {
            int index = r.nextInt(pool.length);
            if (isUsed[index])
                continue;
            isUsed[index] = true;
            redBalls[count++] = pool[index];
            if (count == redBalls.length)
                break;
        }
        return redBalls;

    }

    public static String[] getPool() {
        String[] pool = new String[33];
        for (int i = 1; i <= 33; i++) {
            if (i < 10) {
                pool[i - 1] = "0" + i;
            } else {
                pool[i - 1] = "" + i;
            }
        }
        return pool;
    }
}