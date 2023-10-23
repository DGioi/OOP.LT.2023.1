package week5;

public class Student {
    private String name;
    private int age;

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Student(){

    }
    public void setAge(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }

}
