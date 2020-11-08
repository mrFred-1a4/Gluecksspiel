public class Wuerfel {

    private Zufallsgenerator z;

    public Wuerfel(){
        z = new Zufallsgenerator();
    }

    public int wirfErneut(){
        return z.neueZufallszahl(1, 6);
    }

}
