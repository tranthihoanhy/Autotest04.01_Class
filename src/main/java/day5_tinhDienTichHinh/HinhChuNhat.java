package day5_tinhDienTichHinh;

public class HinhChuNhat extends HinhHoc{
	public int chieuDai;
	public int chieuRong;
	
	@Override
	public double tinhDienTich()
	{
		return chieuDai*chieuRong;
	}
}
