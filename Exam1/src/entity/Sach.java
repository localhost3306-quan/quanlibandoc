
package entity;

import java.io.Serializable;

public class Sach implements Serializable{
    //properties
    private String ten,tacGia,chuyenNghanh;
    private int ma,nam,soLuong;

    public Sach(int ma,String ten, 
            String tacGia, 
            String chuyenNghanh, 
            int nam, int soLuong) {
        this.ten = ten;
        this.tacGia = tacGia;
        this.chuyenNghanh = chuyenNghanh;
        this.ma = ma;
        this.nam = nam;
        this.soLuong = soLuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public Object[] toObject() {
        return new Object[]{
            ma,ten,tacGia,
            chuyenNghanh,nam,soLuong
        };
        
    }
    
}
