import java.util.Arrays;
import java.util.Scanner;

public class DSNhanVien {
    private NhanVien []dsNhanVien;
    private int MAX=100;
    private int soLuong;
    public DSNhanVien (){
        dsNhanVien= new NhanVien[MAX];
        soLuong=0;
    }
    public void nhapds(){
        System.out.println("nhap so luong nhan vien");
        Scanner sc= new Scanner(System.in);
        soLuong=sc.nextInt();
        dsNhanVien= new NhanVien[soLuong];
        for(int i=0;i<soLuong;i++){
            dsNhanVien[i]=new NhanVien();
            dsNhanVien[i].nhapNhanVien();
        }
    }
    public void xuatds(){
        for(int i=0;i<soLuong;i++){
            System.out.println("ten nhan vien la: "+dsNhanVien[i].getTenNhanVien());
            System.out.println("ho nhan vien la: "+dsNhanVien[i].getHoNhanVien());
            System.out.println("ma nhan vien la: "+dsNhanVien[i].getMNV());
            System.out.println("luong nhan vien la: "+dsNhanVien[i].getLNV());
        }
    }
    //them
    public void themNV(){
        NhanVien[]dsNhanVien2= new NhanVien[soLuong+1];
        if(soLuong>=MAX){
            System.out.println("khong the them nhan vien");
        }else{
            
            dsNhanVien2= Arrays.copyOf(dsNhanVien,soLuong );
            dsNhanVien2[soLuong+1].nhapNhanVien();
            dsNhanVien=Arrays.copyOf(dsNhanVien2, soLuong+1);
            soLuong++;
        }
    }
    //timkiem theo ma
    public String timNV(String maNV){
        for(int i=0;i<soLuong;i++){
            if(dsNhanVien[i].getMNV().equals(maNV)){
                return dsNhanVien[i].getMNV();
            }
        }
        return "khong tim thay ma nhan vien"; 
    }
    //sapxep theo mnv
    public void sapXepMNV(){
        for(int i=0;i<soLuong;i++){
            for(int j=0;j<soLuong;j++){
                if(dsNhanVien[i].getMNV().compareTo(dsNhanVien[j].getMNV())>=0){
                    NhanVien tmp= new NhanVien();
                    tmp=dsNhanVien[i];
                    dsNhanVien[i]=dsNhanVien[j];
                    dsNhanVien[j]=tmp;
                }
            }
            
        }
    }
    // sap xep theo ten nhan vien
    public void sapXepTNV(NhanVien[] dsNV, int soLuong){
        for(int i=0;i<soLuong;i++){
            for(int j=0;j<soLuong;j++){
                if(dsNV[i].getTenNhanVien().compareTo(dsNV[j].getTenNhanVien())>=0){
                    NhanVien tmp= new NhanVien();
                    tmp=dsNV[i];
                    dsNV[i]=dsNV[j];
                    dsNV[j]=tmp;
                }
            }
            
        }
    }
    //xoa theo ma nhan vien
    public void xoaNV(String maNV){
        int s=0;
        for(int i=0;i<soLuong;i++){
              if(dsNhanVien[i].getMNV().equals(timNV(maNV))){
                    s=i;
              } 
            }
        if(s!=0){
            for(;s<soLuong;s++){
                dsNhanVien[s]=dsNhanVien[s++];
            }
            soLuong--;
        }
        else{
            System.out.println("khong tim thay ma nhan vien de xoa");
        }
    }

    //thongke(cho biết số lượng nhân viên , số lượng nam/nữ)
    public void thongKeNV(){
        int nam=0,nu=0;
        System.out.println("tong so nhan vien la: "+soLuong);
        for(int i=0;i<soLuong;i++){
            if(dsNhanVien[i].getGT().equals("nam")){
                nam++;
            }else{
                nu++;
            }
        }
        System.out.println("tong so nhan vien nam la: "+nam);
        System.out.println("tong so nhan vien nu la: "+nu);
    }
    //sửa thông tin theo mã nv
    public void suaTTNV(String mnv){
        String a;
        double b;
        for(int i=0;i<soLuong;i++){
            if(dsNhanVien[i].getMNV().equals(mnv)){
                Scanner sc= new Scanner(System.in);
                System.out.println("nhap ma nhan vien moi");
                a=sc.nextLine();
                dsNhanVien[i].setMNV(a);
                System.out.println("nhap ten nhan vien moi");
                a=sc.nextLine();
                dsNhanVien[i].setTNV(a);
                System.out.println("nhap ho nhan vien moi");
                a=sc.nextLine();
                dsNhanVien[i].setHNV(a);
                System.out.println("nhap gioi tinh nhan vien moi");
                a=sc.nextLine();
                dsNhanVien[i].setGT(a);
                System.out.println("nhap luong nhan vien moi");
                b=sc.nextDouble();
                dsNhanVien[i].setLNV(b);
            }
        }
    }

}
