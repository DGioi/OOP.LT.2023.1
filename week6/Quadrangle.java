public class Quadrangle {
    private int p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y;

    public Quadrangle(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y, int p4x, int p4y) {
        this.p1x = p1x;
        this.p1y = p1y;
        this.p2x = p2x;
        this.p2y = p2y;
        this.p3x = p3x;
        this.p3y = p3y;
        this.p4x = p4x;
        this.p4y = p4y;
    }
    
    public void printQuadrangle(){
        System.out.println("("+p1x+","+p1y+")");
        System.out.println("("+p2x+","+p2y+")");
        System.out.println("("+p3x+","+p3y+")");
        System.out.println("("+p4x+","+p4y+")");
    }
    public static void main(String[] args) {
        Quadrangle q = new Quadrangle(0, 0, 0, 0, 0, 0, 0, 0);
        q.printQuadrangle();
    }
}
