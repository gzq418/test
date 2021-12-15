package test;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class IteratorTest {
    public static void display(Collection<?> a){
        System.out.println(a);
    }
    public static void main(String[] args){
        System.out.println("Iterator：");
        List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        Iterator<Integer> integerIterator=list.iterator();
        System.out.println(list);
//        integerIterator.remove();//报错
        integerIterator.next();
        integerIterator.remove();//remove前要加next
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

        System.out.println("collection泛型:");
        display(list);
        Set<Integer> set = new TreeSet<>(list);
        display(set);


        System.out.println("Treeset:");//set实际上还是实现了collection
        Random random=new Random(4);
        SortedSet<Integer> sets=new TreeSet();//treeset使用了红黑树，输出是有序排列
        for (int i=0;i<100;i++){
            sets.add(random.nextInt());
        }
        System.out.println(sets);
        System.out.println("HashSet:");
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<100;i++){
            set1.add(random.nextInt());
        }
        System.out.println(set1);

        System.out.println("Arraylist:");
        ArrayList<String> list1=new ArrayList<>();
        list1.add("demo1");
        list1.add("demo2");
        list1.add("demo3");
        list1.add(2,"demo4");
        System.out.println(list1);
        ArrayList<String> listtoatal=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<String> list3=new ArrayList<>();
        list2.add("newdemo1");
        list2.add("newdemo2");
        list2.add("newdemo3");
        boolean b=listtoatal.addAll(list2);//在指定位置插入集合的全部的元素，如果集合发生改变就返回true
        boolean c=listtoatal.addAll(2,list3);
        System.out.println(b);
        System.out.println(c);
        System.out.println(list2);
        System.out.println(list2.indexOf("newdemo3"));
        System.out.println(list2.contains("doem"));
        List<String> list4=list1.subList(0,3);
        System.out.println(list1.containsAll(list4));
    }
}
