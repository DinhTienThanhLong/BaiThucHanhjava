/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class app21 {
     public static void main(String[] args){
         ArrayList <String> color = new  ArrayList<String>(3);
        color.add(1,"red");
        color.add(2,"blue");
        color.remove("green");
        color.add(4,"pink");
        color.add(5,"yellow");
        color.add(6,"orange");
      
        System.out.println(color.get(1));
        System.out.println(color.contains("orange"));
        System.out.println(color.size());
        System.out.println(color);
                
     }
}
