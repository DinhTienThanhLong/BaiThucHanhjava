/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package code;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class appbai2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Nhập số 1 số nguyên dương: ");
        int b = a.nextInt();
            if( b%2==0)
            {
           System.out.println(+b+ " là số chẳn");// TODO code application logic here
    }
            else
                System.out.println( +b+ " là số lẻ");
    
}
}
