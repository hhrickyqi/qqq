public class Demo03 {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer i1 = new Integer(10);
        System.out.println(i == i1);

        Integer i2 = new Integer(128);
        Integer i3 = new Integer(128);
        System.out.println(i2 == i3);

        Integer i4 = 10;
        Integer i5 = 10;
        System.out.println(i4 == i5);

        System.out.println(Integer.MAX_VALUE);


    }
}
