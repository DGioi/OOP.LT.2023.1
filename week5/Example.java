package week5;
// trong java luon luon truyen ban sao
public class Example {
    public static void increase(int i){
        i+=1;
    }

    public static void increase(Student s){
        s.setAge(s.getAge()+1);
    }
    public static void main(String[] args) {
        Student s=new Student("Hung",20);
        increase(s);
        System.out.println(s.getAge());

    }
}
