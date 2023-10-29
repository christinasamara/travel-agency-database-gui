/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class destination {
    private int dst_id, to_tr_id, to_dst_id;
    private String dst_name, dst_descr, dst_rtype, dst_language, dst_location, to_arrival, to_departure;
    
    public destination(int to_tr_id, int to_dst_id, String to_arrival, String to_departure, int dst_id, String dst_name, String dst_descr, String dst_rtype, String dst_language, String dst_location){
        this. to_tr_id = to_tr_id;
        this.to_dst_id = to_dst_id;
        this.to_arrival = to_arrival;
        this.to_departure = to_departure;
        this.dst_id = dst_id;
        this.dst_name = dst_name;
        this.dst_descr = dst_descr;
        this.dst_rtype = dst_rtype;
        this.dst_language = dst_language;
        this.dst_location = dst_location;
    }
    public int getto_tr_id(){
        return to_tr_id;
    }
    public int getto_dst_id(){
        return to_dst_id;
    }
    public String getto_arrival(){
        return to_arrival;
    }
    public String getto_departure(){
        return to_departure;
    }
    public int getdst_id(){
        return dst_id;
    }
    public String getdst_name(){
        return dst_name;
    }
    public String getdst_descr(){
        return dst_descr;
    }
    public String getdst_rtype(){
        return dst_rtype;
    }
    public String getdst_language(){
        return dst_language;
    }
    public String getdst_location(){
        return dst_location;
    }
}
