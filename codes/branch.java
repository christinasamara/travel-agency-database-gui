/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class branch {
    private int br_code, br_number;
    private String br_street, br_city;
    
    public branch(int br_code, String br_street, int br_number, String br_city){
        this.br_code = br_code;
        this.br_street = br_street;
        this.br_number = br_number;
        this.br_city = br_city;
    }
    public int getbr_code(){
        return br_code;
    }
    public String getbr_street(){
        return br_street;
    }
    public int getbr_number(){
        return br_number;
    }
    public String getbr_city(){
        return br_city;
    }
}
