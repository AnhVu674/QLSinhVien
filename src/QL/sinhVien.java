package QL;

import java.util.Objects;

public class sinhVien {

	private int maSV;
	private String tenSV;
	private String diaChi;
	private float diemTB;
	

	public sinhVien(int maSV, String tenSV, String diaChi, float diemTB) {
		this.maSV = maSV;
		this.tenSV=tenSV;
		this.diaChi=diaChi;
		this.diemTB=diemTB;
	}


	@Override
	public int hashCode() {
		return Objects.hash(diaChi, diemTB, maSV, tenSV);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		sinhVien other = (sinhVien) obj;
		return Objects.equals(diaChi, other.diaChi) && diemTB == other.diemTB && maSV == other.maSV
				&& Objects.equals(tenSV, other.tenSV);
	}


	public int getMaSV() {
		return maSV;
	}
public boolean equals(sinhVien sv) {
	return this.getMaSV()==sv.getMaSV();
}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}


	public String getTenSV() {
		return tenSV;
	}


	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public float getDiemTB() {
		return diemTB;
	}


	public void setDiemTB(int diemTB) {
		this.diemTB = diemTB;
	}

}
