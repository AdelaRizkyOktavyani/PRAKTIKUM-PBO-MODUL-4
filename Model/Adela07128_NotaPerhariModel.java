package Model;

import Entity.Adela07128_NotaPerhariEntity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Adela07128_NotaPerhariModel{
    private ArrayList <Adela07128_NotaPerhariEntity> notaperhariEntityArrayList;

    public Adela07128_NotaPerhariModel() {
        notaperhariEntityArrayList = new ArrayList <Adela07128_NotaPerhariEntity>();
    }
    
    public void insert(Adela07128_NotaPerhariEntity notaPerhari){
        notaperhariEntityArrayList.add(notaPerhari);
    }
    
    public Adela07128_NotaPerhariEntity showData(int index){
        return notaperhariEntityArrayList.get(index);
    }
    
    public void delete(int index){
        notaperhariEntityArrayList.remove(index);
    }
    
    public int loopingHari(){
        int ukuran = notaperhariEntityArrayList.size();
        return ukuran;
    }
}
