/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class admin {

    private String wrk_AT, wrk_name, wrk_lname, adm_AT, adm_type, adm_diploma, mng_adm_AT;
    private float wrk_salary;
    private int wrk_br_code, mng_br_code;
    
    public admin(String wrk_AT, String wrk_name, String wrk_lname, float wrk_salary, int wrk_br_code, String adm_AT, String adm_type, String adm_diploma, String mng_adm_AT, int mng_br_code){
        this.wrk_AT = wrk_AT;
        this.wrk_name = wrk_name;
        this.wrk_lname = wrk_lname;
        this.wrk_salary = wrk_salary;
        this.wrk_br_code = wrk_br_code;
        this.adm_AT = adm_AT;
        this.adm_type = adm_type;
        this.adm_diploma = adm_diploma;
        this.mng_adm_AT = mng_adm_AT;
        this.mng_br_code = mng_br_code;
    }
    public String getwrk_AT(){
        return wrk_AT;
    }
    public String getwrk_name(){
        return wrk_name;
    }
    public String getwrk_lname(){
        return wrk_lname;
    }
    public float getwrk_salary(){
        return wrk_salary;
    }
    public int getwrk_br_code(){
        return wrk_br_code;
    }
    public String getadm_AT(){
        return adm_AT;
    }
    public String getadm_type(){
        return adm_type;
    }
    public String getadm_diploma(){
        return adm_diploma;
    }
    public String getmng_adm_AT(){
        return mng_adm_AT;
    }
    public int getmng_br_code(){
        return mng_br_code;
    }
}
