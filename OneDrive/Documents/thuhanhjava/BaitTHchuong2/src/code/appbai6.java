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
public class appbai6 {
     private static Scanner a = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       	int n,giaithua=1;
		do {
			System.out.println("nhập vào 1 số nguyên dương: ");
			n=a.nextInt();
		}
		while(n<=0);
		for(int i=1;i<=n;i++)
		{
			giaithua=giaithua*i;
		}
		System.out.println("giai thừa số vừa nhập là: "+giaithua);
		 // TODO code application logic here
    }
    
}
