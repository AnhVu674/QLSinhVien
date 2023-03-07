package QL;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception{
		DsQLSV dssv = new DsQLSV(null);
		int choose;
		Scanner input = new Scanner(System.in);
		do {
			
			System.out.println("Nhap lua chon cua ban:");
			System.out.println("-----MENU-----");
			System.out.println("Vui long chon chuc nang");
			System.out.println("1. Them sinh vien\n" + "2. Kiem tra danh sach rong hay khong\n"
					+ "3. Kiem tra so luong phan tu trong danh sach\n" + "4. Lam rong danh sach\n"
					+ "5. Xoa sinh vien co ma\n" + "6. Kiem tra sinh vien co ma co trong danh sach\n"
					+ "7. Tim kiem sinh vien co ma\n" + "8. Xuat danh sach voi diem trung binh tu cao den thap\n"
					+ "0. Thoat khoi chuong trinh ");
			choose = Integer.parseInt(input.next());
			if (choose == 1) {
				int maSV;
				String tenSV;
				String diaChi;
				float diemTB;
				try {
					System.out.println("Nhap ma sinh vien:");maSV = input.nextInt();input.nextLine();
					System.out.println("Nhap ten sinh vien:"); tenSV = input.nextLine();
					System.out.println("Nhap  dia chi sinh vien:\n");
					diaChi = input.nextLine();
					System.out.println("Nhap diem trung binh sinh vien:");
					diemTB = Float.parseFloat(input.next());
					sinhVien sv = new sinhVien(maSV, tenSV, diaChi, diemTB);
					dssv.themSV(sv);
				} catch (NumberFormatException e) {
throw new Exception("Loi nhap!!"+"kieu du lieu");			
}
			} else if (choose == 2) {
				System.out.println("Danh sach:" + dssv.checkDS());
			} else if (choose == 3) {
				System.out.println("Danh sach co:" + dssv.checkSoLuong() + "sinh vien");
			} else if (choose == 4) {
//				System.out.println("Da xoa danh sach");
				dssv.xoaAll();
			} else if (choose == 5) {
				System.out.println("Nhap ma sinh vien can xoa:");
				int maSV = Integer.parseInt(input.next());
				sinhVien sv = new sinhVien(maSV,null,null, maSV);
				dssv.xoaSV(sv);
			} else if (choose == 6) {
				System.out.println("Nhap ma sinh vien can kiem tra:");
				int maSV = Integer.parseInt(input.next());
				sinhVien sv = new sinhVien(maSV, null, null, maSV);
				dssv.checkSV(sv);
			} else if (choose == 7) {
				System.out.println("Nhap ma sinh vien can tim");
				int maSV = Integer.parseInt(input.next());
				sinhVien sv = new sinhVien(maSV, null, null, maSV);
				System.out.println("tim kiem");
				dssv.findSV(sv);
			} else if (choose == 8) {
//				System.out.println("danh sach sinh vien co diem trung binh tu cao den thap:")
				dssv.outputDS();
			}
		} while (choose!= 0);

	}
}
