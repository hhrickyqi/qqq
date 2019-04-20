import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Locale l1 = new Locale("zh","CN");
        Locale l2 = new Locale("en","US");
        Locale l3 = Locale.getDefault();
        ResourceBundle rb = ResourceBundle.getBundle("bao/info",l1);
        String str = rb.getString("system.name");
        System.out.println(str);
        System.out.println(rb.getString("login.username"));
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        System.out.println(rb.getString("login.pwd"));
        String pwd = sc.next();
        if("admin".equals(username)&&"12345".equals(pwd)){
            System.out.println(rb.getString("login.success"));
            String welcome = rb.getString("welcome");
            welcome = MessageFormat.format(welcome,username);
            System.out.println(welcome);
        }else {
            System.out.println(rb.getString("login.error"));
        }
    }
}
