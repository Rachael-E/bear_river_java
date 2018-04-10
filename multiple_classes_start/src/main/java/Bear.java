import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Salmon> stomach;

    public Bear(String newName){
        this.name = newName;
        this.stomach = new ArrayList<Salmon>();
    }


        public int foodCount(){
            return this.stomach.size();
        }

        public void eatFishFromRiver(River newRiver){

            //remove a fish from the river  //store that fish you removed
            Salmon salmonICaptured = newRiver.removeFish();
            //eat that fish you removed
            eat(salmonICaptured);

//            eat( newRiver.captureFishFromRiver() );

        }

        public void eat(Salmon fishToEat){
            this.stomach.add(fishToEat);
        }


        public void sleep(){
            this.stomach.clear();
        }

}