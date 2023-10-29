/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class it {
    private String wrk_AT, wrk_name, wrk_lname, it_AT, it_pswb, it_start_date, it_end_date;
    private int wrk_br_code;
    private float wrk_salary;
    
    public it(String wrk_AT, String wrk_name, String wrk_lname, float wrk_salary, int wrk_br_code, String it_AT, String it_pswb, String it_start_date, String it_end_date){
        this.wrk_AT = wrk_AT;
        this.wrk_name = wrk_name;
        this.wrk_lname = wrk_lname;
        this.wrk_salary = wrk_salary;
        this.wrk_br_code = wrk_br_code;
        this.it_AT = it_AT;
        this.it_pswb = it_pswb;
        this.it_start_date = it_start_date;
        this.it_end_date = it_end_date;
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
    public String getit_AT(){
        return it_AT;
    }
    public String getit_pswb(){
        return it_pswb;
    }
    public String getit_start_date(){
        return it_start_date;
    }
    public String getit_end_date(){
        return it_end_date;
    }
}
