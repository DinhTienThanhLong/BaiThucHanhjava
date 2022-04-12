/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App54;
import java.util.Scanner;
public class HinhTru extends Hinhtron{
    public float chieucao;
    public HinhTru(){
        ten="Hinh tru";
    }
    public void nhapchieucao(){
        nhapbk();
        Scanner sc = new Scanner(System.in);
        System.out.print("chieu cao la " +chieucao);
        chieucao = sc.nextFloat();
    }
    public void tinhthetich(){
        tinhdt();
        tt=dt*chieucao;
    }
}
