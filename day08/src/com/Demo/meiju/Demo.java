package com.Demo.meiju;

public class Demo {
    public enum ColorEnum{
        RED(1,"红色"),GREEN,BLUE;
        private int age;
        private String name;
        private ColorEnum(){}
        private ColorEnum(int age,String name){
            this.age = age;
            this.name = name;
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
    }
    public static void main(String[] args) {
        ColorEnum c = ColorEnum.RED;
    }
}
