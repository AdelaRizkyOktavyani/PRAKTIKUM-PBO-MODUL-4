package Controller;
import Entity.Adela07128_NotaPerjamEntity;
import Entity.Adela07128_NotaPerhariEntity;
import java.util.Date;

public class Adela07128_NotaController {
    int menu;
    public void insertNotaJam(int Harga, int NoNota, String kondisi,Date TanggalMasuk, String JamMasuk, String MenitMasuk, int JamKeluar, int MenitKeluar){
        Adela07128_AllObjectModel.notaperjamModel.insert(new Adela07128_NotaPerjamEntity(Harga, NoNota,kondisi, TanggalMasuk, JamMasuk, MenitMasuk, JamKeluar, MenitKeluar));
    }
    
    public Adela07128_NotaPerjamEntity showDataNotajam(int index){
        return Adela07128_AllObjectModel.notaperjamModel.showData(index);
    }
    
    public void deleteNotaJam(int index){
        Adela07128_AllObjectModel.notaperjamModel.delete(index);
    }
    public int loopingJam(){
        return Adela07128_AllObjectModel.notaperjamModel.loopingJam();
    }
    public int loopingHari(){
        return Adela07128_AllObjectModel.notaperhariModel.loopingHari();
    }
    public void insertNotaHari(String TanggalMasuk,String BulanMasuk,String TahunMasuk, int TanggalKeluar,int BulanKeluar,int TahunKeluar, String Kondisi, int Harga,int NoNota){
        Adela07128_AllObjectModel.notaperhariModel.insert(new Adela07128_NotaPerhariEntity(TanggalMasuk, BulanMasuk, TahunMasuk, TanggalKeluar, BulanKeluar, TahunKeluar, Kondisi, Harga, NoNota));
    }
    
    public Adela07128_NotaPerhariEntity showDataNotaHari(int index){
        return Adela07128_AllObjectModel.notaperhariModel.showData(index);
    }
    
    public void deleteNotaHari(int index){
        Adela07128_AllObjectModel.notaperhariModel.delete(index);
    }
    public int getMenu(){
        return menu;
    }
    public void setMenu(int menu) {
        this.menu = menu;
    }
}