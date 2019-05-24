package com.Demo;

public class Dog {
    private int age;
    private String name;
    private String weight;

    public Dog(){}
    public Dog(int age, String name, String weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
    private void setWeight(String weight){
        this.weight = weight;
        System.out.println(this.weight);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
