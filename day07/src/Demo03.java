import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo03 {
    public static void main(String[] args) {
        //Map<Integer,String> map = new HashMap<>();
        Map<Integer,String> map = new TreeMap<>();//按自然顺序排序
        map.put(3,"lily");
        map.put(2,"ricky");
        map.put(1,"michel");
        System.out.println(map.get(1));
        Set<Map.Entry<Integer, String>> entries = map.entrySet();//map.entrySet.val
        entries.forEach(s -> System.out.println(s));
        System.out.println("-----------");
        map.remove(1);
        Set<Map.Entry<Integer, String>> entries1 = map.entrySet();
        entries.forEach(s -> System.out.println(s));
    }
}
