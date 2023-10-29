/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class Branch_Pays {
    private String wrk_name, wrk_lname;
    private float wrk_salary;
    
    public Branch_Pays(String wrk_name, String wrk_lname, float wrk_salary){
        this.wrk_name = wrk_name;
        this.wrk_lname = wrk_lname;
        this.wrk_salary = wrk_salary;
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
}
