package test;

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
    
    public double getKhoiLuong(){
        return sanPham.getKhoiLuong();
    }
    public void xuat (){
        sanPham.xuat();
        System.out.print("So luong: " + soLuongMua);
        System.out.print("Thanh Tien: " + getThanhTien()); // chưa có đơn giá(Sản Phẩm)
    }
}
