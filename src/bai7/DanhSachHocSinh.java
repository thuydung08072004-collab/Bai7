/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

/**
 *
 * @author tnfb0
 */


import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachHocSinh {
    private ArrayList<HSHocSinh> danhSach = new ArrayList<>();

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin hoc sinh thu " + (i+1) + ":");
            HSHocSinh hs = new HSHocSinh();
            hs.nhapThongTin();
            danhSach.add(hs);
        }
    }

    public void hienThiSinhNam1985ThaiNguyen() {
        System.out.println("\n=== DANH SACH HOC SINH SINH NAM 1985 VA QUE O THAI NGUYEN ===");
        for (HSHocSinh hs : danhSach) {
            if (hs.getNgaySinh().contains("1985") && hs.getQueQuan().equalsIgnoreCase("Thai Nguyen")) {
                hs.hienThiThongTin();
                System.out.println("---------------------");
            }
        }
    }

    public void hienThiLop10A1() {
        System.out.println("\n=== DANH SACH HOC SINH LOP 10A1 ===");
        for (HSHocSinh hs : danhSach) {
            if (hs.getLop().equalsIgnoreCase("10A1")) {
                hs.hienThiThongTin();
                System.out.println("---------------------");
            }
        }
    }
}
