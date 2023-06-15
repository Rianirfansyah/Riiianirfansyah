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
 public class datasetpelanggan {
    private ArrayList<Integer> idpelanggan;
    private ArrayList<String> namapelanggan;
    private ArrayList<String> emailpelanggan;
    private ArrayList<String> hppelanggan;  
    private ArrayList<Integer> PKpelanggan;
    
    public  datasetpelanggan(){
        idpelanggan = new ArrayList<Integer>();
        namapelanggan = new ArrayList<String>();
        emailpelanggan = new ArrayList<String>();
        hppelanggan = new ArrayList<String>();
        PKpelanggan = new ArrayList<Integer>();
    }
    
    public void insertidpelanggan(int isi){
        this.idpelanggan.add(isi);
    }
    public ArrayList<Integer> getRecordidpelanggan(){
        return this.idpelanggan;
    }
    
    public void insertnamapelanggan(String isi){
        this.namapelanggan.add(isi);
    }
    public ArrayList<String> getRecordnamapelanggan(){
        return this.namapelanggan;
    }
    
    public void insertemailpelanggan(String isi){
        this.emailpelanggan.add(isi);
    }
    public ArrayList<String> getRecordemailpelanggan(){
        return this.emailpelanggan;
    }
     public void inserthppelanggan(String isi){
        this.hppelanggan.add(isi);
    }
    public ArrayList<String> getRecordhppelanggan(){
        return this.hppelanggan;
    }
    public void insertPKpelanggan(int isi){
        this.PKpelanggan.add(isi);
    }
    public ArrayList<Integer> getRecordPKpelanggan(){
        return this.PKpelanggan;
    }
    
    public void insertpelanggan(int idpelanggan, String namapelanggan, String emailpelanggan, String hppelanggan,int PKpelanggan){
        this.idpelanggan.add(idpelanggan);
        this.namapelanggan.add(namapelanggan);
        this.emailpelanggan.add(emailpelanggan);
        this.hppelanggan.add(hppelanggan);
        this.PKpelanggan.add(PKpelanggan);
    }
}
