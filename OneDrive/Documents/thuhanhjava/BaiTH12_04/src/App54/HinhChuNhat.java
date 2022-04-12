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
public class HinhChuNhat extends HinhHoc{
    public float cd;
    public float cr;
    public HinhChuNhat(){
        ten="hinh chu nhat";
    }
    public void nhapcdcr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu dai la " +cd);
        cd =  sc.nextFloat();
        System.out.println("chieu rong la " +cr);
        cr =  sc.nextFloat();
    }
    public void tinhcv(){
        cv=(cd+cr)*2;
    }
    public void tinhdt(){
        dt=cd*cr;
    }
}
