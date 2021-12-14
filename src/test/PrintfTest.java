package test;

public class PrintfTest {
    public static void main(String[] args) {
        double a = 12.345;
        int b=34;
        System.out.print(Integer.toBinaryString(b)+'\t');
        System.out.print(Integer.toHexString(b)+'\t');
        System.out.print(Integer.toOctalString(b)+'\t');
        System.out.println();
        System.out.print(Integer.valueOf("11011",8));//输出为十进制数
        System.out.println();
        System.out.printf("%10d",b);
        System.out.println();
        System.out.printf("%-4.2f%%",a);
        System.out.println();
        System.out.printf("%-6.4f000",a);
        System.out.println();
        System.out.printf("%s",a);//输出为字符串
        System.out.println();
        System.out.printf("%8s","China");//左补齐位数
        System.out.println();
        System.out.printf("%-8s","China");//输出的数左对齐
        System.out.printf("%o",b);//八进制
        System.out.println();
        System.out.printf("%x",b);//十六进制
        System.out.println();
        System.out.printf("%#x",b);
        System.out.println();
        System.out.printf("%c",'C');//字符单引号
        System.out.println();
        System.out.printf("输出为double：%f  输出为int：%d",a,b);


    }
}
