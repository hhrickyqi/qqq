public class Test02 {
    public static void main(String[] args) {
        HomeDog homeDog = new HomeDog();
        System.out.println(homeDog.name);
        homeDog.eat();
    }
}
class Dog{
    protected int age;
    protected String name;
    public void eat(){
        System.out.println(this.name + "吃...");
    }
}
class HomeDog extends Dog{
    public void eat(){
        super.eat();
        System.out.println(super.name);
    }
}
//开发原则：高内聚低耦合
//overloading方法重载
//overriding方法重写