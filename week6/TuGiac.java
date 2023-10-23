public class TuGiac {
    private Point p1,p2,p3,p4;

    public TuGiac(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    public void inTuGiac(){
     p1.printPoint(p1);
     p2.printPoint(p2);
     p3.printPoint(p3);
     p4.printPoint(p4);
    }
    public static void main(String[] args) {
        Point p1 = new Point(0, 9);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 6);
        Point p4 = new Point(8, 0);
        TuGiac tg1 = new TuGiac(p1, p2, p3, p4);
        tg1.inTuGiac();
    }
    
}
