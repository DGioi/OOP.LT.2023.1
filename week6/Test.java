package week4.week6;

public class Test {
    public static void main(String[] args) {
        int i=6;
        // Example ex =new Example();
        // Example ex_2 =new Example();

        Integer iObj1 = new Integer(7);  
        //bị deprecate không dùng bởi vì không mang lại hiệu năng cao.  Trong java có khái niệm
        // là pool of in object để tăng hiệu năng chương trình
        // thay vào đó sử dụng autobox và auto unbox
        Integer iObj = 7; // auto-boxing
        i=iObj;            //auto-unboxing
        Integer iObj2= 7;
        System.out.println(iObj==iObj2);
        System.out.println(iObj==iObj1);


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
    }
    
}
