package iterator;

public class ConcreteIterator implements Iterator{
    private MyList myList = null;
    private int index = 0;

    public ConcreteIterator(MyList myList) {
        this.myList = myList;
    }
    public boolean hasNext(){
        if (index >= myList.getSize()){
            return false;
        }
        return true;
    }
    public Object next(){
        Object b = myList.get(index);
        index ++;
        return b;
    }
}
