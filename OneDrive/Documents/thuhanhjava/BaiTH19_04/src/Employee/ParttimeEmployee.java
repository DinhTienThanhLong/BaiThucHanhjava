/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;
import Employee.Configs;
/**
 *
 * @author Admin
 */
public class ParttimeEmployee extends Employee {
    private int gioLamViec;
   
   public ParttimeEmployee(String ten, int gioLamViec){
       this.ten=ten;
       this.gioLamViec=gioLamViec;
      
   }
   @Override
   public String loaiNhanVien(){
       return "Nhan vien lam theo gio";
   }
   public void tinhLuong(){
       luong = Configs.LUONG_PART_TIME_MOI_GIO* gioLamViec;
   }
}
