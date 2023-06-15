/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010154;
import dataset.*;
import forms.*;
/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
       datasetAdmin admin= new datasetAdmin();
        datasetJurnal jurnal= new datasetJurnal();
        datasetKategori kategori= new datasetKategori();
        datasetpelanggan pelanggan = new datasetpelanggan();
        datasetProduk produk = new datasetProduk();
        datasetTrans trans = new datasetTrans();
        datasetTransdetail transdetail = new datasetTransdetail();
        
       
        //Set
        admin.setkdBrg(1001);
        barang.setnmaBrg("Bodrex");
        barang.setSatuan(5);
        barang.sethrgBeli(50000);
        barang.sethrgJual(30000);
        
        pelanggan.setkdPelanggan(0001);
        pelanggan.setnmaPelanggan("Muhammad Rafli Aditya");
        pelanggan.settelpPelanggan("08123456789");
        pelanggan.setfaxPelanggan(5000);
        pelanggan.setemailPelanggan("muhrafliaditya062@gmail.com");
        pelanggan.setalamatPelanggan("Jln. Sungai Lulut");
        pelanggan.setTgl("18 Mei 2023");
        
                
        //Get
        System.out.println("Kode Obat: " + barang.getkdBrg());
        System.out.println("Nama Obat : " + barang.getnmaBrg());
        System.out.println("Satuan : " + barang.getSatuan());
        System.out.println("Harga Beli : " + barang.gethrgBeli());
        System.out.println("Harga Jual : " + barang.gethrgJual());
        
        System.out.println("------------------------------------------");
        System.out.println("Kode Pelanggan :" + pelanggan.getkdPelanggan());
        System.out.println("Nama : " + pelanggan.getnmaPelanggan());
        System.out.println("Telepon : " + pelanggan.gettelpPelanggan());
        System.out.println("Fax : " + pelanggan.gettelpPelanggan());
        System.out.println("Email : " + pelanggan.getemailPelanggan());
        System.out.println("Alamat : " + pelanggan.getalamatPelanggan());
        System.out.println("Tgl : " + pelanggan.getTgl());
        
         */
        //Memasukkan Array List kedalam Object
        datasetAdmin admin= new datasetAdmin();
        datasetJurnal jurnal= new datasetJurnal();
        datasetKategori kategori= new datasetKategori();
        datasetpelanggan pelanggan = new datasetpelanggan();
        datasetProduk produk = new datasetProduk();
        datasetTrans trans = new datasetTrans();
        datasetTransdetail transdetail = new datasetTransdetail();
        
        //Menginput data ArrayList pada masing-masing tabel
        admin.insertidadmin("001");
        admin.insertemailadmin("rianirfans@gmail.com");
        admin.insertpswdadmin("kino9999");
        admin.insertnamaadmin("Rian");
        admin.inserthpadmin("Redmi");
        admin.insertimgadmin("foto");
        admin.insertPKadmin("1");
        
        jurnal.insertidjurnal(101);
        jurnal.insertnotrans("TRS20230426035");
        jurnal.insertnoref("3000");
        jurnal.insertnama("amat");
        jurnal.inserttgljurnal("06/7/2021");
        jurnal.insertFKjurnaltrans("000");
        jurnal.insertIXFKjurnaltrans("090");
        jurnal.insertPKjurnal(1);
        
        kategori.insertidkategori(201);
        kategori.insertnamakategori("hp");
        kategori.insertPKkategori(50);
        
        
        pelanggan.insertidpelanggan(101);
        pelanggan.insertnamapelanggan("moreno");
        pelanggan.insertemailpelanggan("08080808");
        pelanggan.inserthppelanggan("nokia");
        pelanggan.insertPKpelanggan(12);
        
        
        produk.insertidproduk(401);
        produk.insertbarcode("89897878668");
        produk.insertstproduk("gfffg");
        produk.insertidkategoriwarna(0);
        produk.insertwarna("hitam");
        produk.insertstokharga(5);
        produk.inserthargaimgproduk(200000);
        produk.insertimgprodukFKprodukkategori("10");
        produk.insertFKprodukkategoriIXFKprodukkategori(10);
        produk.insertIXFKprodukkategori(5);
        produk.insertPKproduk(402);
        
        trans.insertnotrans("admin");
        trans.insertidadmin("admin");
        trans.insertidpelanggan(1);
        trans.inserttgltrans("aas");
        trans.inserttotalbyr(182);
        trans.insertIXFKtransadmin("admin");
        trans.insertIXFKtranspelanggan(1);
        trans.insertPKtrans("hdgqwyd");
        
        
        transdetail.insertnotrans(401666789);
        transdetail.insertidproduk(2110070);
        transdetail.insertharga(30000);
        transdetail.insertjmlbeli(1);
        transdetail.insertsubtotal("11");
        transdetail.insertIXFKtransdetailproduk(1232);
        transdetail.insertPKtransdetail("402");
        
        
        //Menampilkan data ArrayList
        System.out.println("===============DATA ADMIN==============");
        System.out.println(admin.getRecordidadmin());
        System.out.println(admin.getRecordemailadmin());
        System.out.println(admin.getRecordpswdadmin());
        System.out.println(admin.getRecordnamaadmin());
        System.out.println(admin.getRecordhpadmin());
        System.out.println(admin.getRecordimgadmin());
        System.out.println(admin.getRecordPKadmin());
        
        
        System.out.println("\t");
        System.out.println("===============DATA JURNAL==============");
        System.out.println(jurnal.getRecordidjurnal());
        System.out.println(jurnal.getRecordnotrans());
        System.out.println(jurnal.getRecordnoref());
        System.out.println(jurnal.getRecordnama());
        System.out.println(jurnal.getRecordtgljurnal());
        System.out.println(jurnal.getRecordFKjurnaltrans());
        System.out.println(jurnal.getRecordPKjurnal());
        
        
        System.out.println("\t");
        System.out.println("===============DATA KATEGORI==============");
        System.out.println(kategori.getRecordidkategori());
        System.out.println(kategori.getRecordnamakategori());
        System.out.println(kategori.getRecordPKkategori());
        
        
        System.out.println("\t");
        System.out.println("===============DATA PPELANGGAN==============");
        System.out.println(pelanggan.getRecordidpelanggan());
        System.out.println(pelanggan.getRecordnamapelanggan());
        System.out.println(pelanggan.getRecordemailpelanggan());
        System.out.println(pelanggan.getRecordhppelanggan());
        System.out.println(pelanggan.getRecordPKpelanggan());
        
        
        System.out.println("\t");
        System.out.println("===============DATA PRODUK==============");
        System.out.println(produk.getRecordidproduk());
        System.out.println(produk.getRecordidkategoriwarna());
        System.out.println(produk.getRecordwarna());
        System.out.println(produk.getRecordstokharga());
        System.out.println(produk.getRecordhargaimgproduk());
        System.out.println(produk.getRecordimgprodukFKprodukkategori());
        System.out.println(produk.getRecordFKprodukkategoriIXFKprodukkategori());
        System.out.println(produk.getRecordIXFKprodukkategori());
        System.out.println(produk.getRecordPKproduk());
        
        
        System.out.println("\t");
        System.out.println("===============DATA TRANSDETAIL==============");
        System.out.println(transdetail.getRecordnotrans());
        System.out.println(transdetail.getRecordidproduk());
        System.out.println(transdetail.getRecordharga());
        System.out.println(transdetail.getRecordjmlbeli ());
        System.out.println(transdetail.getRecordsubtotal());
        System.out.println(transdetail.getRecordIXFKtransdetailproduk());
        System.out.println(transdetail.getRecordPKtransdetail());
        
        
        System.out.println("\t");
        System.out.println("===============DATA TRANS==============");
        System.out.println(trans.getRecordnotrans());
        System.out.println(trans.getRecordidadmin());
        System.out.println(trans.getRecordidpelanggan());
        System.out.println(trans.getRecordtgltrans ());
        System.out.println(trans.getRecordtotalbyr());
        System.out.println(trans.getRecordIXFKtransadmin());
        System.out.println(trans.getRecordIXFKtranspelanggan());
        System.out.println(trans.getRecordPKtrans());
        
        
        //TUGAS 3
        new frameUtama().setVisible(true);
        
    }
    
}
