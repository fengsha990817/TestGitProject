public class MainClass {
    public static void main(String[] args) {
        System.out.println("这是用于测试Git的第一个commit");
        testFunc();
    }

    public static void testFunc(){
        System.out.println("这是新分支的函数");
    }
    public static void masterBranch(){
        System.out.println("这是master分支的提交");
    }
}
