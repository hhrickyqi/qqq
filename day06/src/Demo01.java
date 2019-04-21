

import com.practice.tools.DateFormatUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Demo01 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());
        Calendar c = Calendar.getInstance();
        Calendar cc = new GregorianCalendar();
        System.out.println(c.get(1) + "年" + c.get(Calendar.MONTH) + 1//Calendar.YEAR默认值为1所以可以用1代替，+1则是由于系统月份为0-11
        + "月" + c.get(Calendar.DAY_OF_MONTH) + "日" + c.get(Calendar.HOUR)
        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + ":"
        + c.get(Calendar.MILLISECOND));
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println(df.format(d));
        System.out.println(DateFormatUtils.getFormatDate(d));

    }
}
