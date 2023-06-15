/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010154;

/**
 *
 * @author Asus
 */
public class tblproduk {
    private int id_produk;
    private String barcode;
    private String st_produk;
    private String nama_produk;
    private int id_kategori;
    private String warna;
    private int stok;
    private int harga;
    private String img_produk;
    private int FK_produk_kategori;
    private int IXFK_produk_kategori;
    private int PK_produk;

    // Setter methods
    public void setIdProduk(int id_produk) {
        this.id_produk = id_produk;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setStProduk(String st_produk) {
        this.st_produk = st_produk;
    }

    public void setNamaProduk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public void setIdKategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setImgProduk(String img_produk) {
        this.img_produk = img_produk;
    }

    public void setFKProdukKategori(int FK_produk_kategori) {
        this.FK_produk_kategori = FK_produk_kategori;
    }

    public void setIXFKProdukKategori(int IXFK_produk_kategori) {
        this.IXFK_produk_kategori = IXFK_produk_kategori;
    }

    public void setPKProduk(int PK_produk) {
        this.PK_produk = PK_produk;
    }

    // Getter methods
    public int getIdProduk() {
        return id_produk;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getStProduk() {
        return st_produk;
    }

    public String getNamaProduk() {
        return nama_produk;
    }

    public int getIdKategori() {
        return id_kategori;
    }

    public String getWarna() {
        return warna;
    }

    public int getStok() {
        return stok;
    }

    public int getHarga() {
        return harga;
    }

    public String getImgProduk() {
        return img_produk;
    }

    public int getFKProdukKategori() {
        return FK_produk_kategori;
    }

    public int getIXFKProdukKategori() {
        return IXFK_produk_kategori;
    }

    public int getPKProduk() {
        return PK_produk;
    }
}

