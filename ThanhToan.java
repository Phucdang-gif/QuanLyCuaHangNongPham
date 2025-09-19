/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author pc
 */
import java.util.ArrayList;

class ThanhToan {
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private ArrayList<ChiTietHoaDon> gioHang;
    private String phuongThucThanhToan;
    private boolean xacNhan;

    public ThanhToan(KhachHang khachHang, NhanVien nhanVien) {
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.gioHang = new ArrayList<>();
        this.phuongThucThanhToan = "";
        this.xacNhan = false;
    }

    
    public void themSanPham(SanPham sp, int soLuong) {
        ChiTietHoaDon cthd = new ChiTietHoaDon(sp, soLuong);
        gioHang.add(cthd);
    }

    // chọn phương thức thanh toán
    public void chonPhuongThucThanhToan(String pttt) {
        this.phuongThucThanhToan = pttt;
        System.out.println("Khách hàng chọn thanh toán bằng: " + pttt);
    }

    // tạo hóa đơn (sau khi chọn phương thức)
    public HoaDon taoHoaDon(String maHD, String ngayLap) {
        HoaDon hd = new HoaDon(maHD, ngayLap, khachHang, nhanVien);
        for (ChiTietHoaDon cthd : gioHang) {
            hd.themSP(cthd.getSanPham(), cthd.getSoLuongMua());
        }
        return hd;
    }

    // xác nhận thanh toán
    public boolean xacNhanThanhToan(boolean dongY) {
        this.xacNhan = dongY;
        if (dongY) {
            System.out.println("Khách hàng đồng ý thanh toán.");
        } else {
            System.out.println("Khách hàng hủy thanh toán.");
        }
        return dongY;
    }
}
