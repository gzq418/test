package test;

public class TestChild extends ExtendsTest{
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    private double score;
    public TestChild(){
        System.out.println("TestChild:");
    }
    void test(){
        System.out.println("TestChild test:");
    }
//    void testtest(){
//        super.test();
//        this.test();
//    }

}
