import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        String str = "小芮芮芮芮";
        String str1 = new String("小芮");
        char[] jmr = str.toCharArray();
//        System.out.println(str == str1);
//        System.out.println(str.charAt(1));//根据下标找到指定的字符
//        System.out.println(str.toCharArray());//以字符数组的形式返回全部的字符串内容
//        System.out.println(Arrays.toString(jmr));//将全部的字符数组变为字符串
//        System.out.println(str.substring(0,2));//将指定范围的字符数组变为字符串
//        System.out.println(str.startsWith("小"));
//        System.out.println(str.startsWith("小",1));
//        System.out.println(str.endsWith("芮"));
//        System.out.println(str.replace("芮","芮芮"));
        System.out.println(str.replaceAll("芮","芮芮"));
        System.out.println(str.replaceFirst("芮","小小"));

    }
}
