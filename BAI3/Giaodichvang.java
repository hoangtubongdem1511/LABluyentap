/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

/**
 *
 * @author Redmi
 */
public class Giaodichvang extends Giaodich {
    public String loaiVang;
    
    public Giaodichvang(String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }
    
    @Override
    public double thanhTien() {
    return soLuong * donGia;
    }
}
