package test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
//泛型
public class Runoob {
    public static <E> void printarray(E[] inputarray){
        for (E element:inputarray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
    public static <T extends Comparable<T>> T maxmin(T x,T y,T z){
        T max=x;
        if (y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }

    public static void main(String[] args){
        Integer[] intarray={1, 2 ,3 ,4 ,5};
        Double[] doublearray={1.1,2.2,3.3};
        printarray(intarray);
        printarray(doublearray);
        System.out.printf("%d,%d,%d 中的最大值为 %d\n\n",3,4,5,maxmin(3,4,5));



        List<String> name=new ArrayList<String>();
        List<Integer> age=new ArrayList<Integer>();
        List<Number> number=new ArrayList<Number>();
        name.add("张三");
        name.add("weibo");
        name.set(1,"weiki");
        for (String i:name){
            System.out.println(i);
        }
        age.add(10);
        number.add(314);
//        getdata(name);
        getdata(age);
        getdata(number);


        LinkedList<String> sites=new LinkedList<String>();
        sites.add("123");
        sites.add("345");
        //System.out.println(sites.getFirst());
        sites.removeFirst();
        //System.out.println(sites.getFirst());


        HashSet<String> site=new HashSet<String>();
        site.add("123");
        site.add("234");
        site.add("123");
        site.add("566");
        for( String i: site){
            System.out.println(i);
        }
        TestChild testChild=new TestChild();
        ExtendsTest extendsTest=new ExtendsTest();
        ExtendsTest extendsTest1=new TestChild();
//        TestChild testChild1=new ExtendsTest();
        extendsTest.setAge(45);

        testChild.setSex("boy");
        testChild.setAge(23);
        testChild.setScore(345);
        testChild.test();
//        testChild1.test();
        extendsTest.test();
        extendsTest1.test();
        System.out.println(testChild.getSex()+'\t'+testChild.getAge()+'\t'+testChild.getScore());
        ImplementsTest implementsTest=new ImplementsTest();
        implementsTest.eat();
        implementsTest.sleep();
        AbstractExtends abstractExtends=new AbstractExtends();

    }


    public static void getdata(List<? extends Number> data){//参数泛型上限为number
        System.out.println("data:"+data.get(0));
    }
}
