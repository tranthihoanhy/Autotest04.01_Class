package day5_tinhDienTichHinh;

public class HinhTron extends HinhHoc{

	public int banKinh;
	@Override
	public double tinhDienTich()
	{
		return 3.14 * banKinh * banKinh;
	}
}
