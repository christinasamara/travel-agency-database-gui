/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
class reservation_offers {
    private int resof_id, resof_of_id, resof_paid;
    private String resof_name, resof_lname;
    
    public reservation_offers(int resof_id, String resof_name, String resof_lname, int resof_of_id, int resof_paid){
        this.resof_id = resof_id;
        this.resof_name = resof_name;
        this.resof_lname = resof_lname;
        this.resof_of_id = resof_of_id;
        this.resof_paid = resof_paid;
    }
    public int getresof_id(){
        return resof_id;
    }
    public String getresof_name(){
        return resof_name;
    }
    public String getresof_lname(){
        return resof_lname;
    }
    public int getresof_of_id(){
        return resof_of_id;
    }
    public int getresof_paid(){
        return resof_paid;
    }
}
