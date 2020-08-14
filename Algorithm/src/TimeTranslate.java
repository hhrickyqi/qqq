import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//关于时间格式转换的一个demo
public class TimeTranslate {
    public static void main(String[] args) {
        long groupTime = 24 * 1000 * 60 * 60;
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ff = df.format(date.getTime() + groupTime);
        try {
            date = df.parse(ff);
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println(date);
    }
}
