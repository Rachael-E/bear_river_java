import java.util.ArrayList;

public class River {

    private ArrayList<Salmon> fishes;

    public River(){
        this.fishes = new ArrayList<Salmon>();
    }

    public void addFish(Salmon newFish ){
        this.fishes.add(newFish);
    }

    public Salmon removeFish(){
        return this.fishes.remove(0);
    }

    public int fishCount(){
        return this.fishes.size();
    }
}
