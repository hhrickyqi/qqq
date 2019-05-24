public class Test05 {
    public static void main(String[] args) {
        try{
            Drink drink = Drink.getDrink(4);
            drink.taste();
        } catch (DrinkNotFoundException e) {
            System.out.println(new DrinkNotFoundException("null"));
        }

    }
}
abstract class Drink{
    abstract void taste();
    public static Drink getDrink(int drintType) throws DrinkNotFoundException{
        if(drintType < 1 || drintType> 3){
            throw new DrinkNotFoundException();
        }
        switch (drintType){
            case 1:
                return new Coffee();
            case 2:
                return new Bear();
            case 3:
                return new Milk();
        }
        return null;
    }

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