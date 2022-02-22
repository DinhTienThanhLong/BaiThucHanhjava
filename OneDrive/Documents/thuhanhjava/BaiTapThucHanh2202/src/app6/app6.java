/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://pornbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app6;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class app6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.print("Nhập vào 1 số : ");
        int n = s.nextInt();
        while(n <= 0);
              for( int i = 2; i <= n; i++)
             {
             int sum = 1;
                for(int j = 2; j <= i/2; j++)
                 {
                  if(i%j == 0)
                   sum += j;
                }
             if(sum == i)
            System.out.println("\n " +i);
    }// TODO code application logic here
    }
    
}
