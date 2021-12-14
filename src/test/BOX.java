package test;
//泛型类
public class BOX<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void add(T t) {
        this.t = t;
    }
    public static void main(String[] args){
        BOX<Integer> integerBOX=new BOX<Integer>();
        BOX<String> stringBOX=new BOX<String>();
        integerBOX.add(new Integer(10));
        stringBOX.add(new String("菜鸟"));
        System.out.printf("整型值:%d\n",integerBOX.getT());
        System.out.printf("字符型：%s\n",stringBOX.getT());
    }
}
