package Final;
public class Character {
    String name;
    String location;
    private int vitality;
    boolean isChosen;

    public void moveTo(Orphanage sierociniec){
        location = sierociniec.location;
    }

    public void moveTo(String miejsce){
        location = miejsce;
    }

    public void introduce(){
        System.out.println("Hello, I am " + name);
    }

    public Character(String name, String location) {
        this.name = name;
        this.location = location;
        vitality = 100;
        if(name == "harry") {
            isChosen = true;
        }

    }

    public static void MoveAllTo(String location, Character ...characters){
        for(Character x : characters){
            x.setLocation(location);
        }
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void say(String tekst, Character postac){
        System.out.println(name + " to " + postac);
        System.out.println(tekst);
    }

    public void doSth(String arg) {
        System.out.println("I am " + name + ", I am " + arg);
    }

    public static void doSth(String arg, Character... characters) {
        for (Character x: characters){
            x.doSth(arg);
        }
    }

    @Override
    public String toString() {
        return name;
    }


    public static void status(){
        System.out.println();
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }
}
