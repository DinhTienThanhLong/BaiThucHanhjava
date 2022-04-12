/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App77;

/**
 *
 * @author Admin
 */
public class Configs {
    public static final int SO_LUONG_HINH_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;
    
    public static final float PI=3.14f;
    public static final float INCH_CM=2.45f;
    public static final int DON_VI_CM=1;
    public static final int DON_VI_INCH=2;
    public static int donVi=DON_VI_CM;
    
    public static float ChuyenCentimetSangInch(float cm){
        float inch = cm / INCH_CM;
        return inch;
    }
    public static float ChuyenInchSangCentimet( float inch){
        float cm = inch * INCH_CM;
        return cm;
    }
            
}
