/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class test {
    private static HinhTron nhapHinhTron() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ban kinh:");
        int r=input.nextInt();
        return new HinhTron(r);
    }
    
    private static HinhChuNhat nhapHinhChuNhat() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu dai:");
        int cd=input.nextInt();
        System.out.println("Nhap chieu rong:");
        int cr=input.nextInt();
        return new HinhChuNhat(cd,cr);
    }
    
        public static void main(String[] args) {
            HinhChuNhat hinhchunhat = nhapHinhChuNhat();
            HinhTron hinhtron = nhapHinhTron();


            DanhSachHinh dsh = new DanhSachHinh();
            System.out.println("Thong tin cac danh sach hinh la:");
            dsh.AddHinh(hinhtron);
            dsh.AddHinh(hinhchunhat);
            dsh.xuat();
    }
        
}
