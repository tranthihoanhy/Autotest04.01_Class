package day5_tinhDienTichHinh;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron hinhtron1 = new HinhTron();
		hinhtron1.setTenHinh("Hình tròn nhỏ");
		hinhtron1.banKinh = 5;
	    double dientich1	= hinhtron1.tinhDienTich();
	    System.out.println(hinhtron1.getTenHinh() +"có diện tích là:"+ dientich1);
	    
	    HinhTron hinhtron2 = new HinhTron();
	    hinhtron2.setTenHinh("Hình tròn to");
	    hinhtron2.banKinh = 8;
	    double dientich2	= hinhtron2.tinhDienTich();
	    System.out.println(hinhtron2.getTenHinh() +"có diện tích là:"+ dientich2);
	    
	    HinhChuNhat hinhCN1 = new HinhChuNhat();
	    hinhCN1.setTenHinh("Hình chữ nhật nhỏ");
	    hinhCN1.chieuDai = 3;
	    hinhCN1.chieuRong = 2;
	    System.out.println(hinhCN1.getTenHinh()+" có diện tích là: "+ hinhCN1.tinhDienTich());
	    
	    HinhChuNhat hinhCN2 = new HinhChuNhat();
	    hinhCN2.setTenHinh("Hình chữ nhật to");
	    hinhCN2.chieuDai = 5;
	    hinhCN2.chieuRong = 4;
	    System.out.println(hinhCN2.getTenHinh()+" có diện tích là: "+ hinhCN2.tinhDienTich());
	}
}
