/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

/**
 *
 * @author tnfb0
 */


import java.util.Scanner;

public class HSHocSinh {
    private Nguoi nguoi;
    private String lop;
    private String khoaHoc;
    private String kyHoc;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        nguoi = new Nguoi();
        nguoi.nhap();
        System.out.print("Nhap lop: ");
        lop = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc = sc.nextLine();
        System.out.print("Nhap ky hoc: ");
        kyHoc = sc.nextLine();
    }

    public void hienThiThongTin() {
        nguoi.hienThi();
        System.out.println("Lop: " + lop);
        System.out.println("Khoa hoc: " + khoaHoc);
        System.out.println("Ky hoc: " + kyHoc);
    }

    public String getNgaySinh() {
        return nguoi.getNgaySinh();
    }

    public String getQueQuan() {
        return nguoi.getQueQuan();
    }

    public String getLop() {
        return lop;
    }
}
