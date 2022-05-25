/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith1705;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 *
 * @author Admin
 */
public class app59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Set<String> linkedhashset = new LinkedHashSet<String>();
       linkedhashset.add("java");
       linkedhashset.add("c++");
       linkedhashset.add("java");
       linkedhashset.add("php");
       
       for(String str : linkedhashset){
           System.out.println(str);
       }
    }
    
}
