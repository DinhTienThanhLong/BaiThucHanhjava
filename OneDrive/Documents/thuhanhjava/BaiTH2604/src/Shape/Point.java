/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Shape;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Point {
    private String TenDiem;
    private float x;
    private float y;
    
    public Point(){
        
    }
    
    public Point(String TenDiem , float x, float y){
        this.TenDiem = TenDiem;
        this.x=x;
        this.y=y;
    }
    
    public String gettenDiem(){
        return TenDiem;
    }
    public void settenDiem(String TenDiem){
        this.TenDiem = TenDiem;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tên điểm: ");
         TenDiem = sc.nextLine();
        System.out.print("nhập x ");
         x = sc.nextFloat();
        System.out.print("nhập y ");
         y = sc.nextFloat();
    }
    public void in(){
        System.out.println( ""+ TenDiem + "(" + x +"," + y  );
    }
    
}
