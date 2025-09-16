/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author pc
 */
import java.io.*;
class ChiTietHoaDon {
    private SanPham sanPham;
    private int soLuongMua;
    
    public ChiTietHoaDon(SanPham sanPham, int soLuongMua){
        this.sanPham = sanPham;
        this.soLuongMua = soLuongMua;
    }
    
    public SanPham getSanPham(){
        return sanPham;
    }
    public void setSanPham(SanPham sanPham){
        this.sanPham = sanPham;
    }
    public int getSoLuongMua(){
        return soLuongMua;
    }
    public void setSoLuongMua(int soLuongMua){
        this.soLuongMua=soLuongMua;
    }
    public double getThanhTien(){
        return sanPham.getGia() * soLuongMua;
    }
}
