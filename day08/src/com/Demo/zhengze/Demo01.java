package com.Demo.zhengze;

public class Demo01 {
    public static void main(String[] args) {
        String s = "5201314";
        boolean matches = s.matches("\\d+");
        System.out.println(matches);
    }
}
