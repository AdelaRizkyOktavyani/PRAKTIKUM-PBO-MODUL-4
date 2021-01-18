package Model;

import Entity.Adela07128_KendaraanEntity;
import java.util.ArrayList;

public class Adela07128_KendaraanModel{
    private ArrayList <Adela07128_KendaraanEntity> kendaraanEntityArrayList;
    
    public Adela07128_KendaraanModel() {
        kendaraanEntityArrayList = new ArrayList <Adela07128_KendaraanEntity>();
    }
    
    public void insert(Adela07128_KendaraanEntity kendaraan){
        kendaraanEntityArrayList.add(kendaraan);
    }    
    public Adela07128_KendaraanEntity showData(int index){
        return kendaraanEntityArrayList.get(index);
    }
    public void delete(int index){
        kendaraanEntityArrayList.remove(index);
    } 
    public int cekdata(String platnomer){   
        int loop = 0;
        for (Adela07128_KendaraanEntity kendaraanEntity : kendaraanEntityArrayList) {
            if (kendaraanEntity.getPlatNomor().equals(platnomer)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
}
