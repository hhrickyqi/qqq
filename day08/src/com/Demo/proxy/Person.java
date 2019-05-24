package com.Demo.proxy;

public class Person implements IFly,IShopping {
    @Override
    public void fly() {
        System.out.println("飞飞飞");
    }

    @Override
    public void buy() {
        System.out.println("买买买");

    }
}
