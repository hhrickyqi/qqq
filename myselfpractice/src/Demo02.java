import java.util.ArrayList;
import java.util.List;

public class Demo02{
    public static void main(String[] args) {
        DogManage dm = new DogManage();
        dm.add(new Dog("jinjin",1,13));
        dm.add(new Dog("papa",2,6));
        dm.add(new Dog("lala",3,8));
        //dm.remove(1);
        System.out.println(dm.getDog(1));
        System.out.println("--------");
        dm.update(new Dog("caicai",1,11));
        dm.printInfo();
    }
}
class DogManage{
    List<Dog> dogs = new ArrayList<>();
    public void add(Dog d){
        dogs.add(d);
    }
    public void remove(int id){
        for (int i = 0;i < dogs.size();i++){
            if(id ==dogs.get(i).getId()){
                dogs.remove(i);
            }
        }
    }
    public void update(Dog d){
        for (int i = 0;i < dogs.size();i++){
            if(d.getId() == dogs.get(i).getId()){
                dogs.set(i,d);
            }
        }
    }
    public Dog getDog(int id){
        for (Dog d : dogs){
            if(d.getId() == id){
                return d;
            }
        }return null;
    }
    public void printInfo(){
        for (Dog d : dogs){
            System.out.println(d);
        }
    }
}
class Dog{
    private String name;
    private int id;
    private int age;

    public Dog(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}