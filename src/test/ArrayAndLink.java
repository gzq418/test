package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLink {
    //ArrayList更适合读取数据，linkedList更多的时候添加或删除数据。
    static final int N=50000;
    static long timelist(List list){
        long start=System.currentTimeMillis();
        Object o=new Object();
        for(int i=0;i<N;i++){
            list.add(0,o);
        }
        return System.currentTimeMillis()-start;
    }
    static long readlist(List list){
        long start=System.currentTimeMillis();
        for (int i=0,j=list.size();i<j;i++){

        }
        return System.currentTimeMillis()-start;
    }
    static List addlist(List list){
        Object o=new Object();
        for(int i=0;i<N;i++){
            list.add(o);
        }
        return list;
    }
    public static void main(String[] args){
        System.out.println(timelist(new ArrayList()));
        System.out.println(timelist(new LinkedList()));
        List list1=addlist(new ArrayList());
        List list2=addlist(new LinkedList());
        System.out.println(readlist(list1));
        System.out.println(readlist(list2));
    }
}
