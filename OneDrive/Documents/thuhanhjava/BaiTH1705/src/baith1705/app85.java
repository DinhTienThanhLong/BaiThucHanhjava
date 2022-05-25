/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith1705;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
/**
 *
 * @author Admin
 */
public class app85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<String, String> hashMap = new HashMap<>();
       hashMap.put("CSLT", "Cơ sở lập trình");
       hashMap.put("GT", "Giải Tích");
       hashMap.put("c++", "c++");
       hashMap.put("php", "php");
       hashMap.put("java", "java");
       
       Set<Map.Entry<String,String>>sethashMap= hashMap.entrySet();
       System.out.println("các entry có trong hashMap là : ");
       System.out.println(sethashMap);
    }
    
}
