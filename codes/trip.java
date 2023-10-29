/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class trip {
    private String tr_departure, tr_return, tr_gui_AT, tr_drv_AT;
    private int tr_id, tr_br_code, tr_maxseats;
    private float tr_cost;
    
    public trip(int tr_id, String tr_departure, String tr_return, int tr_maxseats, float tr_cost, int tr_br_code, String tr_gui_AT, String tr_drv_AT){
        this.tr_id = tr_id;
        this.tr_departure = tr_departure;
        this.tr_return = tr_return;
        this.tr_maxseats = tr_maxseats;
        this.tr_cost = tr_cost;
        this.tr_br_code = tr_br_code;
        this.tr_gui_AT = tr_gui_AT;
        this.tr_drv_AT = tr_drv_AT;
    }
    public int gettr_id(){
        return tr_id;
    }
    public String gettr_departure(){
        return tr_departure;
    }
    public String gettr_return(){
        return tr_return;
    }
    public int gettr_maxseats(){
        return tr_maxseats;
    }
    public float gettr_cost(){
        return tr_cost;
    }
    public int gettr_br_code(){
        return tr_br_code;
    }
    public String gettr_gui_AT(){
        return tr_gui_AT;
    }
    public String gettr_drv_AT(){
        return tr_drv_AT;
    }
}
