/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App54;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class HinhVuong extends HinhChuNhat {
    public float canh;
    public HinhVuong(){
        ten =" hinh vuong";
    }
    public void nhapcanh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh la " +canh);
        cd = cr =  sc.nextFloat();
    }
}    

