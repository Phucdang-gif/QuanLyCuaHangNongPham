package test;

import java.util.Arrays;
class DanhSachHoaDon {
    private HoaDon[] ds;
    private int n;
    private static final int MAX = 100; 

    public DanhSachHoaDon() {
        ds = new HoaDon[0];
        n = 0;
    }

    public void themHoaDon(HoaDon hd) {
        ds = Arrays.copyOf(ds,n+1);
        ds[n] = hd;
        n++;
    }

    public void xoaHoaDon(String maHD) {
        for (int i = 0; i < n; i++) {
            if (ds[i].getMaHD().equals(maHD)) {
                System.arraycopy(ds,i+1,ds,i,n-i-1);
                n--;
                ds = Arrays.copyOf(ds,n);
                break;
            }
        }
        System.out.println("Khong tim thay hoa don " + maHD);
    }

    public HoaDon timHoaDon(String maHD) {
        for (int i = 0; i < n; i++) {
            if (ds[i].getMaHD().equals(maHD)) {
                return ds[i];
            }
        }
        return null;
    }

    public void xuatDS() {
        for (int i = 0; i < n; i++) {
            ds[i].xuatHoaDon();
            System.out.println("--------------------------");
        }
    }

    public int getSize() {
        return n;
    }
    
}
