/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class event {
    private int ev_tr_id;
    private String ev_start, ev_end, ev_descr;
    
    public event(int ev_tr_id, String ev_start, String ev_end, String ev_descr){
        this.ev_tr_id = ev_tr_id;
        this.ev_start = ev_start;
        this.ev_end = ev_end;
        this.ev_descr = ev_descr;
    }
    
    public int getev_tr_id(){
        return ev_tr_id;
    }
    public String getev_start(){
        return ev_start;
    }
    public String getev_end(){
        return ev_descr;
    }
    public String getev_descr(){
        return ev_descr;
    }
}
