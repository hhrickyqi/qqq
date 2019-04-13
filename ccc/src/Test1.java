import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        ChickenManage cm = new ChickenManage(6);
        cm.addChicken(new Chicken(1,"鸡1",3,5));
        cm.addChicken(new Chicken(2,"鸡2",6,7));
        cm.addChicken(new Chicken(3,"鸡3",2,3));
        cm.addChicken(new Chicken(4,"鸡4",7,7));
        cm.addChicken(new Chicken(5,"鸡5",3,6));
        cm.addChicken(new Chicken(6,"鸡6",4,4));
        cm.addChicken(new Chicken(7,"鸡7",5,3));
        /*cm.printInfo();
        System.out.println("------------");*/
        /*cm.updateChicken(new Chicken(7,"鸡8",55,35));
        cm.printInfo();*/
        //System.out.println(cm.getChickenById(2));
        cm.deleteChicken(1);
        cm.printInfo();

    }
}
class ChickenManage{
    private Chicken[] chickens;
    private int count = 0;
    public ChickenManage(int size){
        chickens = new Chicken[size];
    }
    public void addChicken(Chicken c){
        if (count == chickens.length){
            chickens = Arrays.copyOf(chickens,chickens.length + 1);
        }
        chickens[count++] = c;
    }
    public void updateChicken(Chicken c){
        for (Chicken cs : chickens){
            if(cs.getId() == c.getId()){
                cs.setName(c.getName());
                cs.setAge(c.getAge());
                cs.setWeight(c.getWeight());

            }
        }
    }
    public Chicken getChickenById(int id){
        for(Chicken cs : chickens){
            if(cs.getId() == id){
                return cs;
            }
        }
        return null;
    }
    public void deleteChicken(int id){
        for(int i = 0;i < chickens.length;i++){
            if(chickens[i].getId() == id){
                for(int j = i;j < count;j++){
                    if(j + 1 ==count){
                        break;
                    }
                    chickens[j] = chickens[j + 1];
                }
            }
        }
        chickens[chickens.length - 1] = null;
    }
    public void printInfo(){
        for (Chicken c:chickens) {
            if(null != c){
                System.out.println(c);
            }

        }

    }
}

class Chicken {
    private int id;
    private String name;
    private int age;
    private int weight;

    public Chicken(int id, String name, int age, int weight) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
