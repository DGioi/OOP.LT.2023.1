package week5;

public class App {
    public static void test(){
        for(int i=0;i<1000000;i++){
            Student s=new Student();
        }
    }
    public static void main(String[] args) {
    System.out.println("Start");
    test();

    System.gc();
    System.out.println("enl");
    }
}
