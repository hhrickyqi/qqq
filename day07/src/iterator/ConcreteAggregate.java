package iterator;

public class ConcreteAggregate implements MyList{
    private Object[] list = null;
    private int index = 0;
    private int size = 0;
    public ConcreteAggregate(){
        list = new Object[50];
        index = 0;
        size = 0;
    }
    @Override
    public void add(Object b) {
        list[index++] = b;
        size++;
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
    @Override
    public int getSize(){
        return size;
    }
}
