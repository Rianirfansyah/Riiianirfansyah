/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2110010154;

/**
 *
 * @author Asus
 */
 public class tbljurnal {
    private int idjurnal;
    private String notrans;
    private String no_ref;
    private String nama;
    private float debitAmount;
    private float kreditAmount;
    private String tgl_jurnal;
    private String Fk_jurnal_trans;
    private String IXFK_jurnal_trans;
    private int PK_jurnal;

    // Setter methods
    public void setIdJurnal(int id_jurnal) {
        this.idjurnal = id_jurnal;
    }

    public void setNoTrans(String notrans) {
        this.notrans = notrans;
    }

    public void setNoRef(String no_ref) {
        this.no_ref = no_ref;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDebitAmount(float debitAmount) {
        this.debitAmount = debitAmount;
    }

    public void setKreditAmount(float kreditAmount) {
        this.kreditAmount = kreditAmount;
    }

    public void setTglJurnal(String tgl_jurnal) {
        this.tgl_jurnal = tgl_jurnal;
    }

    public void setFkJurnalTrans(String Fk_jurnal_trans) {
        this.Fk_jurnal_trans = Fk_jurnal_trans;
    }

    public void setIXFkJurnalTrans(String IXFK_jurnal_trans) {
        this.IXFK_jurnal_trans = IXFK_jurnal_trans;
    }

    public void setPKJurnal(int PK_jurnal) {
        this.PK_jurnal = PK_jurnal;
    }

    // Getter methods
    public int getIdJurnal() {
        return idjurnal;
    }

    public String getNoTrans() {
        return notrans;
    }

    public String getNoRef() {
        return no_ref;
    }

    public String getNama() {
        return nama;
    }

    public float getDebitAmount() {
        return debitAmount;
    }

    public float getKreditAmount() {
        return kreditAmount;
    }

    public String getTglJurnal() {
        return tgl_jurnal;
    }

    public String getFkJurnalTrans() {
        return Fk_jurnal_trans;
    }

    public String getIXFkJurnalTrans() {
        return IXFK_jurnal_trans;
    }

    public int getPKJurnal() {
        return PK_jurnal;
    }
}
