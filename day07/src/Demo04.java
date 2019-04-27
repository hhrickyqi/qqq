import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo04 {
    public static void main(String[] args) {
        DuckManage dm = new DuckManage();
        dm.add(new Duck(1,"zack",320));
        dm.add(new Duck(2,"tom",150));
        dm.add(new Duck(3,"lucy",150));
        dm.add(new Duck(4,"lily",320));
        dm.remove(1);
        dm.update(new Duck(2,"bob",150));
        dm.printInfo();
        System.out.println("-------");
        System.out.println(dm.getDuck(2));
        System.out.println("--------");
        System.out.println(dm.getPigByWeight(150));

    }
}
class DuckManage{
    List<Duck> ducks = new ArrayList<>();
    public void add(Duck d){
        ducks.add(d);
    }
    public void remove(int id){
        for (int i = 0;i < ducks.size();i++){
            if(id == ducks.get(i).getId()){
                ducks.remove(i);
            }
        }
    }
    public void update(Duck d){
        for (int i = 0;i < ducks.size();i++){
            if (d.getId() == ducks.get(i).getId()){
                ducks.set(i,d);
            }
        }
    }
    public Duck getDuck(int id){
        for (Duck d : ducks){
            if(id == d.getId()){
                return d;
            }
        }return null;
    }
    //重点！！！！！！！！！！！！！！！！！！！！！！！
    public List<Duck> getPigByWeight(int weight){
        /*List<Duck> list = new ArrayList<>();
        for(Duck d : ducks){
            if (d.getWeight() == weight){
                list.add(d);
            }
        }return list;*/
        return ducks.stream().filter(p -> p.getWeight() == weight).collect(Collectors.toList());
    }
    public void printInfo(){
        for (Duck d : ducks){
            System.out.println(d);
        }
    }
}
class Duck{
    private int id;
    private String name;
    private int weight;

    public Duck(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
