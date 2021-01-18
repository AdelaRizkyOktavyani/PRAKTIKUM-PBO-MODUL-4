package Controller;

import Entity.Adela07128_KendaraanEntity;

public class Adela07128_KendaraanController {
    public void insert (String PlatNomor,String JenisKendaraan, String Kondisi){
        Adela07128_AllObjectModel.kendaraanModel.insert(new Adela07128_KendaraanEntity(PlatNomor, JenisKendaraan, Kondisi));
    
    }
    
    public Adela07128_KendaraanEntity showData(int index){
       return Adela07128_AllObjectModel.kendaraanModel.showData(index);
    }
    
    public void delete(int index){
        Adela07128_AllObjectModel.kendaraanModel.delete(index);
    }
    
    public int cekdataAkun(String platnomer){
        int cekdata = Adela07128_AllObjectModel.kendaraanModel.cekdata(platnomer);
        return cekdata;
    }
}
