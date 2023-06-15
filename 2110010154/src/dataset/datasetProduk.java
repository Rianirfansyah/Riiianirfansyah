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
public class datasetProduk {
    private ArrayList<Integer> idproduk;
    private ArrayList<String> barcode;
    private ArrayList<String> stproduk;
    private ArrayList<String> namaproduk;
    private ArrayList<Integer> idkategoriwarna;
    private ArrayList<String> warna;
    private ArrayList<Integer> stokharga;
    private ArrayList<Integer> hargaimgproduk;
    private ArrayList<String> imgprodukFKprodukkategori;
    private ArrayList<Integer> FKprodukkategoriIXFKprodukkategori;
    private ArrayList<Integer> IXFKprodukkategori;
    private ArrayList<Integer> PKproduk;
    
    
    public datasetProduk(){
        idproduk = new ArrayList<Integer>();
        barcode = new ArrayList<String>();
        stproduk = new ArrayList<String>();
        namaproduk = new ArrayList<String>();
        idkategoriwarna = new ArrayList<Integer>();
        warna = new ArrayList<String>();
        stokharga = new ArrayList<Integer>();
        hargaimgproduk = new ArrayList<Integer>();
        imgprodukFKprodukkategori = new ArrayList<String>();
        FKprodukkategoriIXFKprodukkategori = new ArrayList<Integer>();
        IXFKprodukkategori = new ArrayList<Integer>();
        PKproduk = new ArrayList<Integer>();    
    }
    
    
    public void insertidproduk(int isi){
        this.idproduk.add(isi);
    }
    public ArrayList<Integer> getRecordidproduk(){
        return this.idproduk;
    }
    
    public void insertbarcode(String isi){
        this.barcode.add(isi);
    }
    public ArrayList<String> getRecordbarcode(){
        return this.barcode;
    }
    
    public void insertstproduk(String isi){
        this.stproduk.add(isi);
    }
    public ArrayList<String> getRecordstproduk(){
        return this.stproduk;
    }
    
    public void insertnamaproduk(String isi){
        this.namaproduk.add(isi);
    }
    public ArrayList<String> getRecordnamaproduk(){
        return this.namaproduk;
    }
    
    public void insertidkategoriwarna(int isi){
        this.idkategoriwarna.add(isi);
    }
    public ArrayList<Integer> getRecordidkategoriwarna(){
        return this.idkategoriwarna;
    }
    
    public void insertwarna(String isi){
        this.warna.add(isi);
    }
    public ArrayList<String> getRecordwarna(){
        return this.warna;
    }
     public void insertstokharga(int isi){
        this.stokharga.add(isi);
    }
    public ArrayList<Integer> getRecordstokharga(){
        return this.stokharga;
    }
     public void inserthargaimgproduk(int isi){
        this.hargaimgproduk.add(isi);
    }
    public ArrayList <Integer> getRecordhargaimgproduk(){
        return this.hargaimgproduk;
    }
    
    public void insertimgprodukFKprodukkategori(String isi){
        this.imgprodukFKprodukkategori.add(isi);
    }
    public ArrayList<String> getRecordimgprodukFKprodukkategori(){
        return this.imgprodukFKprodukkategori;
    }
    
    public void insertFKprodukkategoriIXFKprodukkategori(int isi){
        this.FKprodukkategoriIXFKprodukkategori.add(isi);
    }
    public ArrayList<Integer> getRecordFKprodukkategoriIXFKprodukkategori(){
        return this.FKprodukkategoriIXFKprodukkategori;
    }
    
    public void insertIXFKprodukkategori(int isi){
        this.IXFKprodukkategori.add(isi);
    }
    public ArrayList<Integer> getRecordIXFKprodukkategori(){
        return this.IXFKprodukkategori;
    }
    
    public void insertPKproduk(int isi){
        this.PKproduk.add(isi);
    }
    public ArrayList<Integer> getRecordPKproduk(){
        return this.PKproduk;
    }
    
    public void insertroduk(int idproduk, String barcode, String stproduk, String namaproduk, 
            int idkategoriwarna, String  warna , int stokharga,int hargaimgproduk, String imgprodukFKprodukkategori, int FKprodukkategoriIXFKprodukkategori, int IXFKprodukkategori, 
            int PKproduk){
        this.idproduk.add(idproduk);
        this.barcode.add(barcode);
        this.stproduk.add(stproduk);
        this.namaproduk.add(namaproduk);
        this.idkategoriwarna.add(idkategoriwarna);
        this.warna .add(warna);
        this.stokharga.add(stokharga);
        this.hargaimgproduk.add(hargaimgproduk);
        this.imgprodukFKprodukkategori.add(imgprodukFKprodukkategori);
        this.FKprodukkategoriIXFKprodukkategori.add(FKprodukkategoriIXFKprodukkategori);
        this.IXFKprodukkategori.add(IXFKprodukkategori);
        this.PKproduk.add(PKproduk);
    }
    
}


