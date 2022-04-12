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
public class Hinhtron extends HinhHoc {
    public float bk;
    public Hinhtron(){
        ten="Hinh Tron";
    }
    public void nhapbk(){
    System.out.println("Ban kinh = ");
    Scanner sc = new Scanner(System.in);
    bk =  sc.nextFloat();
    }
    public void tinhcv(){
        cv=2*PI*bk;
    }
    public void tinhdt(){
        dt=PI*bk*bk;
    }
}
