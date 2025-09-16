/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author pc
 */
import java.io.*;
import java.util.Arrays;
class HoaDon{
    private String maHD;
    private String ngayLap;
    private KhachHang khachHang;
    private NhanVien nhanVienLap;
    private double tongTien;
    private ChiTietHoaDon[] danhsachCTHD;
    
    
    public HoaDon(String maHD,String ngayLap, KhachHang khachHang, NhanVien nhanVienLap){
        this.maHD = maHD;
        this.ngayLap = ngayLap;
        this.khachHang = khachHang;
        this.nhanVienLap = nhanVienLap;
        this.danhsachCTHD = new ChiTietHoaDon[0];
        this.tongTien = 0;
    }
    
    public String getMaHD(){
        return maHD;
    }
    public void setMaHD(String maHD){
        this.maHD = maHD;
    }
    public String getNgayLap(){
        return ngayLap;
    }
    public void setNgayLap(String ngayLap){
        this.ngayLap = ngayLap;
    }
    public KhachHang getKhachHang(){
        return khachHang;
    }
    public void setKhachHang(KhachHang khachHang){
        this.khachHang = khachHang;
    }
    public NhanVien getNhanVienLap(){
        return nhanVienLap;
    }
    public void setNhanVienLap(NhanVien nhanVienLap){
        this.nhanVienLap = nhanVienLap;
    }
    
    
    public void themSP (SanPham sp, int soLuongMua){
        ChiTietHoaDon cthd = new ChiTietHoaDon(sp,soLuongMua);
        danhsachCTHD = Arrays.copyOf(danhsachCTHD, danhsachCTHD.length+1);
        danhsachCTHD[danhsachCTHD.length - 1] = cthd;
    }
    public void xoaSP(String maSP){
        for (int i=0;i<danhsachCTHD.length;i++){
            if (danhsachCTHD.getSanPham().getmaSP().equals(maSP)){
                for (int j=i;j<danhsachCTHD.length-1;j++){
                    danhsachCTHD[j] = danhsachCTHD[j+1];
                }
                danhsachCTHD = Arrays.copyOf(danhsachCTHD, danhsachCTHD.length-1);
                break;
            }
        }
    }
    public double tinhTongTien(){
        tongTien = 0;
        for (int i=0;i<danhsachCTHD.length;i++){
            tongTien+=danhsachCTHD[i].getThanhTien();
        }
        return tongTien;
    }
    public void xuatHoaDon() {
       System.out.println("=== HÓA ĐƠN " + maHD + " ===");
       System.out.println("Ngày lập: " + ngayLap);
       System.out.println("Khách hàng: " + khachHang.getTenKH());
       System.out.println("Nhân viên lập: " + nhanVienLap.getTenNV());
       System.out.println("Danh sách sản phẩm:");
       for (int i = 0; i < danhSachCTHD.length; i++) {
           SanPham sp = danhSachCTHD[i].getSanPham();
           System.out.println(" - " + sp.getTenSP() 
                             + " | SL: " + danhSachCTHD[i].getSoLuongMua()                               
                             + " | Giá: " + sp.getGia()
                             + " | Thành tiền: " + danhSachCTHD[i].getThanhTien());
        }
        System.out.println("Tổng tiền: " + tinhTongTien());
    }
}
