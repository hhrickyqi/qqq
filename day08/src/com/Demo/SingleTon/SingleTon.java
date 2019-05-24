package com.Demo.SingleTon;

/*懒汉式*/
public class SingleTon {
    private SingleTon() {
        new RuntimeException("单例模式，不可实例化");

    }

    private static SingleTon singleTon = null;

    public static SingleTon singleTon() {
        synchronized (SingleTon.class) {
            if (singleTon == null) {
                singleTon = new SingleTon();
            }
            return singleTon;
        }
    }
}
