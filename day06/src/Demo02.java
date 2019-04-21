import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        int[] a = {54,56,7877,31,12};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        String[] b = {"das","adde","dsa"};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        Cat[] cats = {new Cat(10,"mm"),new Cat(20,"ss"),new Cat(8,"tt")};
        Arrays.sort(cats,new CatComparator());//对CatComparator的调用
        System.out.println(Arrays.toString(cats));
    }
}
