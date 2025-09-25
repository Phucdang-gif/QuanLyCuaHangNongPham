
package test;

class DanhSachCTHD {
    private ChiTietHoaDon[] ds;
    private int n;          
    private static final int MAX = 100;  

    public DanhSachCTHD() {
        ds = new ChiTietHoaDon[MAX];
        n = 0;
    }

    public void themCTHD(ChiTietHoaDon cthd) {
        if (n < MAX) {
            ds[n++] = cthd;
        } else {
            System.out.println("Danh sach chi tiet day!");
        }
    }
    public void themSP(SanPham sp, int soLuongMua) {
        ChiTietHoaDon cthd = new ChiTietHoaDon(sp, soLuongMua);
        themCTHD(cthd);
    }

    public void xoaSP(String maSP) {
        for (int i = 0; i < n; i++) {
            if (ds[i].getSanPham().getMaSP().equals(maSP)) {
                for (int j = i; j < n - 1; j++) {
                    ds[j] = ds[j + 1];
                }
                n--;
                break;
            }
        }
    }

    public double tinhTongTien() {
        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += ds[i].getThanhTien();
        }
        return tong;
    }

    public void xuatDS() {
        for (int i = 0; i < n; i++) {
            SanPham sp = ds[i].getSanPham();
            System.out.println(" - " + sp.getTenSP()
                    + " | SL: " + ds[i].getSoLuongMua()
                    + " | Giá: " + sp.getGia()
                    + " | Thành tiền: " + ds[i].getThanhTien());
        }
    }
    
    public int getSoLoaiSp() {
        return n;
    }
}