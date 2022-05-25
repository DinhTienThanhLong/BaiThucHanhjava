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
public class app87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("TH","Thanh Hóa");
        hashMapCity.put("HN", "Hà Nội");
        hashMapCity.put("QN", " Quảng Ninh");
        hashMapCity.put("QN", "Quảng Nam");
        
        System.out.println("Danh sách các thành phố trong hashmapcity: ");
        Set<Map.Entry<String,String>>setCity= hashMapCity.entrySet();
        System.out.print(setCity);
        
        System.out.println("HN: " + hashMapCity.get("HN"));
        System.out.println("NT: " + hashMapCity.get("NT"));
        
        if(hashMapCity.containsValue("Thanh Hóa")){
            System.out.println(" có thành phố Thanh Hóa trong hashMapCity");
        }
        
        
    }
    
}
