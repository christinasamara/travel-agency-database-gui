/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class driver {
    private String wrk_AT, wrk_name, wrk_lname, drv_AT, drv_license, drv_route;
    private int wrk_br_code, drv_experience;
    private float wrk_salary;
    
    public driver(String wrk_AT, String wrk_name, String wrk_lname, float wrk_salary, int wrk_br_code, String drv_AT, String drv_license, String drv_route, int drv_experience){
        this.wrk_AT = wrk_AT;
        this.wrk_name = wrk_name;
        this.wrk_lname = wrk_lname;
        this.wrk_salary = wrk_salary;
        this.wrk_br_code = wrk_br_code;
        this.drv_AT = drv_AT;
        this.drv_license = drv_license;
        this.drv_route = drv_route;
        this.drv_experience = drv_experience;
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
    public String getdrv_AT(){
        return drv_AT;
    }
    public String getdrv_license(){
        return drv_license;
    }
    public String getdrv_route(){
        return drv_route;
    }
    public int getdrv_experience(){
        return drv_experience;
    }
}
