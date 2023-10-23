package week4.week6;

public class Example {
    //public final int MINIUM=18;
    public final int MINIUM;
    public static final int MAXIMUM=18;

    static {
        // đây là khối lệnh static, chỉ chạy đúng 1 lần và chạy trước hàm khởi dựng.
        System.out.println("Hello from Example ");
    }

    public Example( ){
        MINIUM=10;
    }

    public Example(int i){
        MINIUM=i;
    }

    public static void main(String[] args) {
        
    }
    
}
