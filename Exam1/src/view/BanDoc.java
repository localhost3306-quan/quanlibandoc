
package view;


import java.io.Serializable;


public class BanDoc implements Serializable{
    private int ma;
    private String ten,diaChi,soDienThoai;

    public BanDoc(int ma, String ten, String diaChi, 
            String soDienThoai) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }    
    public Object[] toObject() {
        return new Object[]{ma,ten,diaChi,soDienThoai};
    }
    
}
