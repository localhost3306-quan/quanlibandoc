
package entity;


import java.io.Serializable;

public class BangQuanLy implements Serializable{
    private int maBD;
    private int maS;    
    private int soLuong;
    private String ttrang;

    public BangQuanLy(int maBD, int maS, 
            int soLuong,String ttrang) {        
        this.maBD = maBD;
        this.maS = maS;
        this.soLuong = soLuong;
        this.ttrang=ttrang;
    }

    public int getMaBD() {
        return maBD;
    }

    public void setMaBD(int maBD) {
        this.maBD = maBD;
    }

    public int getMaS() {
        return maS;
    }

    public void setMaS(int maS) {
        this.maS = maS;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTtrang() {
        return ttrang;
    }

    public void setTtrang(String ttrang) {
        this.ttrang = ttrang;
    }
    
}
