public class Demo08 {
    public static void main(String[] args) {
        IEat eat = new IEat() {
            @Override
            public void eat(String name) {
                System.out.println(name +"eat...apple");
            }
        };
        eat.eat("xiaoli");

    }
}
interface IEat{
    void eat(String name);
}
