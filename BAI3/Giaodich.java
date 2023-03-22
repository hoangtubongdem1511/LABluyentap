/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

/**
 *
 * @author Redmi
 */
public class Giaodich {
    public String maGiaoDich;
    public String ngayGiaoDich;
    public double donGia;
    public int soLuong;

    public Giaodich(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    public double thanhTien() {
        return 0;
    }
    public double getSoLuong() {
        return soLuong;
    }

}
