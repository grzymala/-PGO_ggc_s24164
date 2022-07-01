package Final;
import java.util.ArrayList;

public class Orphanage {
    private ArrayList<Child> dzieci = new ArrayList<>();
    String nazwa;
    String location;


    public void addChild(Child dziecko){
        dzieci.add(dziecko);
    }

    public Orphanage(String nazwa, String location) {
        this.nazwa = nazwa;
        this.location = location;
        this.dzieci = dzieci;
    }
}
