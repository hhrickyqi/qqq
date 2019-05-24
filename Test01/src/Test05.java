public class Test05 {
    public static void main(String[] args) {

    }
}
abstract class Drink{
    abstract void taste();

}
class Coffee extends Drink{

    @Override
    void taste() {
        System.out.println("咖啡，苦");
    }
}
class Bear extends Drink{

    @Override
    void taste() {
        System.out.println("啤酒，爽");
    }
}
class Milk extends Drink{

    @Override
    void taste() {
        System.out.println("牛奶，甜");
    }
}
class DrinkNotFoundException extends Exception{
    public DrinkNotFoundException(){
        super();
    }
    public DrinkNotFoundException(String msg){
        super(msg);
    }
}