public class Test04 {
    public static void main(String[] args) {
        Animal p = new Pig();
        Animal b = new Bird();
        Pig pp = new Pig();
        p = (Animal) pp;//向上转型
        pp = (Pig) p;//向下转型
        function(pp);
    }

    public static void function(Animal a) {
        if (a instanceof Pig) {
            ((Pig) a).sleep();
        } else if (a instanceof Bird) {
            ((Bird) a).fly();
            a.eat();
        }
    }
}

abstract class Animal {
    public abstract void eat();
}

class Pig extends Animal {
    @Override
    public void eat() {
    }

    public void sleep() {

        System.out.println("打瞌睡");
    }
}

class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    public void fly() {
        System.out.println("飞飞飞");
    }
}
