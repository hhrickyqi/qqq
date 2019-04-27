import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo02 {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        Vector<String> list = new Vector<>();
        list.add("tom");
        list.add("ricky");
        list.add("bob");
        foreach(list);
        enumeration(list);
        iterator(list);
        System.out.println(testFunction("abc",s ->s.toUpperCase()));
        String[] strings = testSupplier(3,( ) -> {
            String[] ss = new String[3];
            for (int i = 0;i <  ss.length;i++){
                ss[i] = ((int)(Math.random() * 100) + "");
            }return ss;
        });
        for (String s : strings){
            System.out.println(s);
        }
    }
    private static String[] testSupplier(int num, Supplier<String[] > s){
        for (int i = 0;i < num;i++){
            return s.get();
        }return null;
    }
    private static String testFunction(String val, Function<String,String> f){
        return f.apply(val);
    }
    private static void foreach(Collection<String> c){
        //foreach的三种使用
        for (String s : c){
            System.out.println(s);
        }//1
        MyConsumer tConsumer = s -> System.out.println(s);
        c.forEach(tConsumer);//2.必须用接口继承Consumer

        c.forEach(System.out::println);//3.不具阅读性
    }
    public static void enumeration(Vector<String> v){
        Enumeration<String> elements = v.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement()); }
    }
    public static void iterator(Collection<String> c){
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
interface MyConsumer extends Consumer<String>{
//接口
}
