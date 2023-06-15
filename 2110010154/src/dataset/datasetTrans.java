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
public class datasetTrans {
    private ArrayList<String> notrans;
    private ArrayList<String> idadmin;
    private ArrayList<Integer> idpelanggan;
    private ArrayList<String> tgltrans;
    private ArrayList<Integer> totalbyr;
    private ArrayList<String> IXFKtransadmin;
    private ArrayList<Integer> IXFKtranspelanggan;
    private ArrayList<String> PKtrans;
    
    
    public datasetTrans(){
        notrans = new ArrayList<String>();
        idadmin = new ArrayList<String>();
        idpelanggan= new ArrayList<Integer>();
        tgltrans = new ArrayList<String>();
        totalbyr = new ArrayList<Integer>();
        IXFKtransadmin = new ArrayList<String>();
        IXFKtranspelanggan = new ArrayList<Integer>();
        PKtrans = new ArrayList<String>();
    }
    
    public void insertnotrans(String isi){
        this.notrans.add(isi);
    }
    public ArrayList<String> getRecordnotrans(){
        return this.notrans;
    }
    
    public void insertidadmin(String isi){
        this.idadmin.add(isi);
    }
    public ArrayList<String> getRecordidadmin(){
        return this.idadmin;
    }
    
    public void insertidpelanggan(int isi){
        this.idpelanggan.add(isi);
    }
    public ArrayList<Integer> getRecordidpelanggan(){
        return this.idpelanggan;
    }
    
    public void inserttgltrans(String isi){
        this.tgltrans.add(isi);
    }
    public ArrayList<String> getRecordtgltrans(){
        return this.tgltrans;
    }
    
    public void inserttotalbyr(int isi){
        this.totalbyr.add(isi);
    }
    public ArrayList<Integer> getRecordtotalbyr(){
        return this.totalbyr;
    }
    
    public void insertIXFKtransadmin (String isi){
        this.IXFKtransadmin .add(isi);
    }
    public ArrayList<String> getRecordIXFKtransadmin (){
        return this.IXFKtransadmin ;
    }
     public void insertIXFKtranspelanggan(int isi){
        this.IXFKtranspelanggan.add(isi);
    }
    public ArrayList<Integer> getRecordIXFKtranspelanggan(){
        return this.IXFKtranspelanggan;
    }
     public void insertPKtrans(String isi){
        this.PKtrans.add(isi);
    }
    public ArrayList<String> getRecordPKtrans(){
        return this.PKtrans;
    }
    
    public void insertTrans(String notrans, String idadmin, int idpelanggan, String tgltrans, 
            int totalbyr, String  IXFKtransadmin, int  IXFKtranspelanggan,String PKtrans){
        this.notrans.add(notrans);
        this.idadmin.add(idadmin);
        this.idpelanggan.add(idpelanggan);
        this.tgltrans.add(tgltrans);
        this.totalbyr.add(totalbyr);
        this.IXFKtransadmin.add(IXFKtransadmin);
        this. IXFKtranspelanggan.add( IXFKtranspelanggan);
        this.PKtrans.add(PKtrans);
    }
    
    
    
    
}
