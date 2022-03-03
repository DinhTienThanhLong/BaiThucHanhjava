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
public class appbai11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
          int n, temp, max = 100;
        int A[] = new int[max];
        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n <= 2 || n > max-1);
        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j <= n - 1; j++) {
                if (A[j] < A[i]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
       

    }
    
}
