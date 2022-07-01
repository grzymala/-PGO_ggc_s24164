package Final;
import java.util.ArrayList;

public class Voldemort extends Character{
ArrayList<String> lista = new ArrayList<>();
static int counter = 1;
ArrayList<Character> targetedChars = new ArrayList<>();

    public Voldemort(Riddle riddle) {
        super(riddle.nazwa,riddle.location);
    }

    public ArrayList<String> createHorcruxes(int ilosc){
        int i = 0;
        do{
            lista.add("horcrux " + counter);
            i ++;
            counter++;
        }while(i < ilosc);
        return lista;
    }

    public void printHorcruxes(){
        for(String x : lista){
            System.out.println(x);
        }
    }

    public void target(Character character){
        targetedChars.add(character);
    }

    public void castSpell(Object avadaKedavra){
        for(Character x : targetedChars){
            if(x.isChosen){
                this.setVitality(0);
                System.out.println(this.name + " died.");
            } else {
                x.setVitality(0);
                if(!x.isChosen){
                    System.out.println(x.name + " died.");
                } else System.out.println(x.name + " goes LOL...");

            }
        }
    }
}
