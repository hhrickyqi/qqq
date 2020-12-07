import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

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

    @Test
    public void testTime(){
        StringBuilder sb = new StringBuilder();
        String date = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        Random r = new Random();
        int number = r.nextInt(90000) + 10000;
        sb.append("Z");
        sb.append(date);
        sb.append(number);
        System.out.println(sb);
        System.out.println(number);

    }

    @Test
    public void helloWorld(){
        String st = String.valueOf(0);
    }



}
