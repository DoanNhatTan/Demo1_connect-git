package buoi2;

public abstract class sinhVien {
	public static String Truong = "JavaBasic";
	private String Ten;
	private String Khoa;
	private Double DTB;
	
	
	public Double getDTB() {
		return DTB;
	}
	public void setDTB(Double dTB) {
		DTB = dTB;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getTen() {
		return Ten;
	}
	
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	public String getKhoa() {
		return Khoa;
	}
	
	public sinhVien(String Ten, String Khoa){
		this.Ten = Ten;
		this.Khoa = Khoa;
	}
	public void outPutDTB()
	{
		
	}
	
		

}
