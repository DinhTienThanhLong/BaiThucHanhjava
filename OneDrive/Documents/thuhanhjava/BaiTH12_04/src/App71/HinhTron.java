/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App71;

/**
 *
 * @author Admin
 */
class HinhTron {
      private final float PI = 3.14f;
    private float bk;
    
    public float getBK(){
        return bk;
    }
    public void setBK(float bk){
        this.bk=bk;
    }
    public float tinhCV(){
        return 2*PI*bk;
    }
    public float tinhDT(){
        return PI*bk*bk;
    }
}
