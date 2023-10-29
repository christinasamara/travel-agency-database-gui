/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class reservation {
    private int res_tr_id, res_seatnum;
    private String res_name, res_lname, res_isadult;
    
    public reservation(int res_tr_id, int res_seatnum, String res_name, String res_lname, String res_isadult){
        this.res_tr_id = res_tr_id;
        this.res_seatnum = res_seatnum;
        this.res_name = res_name;
        this.res_lname = res_lname;
        this.res_isadult = res_isadult;
    }
    public int getres_tr_id(){
        return res_tr_id;
    }
    public int getres_seatnum(){
        return res_seatnum;
    }
    public String getres_name(){
        return res_name;
    }
    public String getres_lname(){
        return res_lname;
    }
    public String getres_isadult(){
        return res_isadult;
    }
}
