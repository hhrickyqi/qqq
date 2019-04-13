import java.util.Arrays;

public class Demo12 {
    public static void main(String[] args) {
        int[] a = {85,55,40,32,97};
        for(int i = 0;i < a.length;i++)
        {
            int k = i;
            for (int j = i + 1;j < a.length;j++)
            {
                if(a[k] > a[j])
                {
                    k = j;
                }
            }
            if(k != i ){
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
