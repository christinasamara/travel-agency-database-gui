/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class phones {
    private int ph_br_code;
    private String ph_number;
    
    public phones(int ph_br_code, String ph_number){
        this.ph_br_code = ph_br_code;
        this.ph_number = ph_number;
    }
    public int getph_br_code(){
        return ph_br_code;
    }
    public String getph_number(){
        return ph_number;
    }
}
