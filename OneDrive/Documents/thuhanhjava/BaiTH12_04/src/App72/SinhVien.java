/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App72;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String ten;
    private String tuoi;
    
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        if(ten==null||ten.isEmpty()){
            this.ten ="khong biet";
        }
        else{
            this.ten=ten;
        }
    }
    public String getTuoi(){
        if(Integer.valueOf(tuoi)!=-1){
            return tuoi;
        }
        else{
            return"Tuoi khong hop le";
        }
    }
    public void setTuoi(int tuoi){
        if(tuoi>18){
            this.tuoi=String.valueOf(tuoi);
        }
        else{
            this.tuoi=String.valueOf(-1);
        }
    }
}
