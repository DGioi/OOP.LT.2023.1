package week5;

public class Example2 {
    public static int add(int ...a){
        int res=0;
        for(int i:a){
            res+=i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(add(4,6,9));
    }
}
