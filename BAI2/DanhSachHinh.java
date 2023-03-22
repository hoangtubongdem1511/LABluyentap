/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Redmi
 */
public class DanhSachHinh {
    ArrayList <Hinh> list;
    
    public DanhSachHinh() {
        super();
        list = new ArrayList<>();
    }
    
    public DanhSachHinh(ArrayList <Hinh> list) {
        this.list = list;
    }
    
    public void xuat()
    {
        for(Hinh h : list)
        {
            System.out.println(h);
        }
    }
    
    public void AddHinh(Hinh ht){
        list.add(ht);
    }
    
}
