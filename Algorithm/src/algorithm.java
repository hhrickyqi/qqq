import java.math.BigInteger;

public class algorithm {
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

}