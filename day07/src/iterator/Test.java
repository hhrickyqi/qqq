package iterator;

public class Test {
    public static void main(String[] args) {
        MyList list = new ConcreteAggregate();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        Iterator iterator = list.iterator();
        System.out.println(list.getSize());
        System.out.println(list.get(2));
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
