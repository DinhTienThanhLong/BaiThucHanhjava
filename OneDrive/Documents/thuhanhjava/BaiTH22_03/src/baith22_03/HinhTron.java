/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith22_03;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class HinhTron {

    /**
     * @param args the command line arguments
     */
        final float PI =  3.14f;
        float r;
        float chuvi;
        float dientich;
    
        void nhapBankinh(){
            System.out.println("Hay nhap ban kinh hinh tron: ");
            Scanner sc = new Scanner(System.in);
            r = sc.nextFloat(); 
        }
        void tinhChuVi(){
            chuvi = 2* PI *r ;
           }
        void tinhDienTich(){
        dientich = PI * r* r;
           }
        void inChuvi(){
        System.out.println("Chu vi hinh tron : " +chuvi);
        }
        void inDientich(){
           System.out.println("Dien tich hinh tron: " + dientich);
        }
}
