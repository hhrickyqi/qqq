import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        /*Set<Pig> set = new HashSet<>();
        Pig pig1 = new Pig("jiji",1);
        Pig pig2 = new Pig("lala",2);
        Pig pig3 = new Pig("lala",2);
        set.add(pig1);
        set.add(pig2);
        set.add(pig3);
        Pig[] pigs = set.toArray(new Pig[]{});
        for (Pig p :pigs){
            System.out.println(p);
            System.out.println(p.hashCode());
        }*/
        treeSet();
    }
    public static void treeSet(){
        Set<String> set = new LinkedHashSet<>();
        set.add("timo") ;
        set.add("ray");
        set.add("zack");
        String[] s = set.toArray(new String[]{});
        for (String ss : s){
            System.out.println(ss);
        }
    }
}
class Pig{
    private String name;
    private int id;

    public Pig(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pig pig = (Pig) o;
        return id == pig.id &&
                name.equals(pig.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

}