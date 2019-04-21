import com.practice.tools.MD5Utils;


public class Demo07 {
    public static void main(String[] args) {
        String psd = "jsgdjjsgd*-df";
        System.out.println(MD5Utils.getMessageDigest(psd));
    }
}
