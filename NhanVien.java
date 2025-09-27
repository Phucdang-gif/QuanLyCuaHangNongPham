import java.util.Scanner;

public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String hoNhanVien;
    private double luongNhanVien;
    private String gioiTinh;
    public NhanVien(){
        maNhanVien="";
        tenNhanVien="";
        hoNhanVien="";
        luongNhanVien=0;
    };
    public NhanVien(String mnv,String tnv,String hnv,String gt,double luongnv){
        maNhanVien=mnv;
        tenNhanVien=tnv;
        hoNhanVien=hnv;
        gioiTinh=gt;
        luongNhanVien=luongnv;

    }
    public NhanVien(NhanVien nv1){
        maNhanVien=nv1.maNhanVien;
        tenNhanVien=nv1.tenNhanVien;
        hoNhanVien=nv1.hoNhanVien;
        gioiTinh=nv1.gioiTinh;
        luongNhanVien=nv1.luongNhanVien;

    }
    public String getMNV(){return maNhanVien;}
    public String getTenNhanVien(){return tenNhanVien;}
    public String getHoNhanVien(){return hoNhanVien;}
    public double getLNV(){return luongNhanVien;}
    public String getGT(){return gioiTinh;}
    public void setLNV(double luongNhanVien){
        this.luongNhanVien=luongNhanVien;
    }
    public void setNV(String maNhanVien,String tenNhanVien,String hoNhanVien,String gioiTinh){
        this.maNhanVien=maNhanVien;
       this.tenNhanVien=tenNhanVien; 
        this.hoNhanVien=hoNhanVien;
        this.gioiTinh=gioiTinh;
    }
    public void setMNV(String mnv){
            this.maNhanVien=mnv;
    }
    public void setTNV(String tnv){
            this.tenNhanVien=tnv;
    }
    public void setHNV(String hnv){
            this.hoNhanVien=hnv;
    }
    public void setGT(String gt){
            this.gioiTinh=gt;
    }
    public void nhapNhanVien(){
        Scanner sc=new Scanner(System.in);
        maNhanVien=sc.nextLine();
        tenNhanVien=sc.nextLine();
        hoNhanVien=sc.nextLine();
        gioiTinh=sc.nextLine();
        luongNhanVien=sc.nextDouble();

    }
    public void xuatNhanVien(){
        System.out.println(" ma nhan vien la: "+maNhanVien);
        System.out.println("ten nhan vien: "+tenNhanVien);
        System.out.println("ho nhan vien: "+hoNhanVien);
        System.out.println("gioi tinh cua nhan vien la: "+gioiTinh);
        System.out.println("luong nhan vien: "+luongNhanVien);
    }

}
