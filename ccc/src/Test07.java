public class Test07 {
    public static void main(String[] args) {
        FactoryProduct fp = new FactoryProduct();
        Product p = fp.getProduct("mobile");
        p.work();
    }
}
class FactoryProduct{
    public Product getProduct(String name){
        if(name.equals("mobile")){
            return new Mobile();
        }else if (name.equals("computer")){
            return new Computer();
        }
        return null;
    }
}
abstract class Product{
    public abstract void work();
}

class Mobile extends Product{

    @Override
    public void work() {
        System.out.println("手机");
    }
}
class Computer extends Product{

    @Override
    public void work() {
        System.out.println("电脑");
    }
}
