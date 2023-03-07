package QL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DsQLSV {
	private ArrayList<sinhVien> dssv = null;

	public DsQLSV(ArrayList<sinhVien> dssv) {
		this.dssv = new ArrayList<sinhVien>();
	}

	public ArrayList<sinhVien> getDssv() {
		return dssv;
	}

	public void setDssv(ArrayList<sinhVien> dssv) {
		this.dssv = dssv;
	}

	public void themSV(sinhVien sv) {
		this.dssv.add(sv);
	}

	public boolean checkDS() {
		return this.dssv.isEmpty();
	}

	public int checkSoLuong() {
		return this.dssv.size();
	}

	public void xoaAll() {
		this.dssv.remove(dssv);
	}

	public boolean xoaSV(sinhVien sv) {
		return this.dssv.remove(sv);
	}

	public boolean checkSV(sinhVien sv) {
		return this.dssv.contains(sv);
	}

	public void findSV(sinhVien sv) {
		for (sinhVien sv1 : dssv) {
			if (equals(sv1)) {
				System.out.println(sv1);
			}
		}
	}

	public void outputDS() {
		for (sinhVien sv : dssv) {

		}
		Collections.sort(this.dssv, new Comparator<sinhVien>() {

			@Override
			public int compare(sinhVien sv1, sinhVien sv2) {
				if (sv1.getDiemTB() > sv2.getDiemTB()) {
					return 1;
				} else if (sv1.getDiemTB() < sv2.getDiemTB()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}

}
