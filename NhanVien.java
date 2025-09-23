import java.util.Scanner;

public class NhanVien {
    private int maNhanVien;
    private string tenNhanVien;
    private string hoNhanVien;
    private int luongNhanVien;
    
    public NhanVien(int mnv,string tnv,string hnv,int luongnv){
        maNhanVien=mnv;
        tenNhanVien=tnv;
        hoNhanVien=hnv;
        luongNhanVien=luongnv;

    }
    public NhanVien(NhanVien nv1){
        maNhanVien=nv1.maNhanVien;
        tenNhanVien=nv1.tenNhanVien;
        hoNhanVien=nv1.hoNhanVien;
        luongNhanVien=nv1.luongNhanVien;
    }
     public int getMNV(){return maNhanVien;}
    public string getTenNhanVien(){return tenNhanVien;}
    public string getHoNhanVien(){return hoNhanVien;}
    public int getLNV(){return luongNhanVien;}
    public void setLNV(int luongNhanVien){
        this.luongNhanVien=luongNhanVien;
    }
    public void setNV(int maNhanVien,string tenNhanVien,string hoNhanVien){
        this.maNhanVien=maNhanVien;
       this.tenNhanVien=tenNhanVien; 
        this.hoNhanVien=hoNhanVien;
    }
    public nhapNhanVien(){
        Scanner sc=new Scanner(System.in);
        maNhanVien=sc.nextInt();
        tenNhanVien=sc.nextLine();
        hoNhanVien=sc.nextLine();
        luongNhanVien=sc.nextInt();

    }
    public xuatNhanVien(){
        System.out.println(maNhanVien);
        System.out.println(tenNhanVien);
        System.out.println(hoNhanVien);
        System.out.println(luongNhanVien);
    }

}

