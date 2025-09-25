package test;

import java.io.Scanner;

public class KhachHang {
    private String maKH;
    private String hoKH;
    private String tenKH;
    private String soDienThoai;
    private String diaChi;
    private String email;

    public KhachHang(String maKH, String hoKH, String tenKH, String soDienThoai, String diaChi, String email) {
        this.maKH = maKH;
        this.hoKH = hoKH;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.email = email;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getHoKH() {
        return hoKH;
    }

    public void setHoKH(String hoKH) {
        this.hoKH = hoKH;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        maKH = sc.nextLine();
        System.out.print("Nhập họ khách hàng: ");
        hoKH = sc.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        tenKH = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        soDienThoai = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập email: ");
        email = sc.nextLine();
    }

    public void xuat() {
        System.out.println("===== Thông tin khách hàng =====");
        System.out.println("Mã KH: " + maKH);
        System.out.println("Họ tên: " + hoKH + " " + tenKH);
        System.out.println("SĐT: " + soDienThoai);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Email: " + email);
    }
}
