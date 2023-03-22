/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

/**
 *
 * @author Redmi
 */
public class Giaodichtiente extends Giaodich {
    public double tiGia;
    public String loaiTien;
    
    public Giaodichtiente(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, double tiGia, String loaiTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    } 
    
    @Override
    public double thanhTien() { 
        if (loaiTien == null) {
            return 0.0;
        }
        if (loaiTien.equalsIgnoreCase("USD") || loaiTien.equalsIgnoreCase("Euro")) {
            return soLuong * donGia * tiGia;
        } else if (loaiTien.equalsIgnoreCase("VND")) {
            return soLuong * donGia;
        } else {
            return 0.0;
        }
    }

}