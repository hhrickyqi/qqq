import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
        int[] a = {21, 87, -5, 16};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++)
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
        }
        System.out.println(Arrays.toString(a));
    }
}