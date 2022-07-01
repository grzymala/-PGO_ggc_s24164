package Final;
public class Riddle extends Child{
    String nazwa;
    String location;

    @Override
    public String getLocation() {
        return location;
    }

    public Riddle(String nazwa, String location) {
        super(nazwa, location);
    }

    public void introduce(){
        System.out.println("Hello, I am " + nazwa);
    }

}
