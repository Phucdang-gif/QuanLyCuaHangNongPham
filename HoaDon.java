package test;

class HoaDon{
    private String maHD;
    private String ngayLap;
    private KhachHang khachHang;
    private NhanVien nhanVienLap;
    private double tongTien;
    private ThanhToan hinhThuc;
    private danhSachCTHD dsCTHD;
    
    
    public HoaDon(String maHD,String ngayLap, KhachHang khachHang, NhanVien nhanVienLap){
        this.maHD = maHD;
        this.ngayLap = ngayLap;
        this.khachHang = khachHang;
        this.nhanVienLap = nhanVienLap;
        this.dsCTHD = new danhSachCTHD();
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
    
    
    public double tinhTongTien(){
        tongTien = 0;
        for (int i=0;i<dsCTHD.size();i++){
            ChiTietHoaDon cthd = dsCTHD.get(i);
            tongTien += cthd.getThanhTien();
        }
        return tongTien;
    }
    
    public void xuatHoaDon() {
       System.out.println("=== HÓA ĐƠN " + maHD + " ===");
       System.out.println("Ngày lập: " + ngayLap);
       System.out.println("Khách hàng: " + khachHang.getTenKH());
       System.out.println("Nhân viên lập: " + nhanVienLap.getTenNV());
       System.out.println("Danh sách sản phẩm:");
       dsCTHD.xuatDS();
       System.out.println("Tổng tiền: " + tinhTongTien());
    }
}

