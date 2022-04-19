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
public class FulltimeEmployee extends Employee {
      private int gioLamViec;
   
   public FulltimeEmployee(String ten,int tuoi, int gioLamViec){
       this.ten=ten;
       this.gioLamViec=gioLamViec;
      
   }
   @Override
   public String loaiNhanVien(){
       return "Nhan vien chinh thuc";
   }
   public void tinhLuong(){
        luong= Configs.LUONG_FULL_TIME * gioLamViec;
}
}
