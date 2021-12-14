package test;

public class SortTest {
    public static void main(String[] args){

        System.out.println("选择排序：");
        int[] a={3,67,98,12,45,13};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println("冒泡排序：");

    }
}
