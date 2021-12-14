package test;

public class ImplementsTest implements InterfaceTest{
    //方法必须全实现或者为抽象类
    @Override
    public void eat() {
        System.out.println("eat implements");
    }

    @Override
    public void sleep() {
        System.out.println("sleep implements");

    }
}
