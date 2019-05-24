package com.Demo.zhengze;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 1、验证电话号码（如：010-38389438 ）
         * 2、验证手机号码
         * 3、验证用户名，只能是字母开头的，数字、字母或下划线的组合
         * 4、验证邮箱(如:zhangsan_wc@163.com)
         * 5、验证年龄（100以内）
         * 6、验证金额（可以有小数位）
         */
//        String s = "010-383894386";
//        boolean matches = s.matches("\\d{3}-\\d{9}");大括号表示位数
//        String s = "18100710369";
//        boolean matches = s.matches("1[\\d&&[^126]]\\d{9}");第一位为1，第二位为除开126的数字，后面还有9位数字
//       String s = "a19170000a";
//        boolean matches = s.matches("[a-zA-Z]\\w+");//+和 * 表示后面还有很多位
        String s = "zhangsan_wc@163.com";
        boolean matches = s.matches("[a-zA-Z0-9]+\\w+@[a-zA-Z0-9]+.[a-zA-Z]+");
        System.out.println(matches);
    }
}
