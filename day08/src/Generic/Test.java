package Generic;

import com.Demo.proxy.Person;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Node<String> n = new Node<String>("aaa");
        System.out.println(n.getData());
        Node<Number> n1 = new Node<>(100);
        Node<Integer> n2 = new Node<>(200);
        getData(n1);
        printIofo(1,"3333",new Person());
        String[] arrs = {"123","456","789"};
        System.out.println(Arrays.toString(getList(arrs,0,2)));

    }

    public static Node getData(Node<? super Number> node) {
        return node;
    }

    public static <T> void printIofo(T... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static <T> T[]getList(T[] list , int i , int j){
        T temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        return list;
    }
}