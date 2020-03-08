package example.hp.mybudgeting;

import java.util.ArrayList;

public class Pemasukan {
    private String mNomor;
    private String mTanggal;
    private String mJumlah;
    private String mSumber;

    public Pemasukan(String nomor, String tanggal, String jumlah, String sumber) {
        mNomor = nomor;
        mTanggal = tanggal;
        mJumlah = jumlah;
        mSumber = sumber;
    }

    public String getmNomor() { return mNomor; }

    public String getmTanggal() {
        return mTanggal;
    }

    public String getmJumlah() {
        return mJumlah;
    }

    public String getmSumber() {
        return mSumber;
    }
}
