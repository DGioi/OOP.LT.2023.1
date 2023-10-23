package week4.week6;

public class StringExample {

    public static void main(String[] args) {
        String s1 = "abc"; // pool of liternal String , cũng tương tự như bể int

        String s2=new String("abc");
    
        String s3 = "abc";
    
        String s4 = new String("abc"); //Chỉ có mình s1 và s3 là bằng nhau (so sánh tham chiếu)
        
        System.out.println(s2==s4); // so sánh tham chiếu
        System.out.println(s2.equals(s4));

        final int N =10000;
        long l =System.currentTimeMillis();
        String s = "";
        for(int i=0;i<N;i++){
            s+=i;
        }
        System.out.println(System.currentTimeMillis()-l);

         l =System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("");
        for(int i=0;i<N;i++){
            sb.append(i);
        }
        String s2 = sb.toString();
        System.out.println(System.currentTimeMillis()-l);
    }

}
