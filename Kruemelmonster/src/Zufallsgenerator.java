import java.util.Random;     // importiert die Klasse Random aus dem Paket java.util

public class Zufallsgenerator {

    private Random zufallsgenerator;

    public Zufallsgenerator(){
        zufallsgenerator = new Random();     // erzeugt einen neuen Zufallsgenerator namens zufallsgenerator
    }

    public int neueZufallszahl(int von, int bis){
        return zufallsgenerator.nextInt(bis - von + 1) + von;     // erzeugt eine Zufallszahl zwischen von und bis
    }

}
