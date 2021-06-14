package demidova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Box <T extends  Fruit>{
    private ArrayList<T> box = new ArrayList<>();

    public Box() {
    }

    public float getWeight(){
        float weight =0.0f;
        for(T o : box) {
            weight += o.getWeight();
        }
        return weight;
    }
    public boolean compare(Box<?> secondBox){
        return Math.abs(getWeight() - secondBox.getWeight()) < 0.001;

    }
    public void pour(Box <T>secondBox){
        secondBox.box.addAll(box);
        box.clear();
    }
    public void addFruits(T fruit, int lot){
        for(int i=0;i<lot;i++){
            box.add(fruit);
        }
    }
}
