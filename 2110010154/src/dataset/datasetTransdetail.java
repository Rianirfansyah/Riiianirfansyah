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
public class datasetTransdetail {
    private ArrayList<Integer> notrans;
    private ArrayList<Integer> idproduk;
    private ArrayList<Integer> harga;
    private ArrayList<Integer> jmlbeli;
    private ArrayList<String> subtotal;
    private ArrayList<Integer> IXFKtransdetailproduk;
    private ArrayList<String> PKtransdetail;
    
    
    public datasetTransdetail(){
        notrans = new ArrayList<Integer>();
        idproduk = new ArrayList<Integer>();
        harga= new ArrayList<Integer>();
        jmlbeli = new ArrayList<Integer>();
        subtotal = new ArrayList<String>();
        IXFKtransdetailproduk = new ArrayList<Integer>();
        PKtransdetail = new ArrayList<String>();
    }
    
    public void insertnotrans(int isi){
        this.notrans.add(isi);
    }
    public ArrayList<Integer> getRecordnotrans(){
        return this.notrans;
    }
    
    public void insertidproduk(int isi){
        this.idproduk.add(isi);
    }
    public ArrayList<Integer> getRecordidproduk(){
        return this.idproduk;
    }
    
    public void insertharga(int isi){
        this.harga.add(isi);
    }
    public ArrayList<Integer> getRecordharga(){
        return this.harga;
    }
    
    public void insertjmlbeli(int isi){
        this.jmlbeli.add(isi);
    }
    public ArrayList<Integer> getRecordjmlbeli(){
        return this.jmlbeli;
    }
    
    public void insertsubtotal(String isi){
        this.subtotal.add(isi);
    }
    public ArrayList<String> getRecordsubtotal(){
        return this.subtotal;
    }
    
    public void insertIXFKtransdetailproduk(int isi){
        this.IXFKtransdetailproduk.add(isi);
    }
    public ArrayList<Integer> getRecordIXFKtransdetailproduk(){
        return this.IXFKtransdetailproduk;
    }
     public void insertPKtransdetail(String isi){
        this.PKtransdetail.add(isi);
    }
    public ArrayList<String> getRecordPKtransdetail(){
        return this.PKtransdetail;
    }
    
     public void insertTransdetail(int notrans, int idproduk, int harga, int jmlbeli, 
            String subtotal, int  IXFKtransdetailproduk, String PKtransdetail){
        this.notrans.add(notrans);
        this.idproduk.add(idproduk);
        this.harga.add(harga);
        this.jmlbeli.add(jmlbeli);
        this.subtotal.add(subtotal);
        this.IXFKtransdetailproduk.add(IXFKtransdetailproduk);
        this.PKtransdetail.add(PKtransdetail);
    }
    
    
}
