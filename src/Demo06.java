public class Demo06 {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        for (int i = 1;i <= 9;i++){
            for(int j = 1;j <= 9;j++){
                if(j <= i){
                    System.out.print(j + "*" + i + "=" + i * j + "  ");
                }
            }
            System.out.println();
        }
        /*for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();


        }*/
        /*for (int i = 1;i <= 5;i++){
            for (int j = 5;j >= i;j--){
                System.out.print(" ");
            }
            for (int k = 1;k <= 2*i - 1;k++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*char a = 'A';
        for (int i = 1;i <= 5;i++){
            for (int j = 5;j >= i;j--){
                System.out.print(" ");
            }
            for (int k = 1;k <= 2*i - 1;k++){
                System.out.print(a);
            }
            a++;
            System.out.println();
        }*/
    }
}
