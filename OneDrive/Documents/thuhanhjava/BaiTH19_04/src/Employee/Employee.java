/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;
import baith19_04.Person;
/**
 *
 * @author Admin
 */
public class Employee extends Person{

    
    protected double luong;
    
    public Employee(){
        
    }
    public Employee(String ten , int tuoi ){
        this.ten=ten;
        this.tuoi=tuoi;
    }
    protected String loaiNhanVien(){
        return"";
    }
    public void xuatThongTin(){
        System.out.println("----- Nhan Vien : " + ten + "----------");
        System.out.println("-- Loai nhan vien:  "+ loaiNhanVien());
        System.out.println("- Luong: .." + luong +" (VND)");
    }
}
