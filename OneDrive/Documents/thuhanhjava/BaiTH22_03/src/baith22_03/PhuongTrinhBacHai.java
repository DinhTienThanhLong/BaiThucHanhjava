/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baith22_03;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class PhuongTrinhBacHai {
     float a , b , c , delta, x1, x2;
    public static Scanner sc = new Scanner(System.in);
        void nhapA(){
        System.out.print("He so a = ");
               a = sc.nextFloat();
         }
        void nhapB(){
        System.out.print("He so b = ");
               b = sc.nextFloat();
         }
        void nhapC(){
        System.out.print("He so a = ");
               c = sc.nextFloat();
         }
        void giaiPT(){
           if(a==0){
               if(b==0){
                   System.out.println("Phuong trinh vo nghiem");
               }
               else{
                   System.out.println("Phuong trinh co 1 nghiem duy nhat"+" x = " + (-c/b));
               }
           }
           else{
             delta = b*b-4*a*c;
                if ( delta <0 )
                {
                    System.out.println("Phuong trinh vo nghiem !");
                }
                else if ( delta == 0)
                {
                    x1 = (-b/(2*a));
                    System.out.println("Phuong trinh co nghiem kep " + x1);
                }
                else{
                    x1=(float) ((-b + Math.sqrt(delta))/(2*a));
                    x2 =(float)((-b - Math.sqrt(delta))/(2*a));
                    System.out.println("Phuong trinh co 2 nghiem phan biet x1= "+ x1+ "va x2 = " + x2);
                }
        }
        }
}
