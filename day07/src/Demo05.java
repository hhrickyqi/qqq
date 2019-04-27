import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"lal","caa","lel");
        Collections.reverse(list);
        Collections.shuffle(list);
        Collections.sort(list);
        Collections.swap(list,0,2);
        list.forEach(s -> System.out.println(s));

    }
}
//addAll(Collection<? super T> c, T... a) - 一种方便的方式，将所有指定元素添加到指定 collection 中。