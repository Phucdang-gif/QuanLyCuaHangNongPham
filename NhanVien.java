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
