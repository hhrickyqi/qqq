import java.util.ArrayList;
import java.util.List;

public class Demo10 {
    public static void main(String[] args) {
        BirdManage bm = new BirdManage();
        bm.add(new Bird(01,"jiujiu",3));
        bm.add(new Bird(02,"qiqi",4));
        bm.add(new Bird(03,"lala",6));
        /*bm.remove(1);*/
        bm.update(new Bird(01,"papa",4));
        bm.printInfo();
        /*System.out.println(bm.getBird(01));*/
    }
}
class BirdManage{
    List<Bird> birds = new ArrayList<>();
    //增加
    public void add(Bird b){
        birds.add(b);
    }
    //删除
    public void remove(int id){
        for(int i = 0;i < birds.size();i++){
            if(id == birds.get(i).getId()){
                birds.remove(i);
            }
        }
    }
    //修改
    public void update(Bird b){
        for(int i = 0;i < birds.size();i++){
            if(b.getId() == birds.get(i).getId()){
                birds.set(i,b);
        }
        }
    }
    //查询
    public Bird getBird(int id){
        for(Bird b : birds){
            if(id == b.getId()){
                return b;
            }
        }
        return null;
    }
    public void printInfo(){
        for(Bird b : birds){
            System.out.println(b);
        }
    }
}
class Bird{
    private int id;
    private String name;
    private int age;

    public Bird(){}
    public Bird(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}