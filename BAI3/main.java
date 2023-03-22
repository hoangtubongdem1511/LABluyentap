/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

import java.util.ArrayList;

/**
 *
 * @author Redmi
 */
public class main {
    public static void main(String[] args) {
        ArrayList<Giaodich> danhSachGiaoDich = new ArrayList<>();

        Giaodichvang gdv1 = new Giaodichvang("GD001", "20/03/2023", 45.5, 10, "18K");
        Giaodichvang gdv2 = new Giaodichvang("GD002", "21/03/2023", 46.0, 20, "24K");
        Giaodichvang gdv3 = new Giaodichvang("GD003", "22/03/2023", 47.0, 30, "9999");
        Giaodichtiente gdt1 = new Giaodichtiente("GD004", "20/03/2023", 22000, 100,4.0,"USD");
        Giaodichtiente gdt2 = new Giaodichtiente("GD005", "21/03/2023", 27000, 200, 0.3, "Euro");
        Giaodichtiente gdt3 = new Giaodichtiente("GD006", "22/03/2023", 1000000001, 300, 1, "VND");

        danhSachGiaoDich.add(gdv1);
        danhSachGiaoDich.add(gdv2);
        danhSachGiaoDich.add(gdv3);
        danhSachGiaoDich.add(gdt1);
        danhSachGiaoDich.add(gdt2);
        danhSachGiaoDich.add(gdt3);

        double tongSoLuongVang = 0.0;
        double tongSoLuongTienTe = 0.0;
        for (Giaodich gd : danhSachGiaoDich) {
            if (gd instanceof Giaodichvang) {
                tongSoLuongVang += gd.getSoLuong();
            } else if (gd instanceof Giaodichtiente) {
                tongSoLuongTienTe += gd.getSoLuong();
            }
        }
        System.out.println("Tong so luong giao dich vang: " + tongSoLuongVang);
        System.out.println("Tong so luong giao dich tien te: " + tongSoLuongTienTe);

        double tongThanhTienTienTe = 0.0;
        int soGiaoDichTienTe = 0;

        for (Giaodich gd : danhSachGiaoDich) {
            if (gd instanceof Giaodichtiente) {
                tongThanhTienTienTe += gd.thanhTien();
                soGiaoDichTienTe++;
            }
        }

        double trungBinhThanhTienTienTe = tongThanhTienTienTe / soGiaoDichTienTe;
        System.out.println("Trung binh thanh tien cua giao dich tien te: " + trungBinhThanhTienTienTe);
        System.out.println("Cac giao dich co don gia > 1 ty:");
        for (Giaodich gd : danhSachGiaoDich) {
            if (gd.donGia > 1000000000) {
                System.out.println("Ma giao dich: " + gd.maGiaoDich);
            }
        }
    }
}
