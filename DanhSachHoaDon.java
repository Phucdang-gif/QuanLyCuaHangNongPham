package test;


class DanhSachHoaDon {
    private HoaDon[] ds;
    private int soLuong;
    private static final int MAX = 100; 

    public DanhSachHoaDon() {
        ds = new HoaDon[MAX];
        soLuong = 0;
    }

    public void themHoaDon(HoaDon hd) {
        if (soLuong < MAX) {
            ds[soLuong++] = hd;
        } else {
            System.out.println("Danh sach hoa don da day!");
        }
    }

    public void xoaHoaDon(String maHD) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaHD().equals(maHD)) {
                for (int j = i; j < soLuong - 1; j++) {
                    ds[j] = ds[j + 1];
                }
                ds[--soLuong] = null;
                System.out.println("Da xoa hoa don " + maHD);
                return;
            }
        }
        System.out.println("Khong tim thay hoa don " + maHD);
    }

    public HoaDon timHoaDon(String maHD) {
        for (int i = 0; i < soLuong; i++) {
            if (ds[i].getMaHD().equals(maHD)) {
                return ds[i];
            }
        }
        return null;
    }

    public void xuatDS() {
        for (int i = 0; i < soLuong; i++) {
            ds[i].xuatHoaDon();
            System.out.println("--------------------------");
        }
    }

    public int getSize() {
        return soLuong;
    }
    
}
