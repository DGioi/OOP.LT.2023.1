package week4;
import javax.swing.JOptionPane;

public class TestNV {
    public static void main(String[] args) {
        NhanVien nv1= new NhanVien("Duong Van Gioi",1000000,100);
        NhanVien nv2= new NhanVien("Trong Xuan");

        nv1.inTTin();
        nv1.tangLuong(1);
        nv2.luongMoi(100000,3.8);
        nv2.inTTin();
        System.out.println(NhanVien.getCounter());
        JOptionPane.showMessageDialog(null,"Xin chao"+nv1.getTenNhanVien());
    }
}
