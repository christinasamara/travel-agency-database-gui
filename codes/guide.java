/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class guide {
    private String wrk_AT, wrk_name, wrk_lname, gui_AT, gui_cv, lng_gui_AT, lng_language;
    private float wrk_salary;
    private int wrk_br_code;
    
    public guide(String gui_AT, String gui_cv, String wrk_AT, String wrk_name, String wrk_lname, float wrk_salary, int wrk_br_code, String lng_gui_AT, String lng_language){
        this.gui_AT = gui_AT;
        this.gui_cv = gui_cv;
        this.wrk_AT = wrk_AT;
        this.wrk_name = wrk_name;
        this.wrk_lname = wrk_lname;
        this.wrk_salary = wrk_salary;
        this.wrk_br_code = wrk_br_code;
        this.lng_gui_AT = lng_gui_AT;
        this.lng_language = lng_language;
    }
    public String getgui_AT(){
        return gui_AT;
    }
    public String getgui_cv(){
        return gui_cv;
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
    public String getlng_gui_AT(){
        return lng_gui_AT;
    }
    public String getlng_language(){
        return lng_language;
    }
}
