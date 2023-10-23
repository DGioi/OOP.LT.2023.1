package week4;

public class NhanVien {
	private static  int counter=0;
	 private String tenNhanVien;
	 private double luongCoBan;
	 private double heSoLuong;

//	 static: dùng chung , là thành viên lớp, khôg phải thành viên đối tượng
//	bên trong thành viên lớp không truy cập được thành viên đối tượng
	 public final double LUONG_MAX=100000000;

	public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
		this.tenNhanVien = tenNhanVien;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		counter++;
	}
	public NhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
		counter++;
	}

	public static int getCounter(){
		return counter;
	}
	public void luongMoi(int luongCoBan,double heSoLuong){
		this.luongCoBan=luongCoBan;
		this.heSoLuong=heSoLuong;

	}
	public boolean tangLuong(double heSoTangThem) {
		 heSoLuong+=heSoTangThem;
		 if(tinhLuong()<=LUONG_MAX) {
			 return true;
		 }
		 else {
			heSoLuong-=heSoTangThem;
			return false;
		}

//		if(luongCoBan*(heSoLuong+x)>LUONG_MAX) return false;
//		else return true;
	}
	 public double tinhLuong() {
		 return luongCoBan*heSoLuong;
		
	}

	public String getTenNhanVien(){
		return  tenNhanVien;
	}
	 public void inTTin() {
		System.out.println("Nhân Viên:"+tenNhanVien+".Lương:" +tinhLuong());
	}
	 
}
