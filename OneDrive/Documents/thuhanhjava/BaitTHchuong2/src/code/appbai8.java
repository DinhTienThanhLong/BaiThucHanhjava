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
public class appbai8 {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("nhập n : ");
		int n=a.nextInt();
		int arr[]=new int [n];
		double sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("nhập số thứ "+(i+1)+" :");
			arr[i]=a.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("trung bình cộng là: "+(sum/n));
	
    }
}
