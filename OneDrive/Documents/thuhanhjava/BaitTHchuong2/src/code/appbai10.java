/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package code;

import java.util.Scanner;
 
public class appbai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
       String chuoi;
		char kitu;
		int dem=0;
		do 
		{
			System.out.println("nhập vào 1 chuỗi : ");
			chuoi=sc.nextLine();
		}
		while(chuoi.length()>80);
		System.out.println("nhập vào 1 kí tự: ");
		kitu=sc.next().charAt(0);
		char mang[]=chuoi.toCharArray();
		for(int i=0;i<mang.length;i++)
		{
			if(mang[i]==kitu)
			{
				dem++;
			}
		}
		System.out.println("có "+dem+" kí tự "+kitu+" trong chuỗi vừa nhập");
		 // TODO code application logic here
    }
    
}