package test;

class HoaDon{
    private static int count = 0;
    private String maHD;
    private String ngayLap;
    private KhachHang khachHang;
    private NhanVien nhanVienLap;
    private double tongTien;
    private ThanhToan hinhThuc;
    private DanhSachCTHD dsCTHD;
    
    
    public HoaDon(String maHD,String ngayLap, KhachHang khachHang, NhanVien nhanVienLap, ThanhToan hinhThuc){
        this.maHD = "HD"+(++count);
        this.ngayLap = ngayLap;
        this.khachHang = khachHang;
        this.nhanVienLap = nhanVienLap;
        this.hinhThuc = hinhThuc;
        this.dsCTHD = new DanhSachCTHD();
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
    
    public void themSP(SanPham sp, int soLuongMua) {
        dsCTHD.themSP(sp, soLuongMua);
    }

    public void xoaSP(String maSP) {
        dsCTHD.xoaSP(maSP);
    }
    
    public double tinhTongTien(){
        tongTien = dsCTHD.tinhTongTien();
        return tongTien;
    }
    
    public static int getSoHoaDontao(){
        return count;
    }
    
    public void thanhToanHoaDon(){
        hinhThuc.thanhToan(tongTien);
    }
    public void xuatHoaDon() {
       System.out.println("=== HOA DON " + maHD + " ===");
       System.out.println("Ngay lap: " + ngayLap);
       System.out.println("Khach hang: " + khachHang.getTenKH());
       System.out.println("Nhan vien lap: " + nhanVienLap.getTenNV());
       System.out.println("Hinh thuc thanh toan: "+ hinhThuc);
       System.out.println("Danh sach san pham:");
       dsCTHD.xuatDS();
       System.out.println("Tong tien: " + tinhTongTien());
    }
}
