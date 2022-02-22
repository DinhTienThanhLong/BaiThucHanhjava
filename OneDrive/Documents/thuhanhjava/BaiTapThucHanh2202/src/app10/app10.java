/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app10;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class app10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("nhập vào 1 số nguyên");
        int a = s.nextInt();
        int dem=0;
		while(a>0)
		{
			dem++;
			a=a/10;
		}
		
		System.out.println("so vua nhap co "+dem+" chu so");// TODO code application logic here
    }
    
}
