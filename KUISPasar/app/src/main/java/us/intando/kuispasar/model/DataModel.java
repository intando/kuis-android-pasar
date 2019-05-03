package us.intando.kuispasar.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")

public class DataModel {
    @SerializedName("alamat")
    private String mAlamat;
    @SerializedName("id")
    private String mId;
    @SerializedName("kode")
    private String mKode;
    @SerializedName("nama")
    private String mNama;

    public String getAlamat() {
        return mAlamat;
    }

    public void setAlamat(String alamat) {
        mAlamat = alamat;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getKode() {
        return mKode;
    }

    public void setKode(String kode) {
        mKode = kode;
    }

    public String getNama() {
        return mNama;
    }

    public void setNama(String nama) {
        mNama = nama;
    }
}
