package example.hp.mybudgeting;

public class Pemasukan {
    private String nomor;
    private String tanggal;
    private String jumlah;
    private String sumber;

    public Pemasukan(String nomor, String tanggal, String jumlah, String sumber) {
        this.nomor = nomor;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.sumber = sumber;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getSumber() {
        return sumber;
    }

    public void setSumber(String sumber) {
        this.sumber = sumber;
    }
}
