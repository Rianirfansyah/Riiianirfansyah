/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010154;

/**
 *
 * @author Asus
 */
 public class tbltrans {
    private String notrans;
    private String id_admin;
    private int id_pelanggan;
    private String tgl_trans;
    private int total_byr;
    private String IXFK_trans_admin;
    private int IXFK_trans_pelanggan;
    private String PK_trans;

    // Setter methods
    public void setNoTrans(String notrans) {
        this.notrans = notrans;
    }

    public void setIdAdmin(String id_admin) {
        this.id_admin = id_admin;
    }

    public void setIdPelanggan(int id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public void setTglTrans(String tgl_trans) {
        this.tgl_trans = tgl_trans;
    }

    public void setTotalByr(int total_byr) {
        this.total_byr = total_byr;
    }

    public void setIXFKTransAdmin(String IXFK_trans_admin) {
        this.IXFK_trans_admin = IXFK_trans_admin;
    }

    public void setIXFKTransPelanggan(int IXFK_trans_pelanggan) {
        this.IXFK_trans_pelanggan = IXFK_trans_pelanggan;
    }

    public void setPKTrans(String PK_trans) {
        this.PK_trans = PK_trans;
    }

    // Getter methods
    public String getNoTrans() {
        return notrans;
    }

    public String getIdAdmin() {
        return id_admin;
    }

    public int getIdPelanggan() {
        return id_pelanggan;
    }

    public String getTglTrans() {
        return tgl_trans;
    }

    public int getTotalByr() {
        return total_byr;
    }

    public String getIXFKTransAdmin() {
        return IXFK_trans_admin;
    }

    public int getIXFKTransPelanggan() {
        return IXFK_trans_pelanggan;
    }

    public String getPKTrans() {
        return PK_trans;
    }
}