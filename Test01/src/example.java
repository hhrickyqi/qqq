import org.junit.Test;

import java.util.ArrayList;


public class example {

    //深拷贝
    public class DeepCloneExample implements Cloneable {
        private int[] arr;

        public DeepCloneExample() {
            arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
        }

        public void set(int index, int value) {
            arr[index] = value;
        }

        public int get(int index) {
            return arr[index];
        }

        @Override
        protected DeepCloneExample clone() throws CloneNotSupportedException {
            DeepCloneExample result = (DeepCloneExample) super.clone();
            result.arr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result.arr[i] = arr[i];
            }
            return result;
        }
    }

    @Test
    public void testClone() {
        DeepCloneExample e1 = new DeepCloneExample();
        DeepCloneExample e2 = null;
        try {
            e2 = e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        e1.set(2, 222);
        System.out.println(e2.get(5)); // 2
    }

    @Test
    public void testWhat(){
        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 5);
        list.add(0, 4);
        list.add(1, 6);
        System.out.println(list);*/
        int i = 0;
        System.out.println(++i);
    }

    @Test
    public void arrayLength(){
        int array[][] = {{54, 78, 79}, {66, 74, 34}};
        int len = 0;
        int len1 = array[0].length;
        for (int i = 0; i< array.length; i++){
            len += array[i].length;
        }
        System.out.println(len + " " + len1);
        /*for (int i = 0 ;i < array.length;i ++){
            for (int j = 0 ; j < array[i].length; j++){
                array[i][j] += 1;
                System.out.println(array.length);
            }
        }*/
    }
    @Test
    public void replaceSpace() {
        StringBuffer str = new StringBuffer("we are family");
        System.out.println(str.toString().replace(" ", "%20"));
    }


    /*public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        listNode.next = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next = new ListNode(3);
        listNode.next = new ListNode(4);
        if (listNode != null) {
            result.addAll(printListFromTailToHead(listNode.next));
            result.add(listNode.val);
        }
        return result;
    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }*/
}
