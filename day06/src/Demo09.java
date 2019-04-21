import java.util.ArrayList;
import java.util.List;

public class Demo09 {
    public static void main(String[] args) {
        arrayList();
    }
    public static void arrayList(){
        List<String> list = new ArrayList<>();
        list.add("tony");
        list.add("tommy");
        list.add("jack");
        list.remove(2);
        list.remove("tony");
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
