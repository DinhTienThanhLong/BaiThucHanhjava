/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app11;

/**
 *
 * @author Admin
 */
public class app11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int dem=0;
		for(int i=0;i<=20;i++)
			{
			for(int j=0;j<=10;j++)
			{
				for(int k=0;k<=4;k++)
					if(i*10 + j*20 + k*50==200)
					{	System.out.println(i+" to10k   "+ j +" to20k   "+k+"  to50k" );
						dem++;
					}
			}
			}
		System.out.println("co "+dem+" phuong an");  // TODO code application logic here
    }
    
}
