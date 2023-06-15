/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class datasetAdmin {
    
   private ArrayList<String> idadmin;
    private ArrayList<String> emailadmin;
    private ArrayList<String> pswdadmin;
    private ArrayList<String> namaadmin;
    private ArrayList<String> hpadmin;
    private ArrayList<String> imgadmin;
    private ArrayList<String> PKadmin;
    
    
    public  datasetAdmin(){
        idadmin = new ArrayList<String>();
        emailadmin = new ArrayList<String>();
        pswdadmin = new ArrayList<String>();
        namaadmin = new ArrayList<String>();
        hpadmin = new ArrayList<String>();
        imgadmin = new ArrayList<String>();
        PKadmin = new ArrayList<String>();                   
    }
    
     public void insertidadmin(String isi){
        this.idadmin.add(isi);
    }
    public ArrayList<String> getRecordidadmin(){
        return this.idadmin;
    }
    
    public void insertemailadmin(String isi){
        this.emailadmin.add(isi);
    }
    public ArrayList<String> getRecordemailadmin(){
        return this.emailadmin;
    }
    
    public void insertpswdadmin(String isi){
        this.pswdadmin.add(isi);
    }
    public ArrayList<String> getRecordpswdadmin(){
        return this.pswdadmin;
    }
    
    public void insertnamaadmin(String isi){
        this.namaadmin.add(isi);
    }
    public ArrayList<String> getRecordnamaadmin(){
        return this.namaadmin;
    }
    
    public void inserthpadmin(String isi){
        this.hpadmin.add(isi);
    }
    public ArrayList<String> getRecordhpadmin(){
        return this.hpadmin;
    }
    
    public void insertimgadmin(String isi){
        this.imgadmin.add(isi);
    }
    public ArrayList<String> getRecordimgadmin(){
        return this.imgadmin;
    }
    
    public void insertPKadmin(String isi){
        this.PKadmin.add(isi);
    }
    public ArrayList<String> getRecordPKadmin(){
        return this.PKadmin;
    }
    
    public void insertAdmin(String idadmin, String emailadmin, String pswdadmin, String namaadmin, 
            String imgadmin, String PKadmin){
        this.idadmin.add(idadmin);
        this.emailadmin.add(emailadmin);
        this.pswdadmin.add(pswdadmin);
        this.namaadmin.add(namaadmin);
        this.imgadmin.add(imgadmin);
        this.PKadmin.add(PKadmin);
        
    }
    
}   
