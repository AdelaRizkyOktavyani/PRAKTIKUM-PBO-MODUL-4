package Model;

import Entity.Adela07128_NotaPerjamEntity;
import java.util.ArrayList;

public class Adela07128_NotaPerjamModel{
    private ArrayList <Adela07128_NotaPerjamEntity> notaperjamEntityArrayList;
    public Adela07128_NotaPerjamModel() {
        notaperjamEntityArrayList = new ArrayList <Adela07128_NotaPerjamEntity>();
    }
    
    public void insert(Adela07128_NotaPerjamEntity notaPerhari){
        notaperjamEntityArrayList.add(notaPerhari);
    }
    
    public Adela07128_NotaPerjamEntity showData(int index){
        return notaperjamEntityArrayList.get(index);
    }
    
    public void delete(int index){
        notaperjamEntityArrayList.remove(index);
    }
    
    public int loopingJam(){
        int ukuran = notaperjamEntityArrayList.size();
        return ukuran;
    }
}
