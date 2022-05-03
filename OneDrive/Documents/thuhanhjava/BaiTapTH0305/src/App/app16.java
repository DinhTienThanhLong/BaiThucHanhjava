/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class  app16{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList <String> arrListString = new  ArrayList<>();
        arrListString.add(0,"ab");
        arrListString.add(1,"bc");
        arrListString.add(2,"cd");
        arrListString.add(3,"de");
        arrListString.add(4,"ef");
        arrListString.add(5,"fg");
       
        System.out.println("Cac phan tu trong arrlistString la : ");
        for(int i =0 ; i< arrListString.size(); i++){
            System.out.print (arrListString.get(i) + "\t");
        }
        
        arrListString.set(5,"gh");
        System.out.println("Cac phan tu trong arrlistString  khi thay doi la : ");
        for(int i =0 ; i < arrListString.size(); i++){
            System.out.print (arrListString.get(i) + "\t");
        }
    }
    
}
