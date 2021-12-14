package test;


import java.util.regex.*;
import java.util.stream.Stream;

public class RegexTest {
    public static void main(String[] args){
//        String content="I am noob"+"from runoob";
//        String pattern=".*runoob.*";
        String pattern="\\bcat\\b";
        String content="cat cat cattie cat";
        Pattern pattern1=Pattern.compile(pattern);
        Matcher matcher=pattern1.matcher(content);
        int count=0;
        while(matcher.find()){
            count++;
            System.out.println(count);
            System.out.println(matcher.start());
            System.out.println(matcher.end());

        }
        boolean ismatch=Pattern.matches(pattern,content);
        System.out.println(ismatch);
        System.out.println("lookingAt:");
        String regex="foo";
        String content1="foooooooooojk";
        String content2="ooofooo";
        Pattern pattern2=Pattern.compile(regex);
        Matcher matcher1=pattern2.matcher(content1);
        Matcher matcher2=pattern2.matcher(content2);
        System.out.println(matcher1.lookingAt());
        System.out.println(matcher2.lookingAt());

        System.out.println("replace:");
        String regex1="dog";
        String content3="the dog is cute"+"the dog is ugly";
        Pattern pattern3=Pattern.compile(regex1);
        String replace="cat";
        Matcher matcher3=pattern3.matcher(content3);
        System.out.println(matcher3.replaceFirst(replace));
        System.out.println(matcher3.replaceAll(replace));

        System.out.println("文本替换：");
//        String regex2="\\ba*b\\b";
        String regex2="a*b";
        String replace1="-";
        String content4="aabghjkaabbahbabakloo";
        Pattern pattern4=Pattern.compile(regex2);
        Matcher matcher4=pattern4.matcher(content4);
        StringBuffer sb=new StringBuffer();
        while(matcher4.find()){
            System.out.println(matcher4.start());
            System.out.println(matcher4.end());
            System.out.println();
            matcher4.appendReplacement(sb,replace1);//尾巴没有了
            System.out.println(sb);
        }
        matcher4.appendTail(sb);//添加剩余部分
        System.out.println(sb);



    }
}
