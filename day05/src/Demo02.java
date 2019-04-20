public class Demo02 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();//向上自动转型，多态
        B b = new B();
        C c = new C();
        D d  = new D();

        a1.show(b);
        System.out.println("----------------");
        a1.show(c);
        System.out.println("----------------");
        a1.show(d);
        System.out.println("----------------");
        a2.show(b);
        System.out.println("----------------");
        a2.show(c);
        System.out.println("----------------");
        a2.show(d);
        System.out.println("----------------");
        b.show(b);
        System.out.println("----------------");
        b.show(c);
        System.out.println("----------------");
        b.show(d);
    }
}
    class A{
        public void show(A b){
            System.out.println("A AND A");
        }
        public void show(D d){
            System.out.println("A AND D");
        }
    }
    class B extends A{
        public void show(B b){
            System.out.println("B AND B");
        }
        public void show(A a){
            System.out.println("B AND A");
        }
    }
    class C extends B{

    }
    class D extends B{}


/*finally中代码块比return先执行*/