package test;

import com.sun.xml.internal.fastinfoset.util.LocalNameQualifiedNamesMap;
import jdk.internal.util.xml.impl.Input;

import java.util.*;

public class Test {
    public static void main(String[] args){
        System.out.println("1:水仙花数  2：分解质因数   3：分数    4：公因数和公倍数    5：字符统计   6:球落地     7:猴子吃桃      8:递归         9:hashmap");
        Scanner input=new Scanner(System.in);
        int flag=input.nextInt();
        switch (flag){
            case 1:
                int a,b,c;
                for(int i=101;i<999;i++){
                    a=i%10;
                    b=i/10%10;
                    c=i/100;
                    if((a*a*a+b*b*b+c*c*c)==i){
                        System.out.print(i+"\t");
                    }
                }
                System.out.println();
                break;
            case 2:
                System.out.println("输入需要分解质因数的正整数：");
                int i=input.nextInt();
                int j=2;
                while (j<=i){
                    if(j==i){
                        System.out.print(j);
                        break;
                    }
                    else if(i%j==0){
                        System.out.print(j+"\t");
                        i=i/j;
                    }
                    else {
                        j++;
                    }
                }
                System.out.println();
                break;
            case 4:
                System.out.println("输入两个数字：");
                int x=input.nextInt();
                int y=input.nextInt();
                if(x<y){
                    int temp;
                    temp=x;
                    x=y;
                    y=temp;
                }
                int z=2;
                int sum=1;
                while(z<=y){
                    if(y%z==0&&x%z==0){
                        System.out.print(z+"\t");
                        x=x/z;
                        y=y/z;
                        sum*=z;
                    }
                    else {
                        z++;
                    }
                }
                System.out.println();
                System.out.print(sum*x*y);
                System.out.println();
                break;
            case 5:
                System.out.println("输入字符串：");
                Scanner input1=new Scanner(System.in);
                String s=input1.nextLine();
                int charcount=0;
                int digitcount=0;
                int othercount=0;
                int spacecount=0;
                char[] st=s.toCharArray();
                for (char s1:st){
                    if(Character.isDigit(s1)){
                        digitcount++;
                    }
                    else if(Character.isLetter(s1)){
                        charcount++;
                    }
                    else if(Character.isSpaceChar(s1)){
                        spacecount++;
                    }
                    else{
                        othercount++;
                    }
                }
                System.out.println(charcount+"\t"+digitcount+"\t"+spacecount+"\t"+othercount);
                break;
            case 6:
                double h=100;
                double total=100;
                for(int i1=0;i1<10;i1++){
                    h=h/2;
                    System.out.println(h);
                    total+=h*2;
                }
                System.out.println(total);
                break;
            case 7:
                int n=1;
                for (int i1=0;i1<10;i1++){
                    n=2*(n+1);
                    System.out.println(n);
                }
                break;
            case 8:
                System.out.println(fac(4));
                break;
            case 9:
                HashMap hashMap=new HashMap();
                hashMap.put("apple",23);
                hashMap.put("apple",45);
                hashMap.put("appear",24);
                System.out.println(hashMap.size());
                System.out.println(hashMap.get("apple"));
                System.out.println(hashMap.values());
                System.out.println(hashMap.keySet());
                System.out.println("第一种遍历方式：");
                Collection<Integer> values=hashMap.values();
                for(Integer i2:values){
                    System.out.println(i2);
                }
                System.out.println(hashMap.containsValue("23"));
                Set<String> keys=hashMap.keySet();
                for(String key:keys){
                    System.out.println(key+"\t"+hashMap.get(key));
                    if(hashMap.get(key).equals(23)){
                        System.out.println(key);
                    }
                }
                Iterator<String> it=keys.iterator();
                String key;
                while (it.hasNext()){
                    key=it.next();
                    System.out.println(key+"\t"+hashMap.get(key));
                }
                System.out.println("第二种遍历方式：");
                Set <Map.Entry<String,Integer>> entryset=hashMap.entrySet();
                for(Map.Entry<String,Integer> entry:entryset){
                    System.out.println(entry.getKey()+"\t"+entry.getValue());
                }
                Iterator<Map.Entry<String,Integer>> its=entryset.iterator();
                Map.Entry<String,Integer> entry;
                while(its.hasNext()){
                    entry= its.next();
                    System.out.println(entry.getKey()+"\t"+entry.getValue());                }
                System.out.println(hashMap.values());
                System.out.println(hashMap.size());
                System.out.println(hashMap.containsValue(45));
                System.out.println(hashMap.containsValue(23));
                System.out.println(hashMap.get("appear"));
                System.out.println(hashMap.get(23));
                System.out.println(hashMap.hashCode());
                break;

            case 3:
                System.out.println("输入分数：");
                int score=input.nextInt();
                char grade=score>=90?'A':score>=70?'B':'C';
                char t='D';
                switch (grade){
                    case 'A':
                        System.out.println("优秀");
                        break;
                    case 'B':
                        System.out.println("良好");
                        break;
                    case 'C':
                        System.out.println("及格");
                        break;
                    default:
                        System.out.println("无");
                }
        }
    }
    public  static int fac(int i){
        if(i==1) return i;
        else{
            return i*fac(i-1);
        }
    }
}
