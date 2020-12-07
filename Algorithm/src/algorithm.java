import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class algorithm {
    @Test
    public static void main(String[] args) {
        int a = 1, b = 2;
        Solution solution = new Solution();
        System.out.println(solution.Add(a, b));
    }
    }

class Solution {
    public int Add(int num1, int num2) {
        BigInteger bi1 = new BigInteger(String.valueOf(num1));
        BigInteger bi2 = new BigInteger(String.valueOf(num2));
        return bi1.add(bi2).intValue();

    }

    /*二维数组中的查找
    题目描述：
    在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
    每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
    判断数组中是否含有该整数。
    题目的条件就是说判断二维数组中是否含有该整数。
    1.我们可以把数组拍平，一层循环遍历。
    2.也可以直接双层循环暴力解法，时间复杂度O(n^2)。当然上面两种方法都可以通过。
    3.但是这个题规定了每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    我们从右上角开始，如果一行中最大的值（最后一个）小于目标值，就没必要遍历这行中其他的值啦，
    这样可以少遍历很多值。
    */
    public boolean Find(int target, int [][] array) {//拍平数组
        int [] array1;
        //int len = 0;
        //计算一维数组长度
        /*for (int i = 0; i< array.length; i++){
            len += array[i].length;
        }*/
        int len = array.length * array[0].length;
        //复制元素
        array1 = new int[len];
        int index = 0;
        for (int i = 0;i < array.length; i++){
            for (int j = 0;j < array[i].length; j++){
                array1[index++] = array[i][j];
            }
        }
        for (int i = 0;i < array1.length; i++){
            if (target == array1[i]){
                return true;
            }
        }
        return false;
    }


    public boolean Find1(int target, int [][] array) {//双层循环
        int len1 = array.length;
        int len2 = array[0].length;
        for (int i = 0; i< len1; i++){
            for (int j = 0; j < len2; j++){
                if (array[i][j] == target)
                    return true;
            }
        }
        return false;
    }


    public boolean Find2(int target, int [][] array) {//比较大小一次循环
        int len1 = array.length;
        int len2 = array[0].length;
        int i = 0,j = len2 - 1;//从右上角开始
        while (i < len1 && j >= 0){
            if (array[i][j] == target){
                return true;
            }else if (array[i][j] > target){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }

    /*
    替换空格
    题目描述：
    请实现一个函数，将一个字符串中的每个空格替换成“%20”。
    例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    解释：
    这个第一感觉就是直接用正则表达式将空格替换即可。
    或者使用str.split(" ").join("%20")。循环遍历也是可以的。
     */


    public String replaceSpace(StringBuffer str) {
        return  str.toString().replace(" ", "%20");
    }

    //不考虑replace
    public String replaceSpace1(StringBuffer str) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.toString().length(); i++){
            if (str.charAt(i) == ' ') {
                result.append("%20");
            }else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    /*
    从尾到头打印链表
    题目描述：
    输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
    解释：
    这个题要求从尾到头打印，可以正常循环链表，
    将链表的每一个节点从数组的头部压入（unshift）即可。
     */

    /*
    一、非递归
    分析
    listNode是链表，只能从头遍历到尾，但是输出却要求从尾到头，这是典型的"先进后出"，
    我们可以想到栈！
    ArrayList中有个方法是 add(index,value)可以指定 index 位置插入 value 值
    所以我们在遍历listNode的同时将每个遇到的值插入到list的0位置，最后输出listNode
    即可得到逆序链表
    */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList();
        while (listNode != null){
            result.add(0, listNode.val);
            listNode = listNode.next;
        }
        return result;
    }

    /*二、递归
    分析
    既然非递归都实现了，那么我们也可以利用递归，借助系统的"栈"帮忙打印
    要逆序打印链表 1->2->3（3,2,1)，可以先逆序打印链表 2->3(3,2)，
    最后再打印第一个节点 1。而链表 2->3 可以看成一个新的链表，
    要逆序打印该链表可以继续使用求解函数，也就是在求解函数中调用自己，
    这就是递归函数*/

    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        if (listNode != null) {
            result.addAll(printListFromTailToHead1(listNode.next));
            result.add(listNode.val);
        }
        return result;
    }

    /*
    栈
     */
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList result = new ArrayList();
        Stack stack = new Stack();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()){
            result.add(stack.pop());
        }
        return result;
    }


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /*
    重建二叉树
    题目描述：
    输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
    假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
    则重建二叉树并返回。
    解释：
    用前序遍历和中序遍历来构建二叉树。我们从前序遍历中可以得知第一个节点为当前二叉树的根节点，
    在中序遍历中找到当前的根节点，他们的左边的所有节点为左子树，右边的所有节点为右子树，
    由此一次递归下去。
    简单梳理一下步骤：
    在前序遍历中获取根节点
    在中序遍历中根据刚刚在前序遍历中获取的根节点找到当前二叉树的左子树和右子树
    递归，依次在左右子树中这样寻找，直至还原整个二叉树
     */
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0){
            return null;
        }
        int root = pre[0];
        TreeNode treeNode = new TreeNode(root);
        for (int i = 0; i < in.length; i++){
            if (in[i] == root){
                treeNode.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in,0, i));
                treeNode.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
                break;
            }
        }
        return treeNode;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /*二叉树的下一个结点!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    题目描述
    给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
    注意，树中的结点不仅包含左右子结点，
    同时包含指向父结点的指针。*/
    /*1.
    既然给了二叉树的某个结点，且二叉树存储着指向父结点的指针（next），
    那我们可以先找到根节点，再对树进行中序遍历，最后根据中序遍历结果找到给定结点的下一结点*/
    static ArrayList<TreeLinkNode> list = new ArrayList<>();
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode node = pNode;
        while (node.next != null){
            node = node.next;
        }
        InOrder(node);
        for (int i = 0; i < list.size(); i++){
            if (pNode == list.get(i)){
                return i == list.size()-1 ? null : list.get(i + 1);
            }
        }
        return null;
    }

    /*2. 直接找下一结点
    以该二叉树为例，中序遍历为：{D,B,H,E,I,A,F,C,G}
             A
         B      C
       D   E   F  G
         H  I
    仔细观察，可以把中序下一结点归为几种类型：
    有右子树，下一结点是右子树中的最左结点，例如 B，下一结点是 H
    无右子树，且结点是该结点父结点的左子树，则下一结点是该结点的父结点，例如 H，下一结点是 E
    无右子树，且结点是该结点父结点的右子树，则我们一直沿着父结点追朔，
    直到找到某个结点是其父结点的左子树，如果存在这样的结点，
    那么这个结点的父结点就是我们要找的下一结点。
    例如 I，下一结点是 A；例如 G，并没有符合情况的结点，所以 G 没有下一结点*/
    public TreeLinkNode GetNext1(TreeLinkNode pNode) {
        if (pNode.right != null){
            TreeLinkNode pRight = pNode.right;
            while (pRight.left != null){
                pRight = pRight.left;
            }
            return pRight;
        }
        if (pNode.next != null && pNode.next.left == pNode){
            return pNode.next;
        }
        if (pNode.next != null){
            TreeLinkNode pNext = pNode.next;
            while (pNext.next != null && pNext.next.right == pNext){
                pNext = pNext.next;
            }
            return pNext.next;
        }
        return null;
    }

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    void PreOrder(TreeLinkNode pNode){//先序
        if (pNode == null){
            return;
        }else {
            System.out.println(pNode.val);
            PreOrder(pNode.left);
            PreOrder(pNode.right);
        }
    }


    void InOrder(TreeLinkNode pNode){//中序
        if (pNode == null){
            return;
        }else {
            InOrder(pNode.left);
            //System.out.println(pNode.val);
            list.add(pNode);
            InOrder(pNode.right);
        }
    }

    void PostOrder(TreeLinkNode pNode){//后序
        if (pNode == null){
            return;
        }else {
            PostOrder(pNode.left);
            PostOrder(pNode.right);
            System.out.println(pNode.val);
        }
    }

    /*用两个栈实现队列
    题目描述：
    用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
    解释：
    队列和栈二者都可以用数组模拟，区别就是栈是先进后出，队列是先进先出。
    我们定义两个栈stack1和stack2，在stack1中正常push元素，
    当从数组中出元素的时候需要用stack2栈来辅助：将stack1中的元素弹出，
    push进stack2中，再将元素从stack2中弹出就可以实现队列出的操作。
    要坚持，出队操作只能依赖 stack2 来完成。
    */
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

  /*  旋转数组的最小数字
    题目描述：
    把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
    输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
    NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
    解释：
    题中显示本题知识点：二分。于是就用二分法从新实现了一下。
    题中输入一个非递减排序的数组的“一个旋转”。例如：非递减数组[2,3,5,6,7]。
    旋转完[3,5,6,7,2],[5,6,7,2,3],[6,7,2,3,5],[7,2,3,5,6]。
    这四个都可以当作本题的输入。我们发现：旋转后的数组可以划分为两个有序的子区间，
    前面区间的元素都大于等于后面的元素，我们要找的是两个子区间的分界。前面一定比后面的大，
    所以我们用二分法看看中间值是在大的部分，还是在小的部分，如果在大的部分就抛弃掉中间值左边的，
    在小的部分就抛弃掉中间值右边的，抛弃掉的这部分一定大于等于最小值，不符合所以舍去，看代码。
*/
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int low = 0, high = array.length - 1, mid = 0;
        while (low < high) {
            mid = low + (high - low) / 2;
            // 如果中间值大于最右边的，说明中间值在大的区间部分，舍去中间值左边的
            if (array[mid] > array[high]) {
                low = mid + 1;
            }// 如果中间值小于最右边的，说明中间值在小的区间部分，舍去中间值右边的
            else if (array[mid] < array[high]) {
                high = mid;
            }  // 如果相等，就right--或者left++，重新更新区间
            else {
                high--;
            }
        }
        //此时high low mid相等都为最小值
        return array[low];
    }

    /*斐波那契数列
    题目描述：
    大家都知道斐波那契数列，现在要求输入一个整数n，
    请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。n<=39
    解释：
    题中要求求出第n项的值，我们可以直接循环，第n项 = 第n-1项+第n-2项，
    每次循环不断更新前面项的值即可求出。
    */
    public int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int pre = 0;
        int cur = 1;
        for (int i = 2; i <= n; i++) {
            cur += pre;
            pre = cur - pre;
        }
        return cur;
    }

    /*跳台阶
    题目描述：
    一只青蛙一次可以跳上1级台阶，也可以跳上2级。
    求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
    解释：
    青蛙跳台阶这种经典题，和斐波那契数列一样，一般可以使用递归来解答。
    但是递归的解法可能会爆栈，所以为了以防爆栈，可以定义cache进行缓存。
    （也可以用循环来代替递归的方式正向求解）
    时间复杂度O(n^logn)
    */
    public int JumpFloor(int target) {
        int pre = 1, cur = 1;
        for (int i = 1; i < target; i++){
            cur += pre;
            pre = cur - pre;
        }
        return cur;
    }

    /*递推版
    public int JumpFloor(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return JumpFloor(n - 1) + JumpFloor(n - 2);
    }*/

   /*变态跳台阶
    一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
    求该青蛙跳上一个n级的台阶总共有多少种跳法。
    解释：
    变态跳台阶和跳台阶这两个问题本质上是一个问题。
    区别在于跳台阶问题的第10层的算法为第9层+第8层，
    而变态跳台阶的第10层的算法为第9层+第8层+第7层+ ··· +第1层+1。
    我们简单写一下是这样的：1 2 4 8 16 32 64 …
    */
   public int JumpFloorII(int target) {
       return (int) Math.pow(2, target - 1);
       //return 1<<(target-1);
   }

    /*矩阵覆盖
    题目描述：
    我们可以用2 * 1的小矩形横着或者竖着去覆盖更大的矩形。
    请问用n个2 * 1的小矩形无重叠地覆盖一个2 * n的大矩形，总共有多少种方法？
    比如n=3时，2*3的矩形块有3种覆盖方法。
    解释：
    这个题还是斐波那契数列的一个变形。当我们第一次看见这个题无从下手的时候，
    感觉还是找好规律最重要。拿2 * n的大矩形，和n个2 * 1的小矩形来举例。
    当n小于2的时候只有n中摆放方法。当n>2的时候，可以看出等于前两次的相加。
    */
    public int RectCover(int target) {
        if (target == 0) return 0;
        int pre = 0;
        int cur = 1;
        for (int i = 0; i < target; i++){
            cur += pre;
            pre = cur - pre;
        }
        return cur;
    }

    /* 二进制中1的个数
    题目描述：
    输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
    例如：输入：10  输出：2
    解释：
    与、或和异或的运算规律：
    与（&）            或（|）            异或（^）
    0 & 0 = 0       0 ｜ 0 = 0         0 ^ 0 = 0
    0 & 1 = 0       0 ｜ 1 = 1         1 ^ 0 = 1
    1 & 0 = 0       1 ｜ 0 = 1         0 ^ 1 = 1
    1 & 1 = 1       1 ｜ 1 = 1         1 ^ 1 = 0
    比如n = 10的二进制是1010，n-1 = 9的二进制为1001，n&（n-1）= 1000。
    可以看出n的最低位的1被与没啦。依次n&（n-1）的往下走，每次都可以与没最低位的1。
    所以，要消除整数n最低位的1，可以使用 n = n & (n-1)，直至为0。
    */
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n &= n-1;
            count++;
        }
        return count;
    }

    /*数值的整数次方，直接Math.pow(base, exponent)或者（Write Code）
    题目描述：
    给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
    保证base和exponent不同时为0
    解释：
    数值的整数次方，直接Math.pow(base, exponent)或者base** exponent即可*/
    public double Power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double Power1(double base, int exponent) {
        if (base == 0) {
            return base;
        }
        double pow = 1.0d;
        if (exponent >= 0) {
            for (int i = 0; i < exponent; i++) {
                pow *= base;
            }
        }else {
            for (int i = 0;i > exponent; i--){
                pow /= base;
            }
        }
        return pow;
    }

    /*调整数组顺序使奇数位于偶数前面
    题目描述：
    输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
    使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
    并保证奇数和奇数，偶数和偶数之间的相对位置不变。
    解释：
    按照题目要求可以直接一次循环，将奇数和偶数分开放进不同的数组中，最后在进行concat拼接即可。
    */
    public void reOrderArray(int [] array) {
        int[] odd = new int[]{};
        int[] even = new int[]{};
        int indexEven = 0;
        int indexOdd = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                even[indexEven++] = array[i];
            } else {
                odd[indexOdd++] = array[i];
            }
        }
    }

}

