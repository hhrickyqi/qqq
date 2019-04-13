public class Demo05 {
    public static void main(String[] args) {
        /*int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
        int i = 1;
        int num = 1;
        while (i <= 10) {

            num *= i;
            i++;

        }
        System.out.println(num);*/
        /*int i = 1;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println(i + "是偶数");
            }
            if (i % 2 == 1) {
                System.out.println(i + "是奇数");
            }
            if (i % 3 == 0) {
                System.out.println(i + "是3的倍数");
            }
            i++;
        }*/
        //continue表示跳过当次循环，break表示跳出循环；
        /*int i = 1;
        int sum = 0;
        do {
            int num = 1;
            int j = i;
            do {
                num *= j;
                j--;
            }while(j > 0);
            i++;
            sum +=num;
        }while(i <= 10);
        System.out.println(sum);*/
        /*输出10个斐波那契（Fibonacci）数列：1 1 2 3 5 8 13 21 34 55。（特点：第1,2两个数值为1
        ，从第三个数开始，该数是其前面两个数之和）*/

        /*int i = 1;
        int j = 1;
        for(int n = 0;n < 5;n++){
            System.out.print(i + " " + j + " ");
            i = i + j;
            j = i + j;
        }*/


    }
}
