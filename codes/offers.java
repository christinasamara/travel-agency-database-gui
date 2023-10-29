/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class offers {
    private int of_id, of_costpp, of_dst_id, of_br_code;
    private String of_start, of_end;
    
    public offers(int of_id, String of_start, String of_end, int of_costpp, int of_dst_id, int br_code){
        this.of_id = of_id;
        this.of_start = of_start;
        this.of_end = of_end;
        this.of_costpp = of_costpp;
        this.of_dst_id = of_dst_id;
        this.of_br_code = of_br_code;
    }
    public int getof_id(){
        return of_id;
    }
    public String getof_start(){
        return of_start;
    }
    public String getof_end(){
        return of_end;
    }
    public int getof_costpp(){
        return of_costpp;
    }
    public int getof_dst_id(){
        return of_dst_id;
    }
    public int getof_br_code(){
        return of_br_code;
    }
}
