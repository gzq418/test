package test;

import java.util.Arrays;

public class CopyArray {
    public static  void main(String[] args){
        int scores[]=new int[] {57,89,78};

        int scoreses[]=new int[] {45,67,87};
        scoreses=(int[]) Arrays.copyOf(scores,2);//copyof返回的是object[]类型,存在会被重构

        int Score[]=new int[] {45,78,23,98,53,35};
        Score=(int[]) Arrays.copyOfRange(scores,0,7);

        int newscore[]=new int[]{67,78,98,90,56};
        System.arraycopy(scores,0,newscore,3,1);

        int scoress[]=new int[]{34,67,67,65,4,3,};
        scoress=(int[]) scores.clone();

        System.out.println("scoreses:");
        for(int i=0;i<scoreses.length;i++){
            System.out.print(scoreses[i]+"\t");
        }
        System.out.println();
        System.out.println("newscore:");
        for(int i=0;i<newscore.length;i++){
            System.out.print(newscore[i]+"\t");
        }
        System.out.println();
        System.out.println("Score:");
        for(int i=0;i<Score.length;i++){
            System.out.print(Score[i]+"\t");
        }
        System.out.println();
        System.out.println("scoress:");
        for(int i=0;i<scoress.length;i++){
            System.out.print(scoress[i]+"\t");
        }



    }
}
