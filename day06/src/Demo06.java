import com.practice.tools.DecimalFormatUtils;

import java.text.DecimalFormat;

public class Demo06 {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println(DecimalFormatUtils.getDcimalFormatForFourDouble(pi));
        System.out.println(DecimalFormatUtils.getDcimalFormatForInt(pi));
        System.out.println(DecimalFormatUtils.getDcimalFormatForPercent(pi));
    }
}
