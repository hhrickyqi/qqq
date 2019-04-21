import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        String s1 = "123456";
        String s2 = "456789";
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2));
        System.out.println(b1.remainder(b2));
        System.out.println(Arrays.toString(b1.divideAndRemainder(b2)));
        String s3 = "1.14546546";
        BigDecimal bm = new BigDecimal(s3);
        System.out.println(bm);
    }
}
