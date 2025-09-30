
package test;
import java.util.Arrays;
class DanhSachCTHD {
    private ChiTietHoaDon[] ds;
    private int n;          
    private static final int MAX = 100;  

    public DanhSachCTHD() {
        ds = new ChiTietHoaDon[0];
        n = 0;
    }

    public void themCTHD(ChiTietHoaDon cthd) {
        ds = Arrays.copyOf(ds,n+1);
        ds[n] = cthd;
        n++;
    }
    public void themSP(SanPham sp, int soLuongMua) {
        ChiTietHoaDon cthd = new ChiTietHoaDon(sp, soLuongMua);
        themCTHD(cthd);
    }

    public void xoaSP(String maSP) {
        for (int i = 0; i < n; i++) {
            if (ds[i].getSanPham().getMaSP().equals(maSP)) {
                System.arraycopy(ds,i+1,ds,i,n-i-1);
                n--;
                ds = Arrays.copyOf(ds,n);
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
