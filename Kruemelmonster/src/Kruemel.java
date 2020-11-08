public class Kruemel {

    private int startkekse;
    private int spieleinsatz;
    private int aktuelleKekse;
    private Wuerfelbecher wuerfelergebniss1;
    private Wuerfelbecher wuerfelergebniss2;
    private Wuerfelbecher wuerfelergebniss3;
    private boolean einsatzGezahlt;
    private int wuerfel1;
    private int wuerfel2;
    private int wuerfel3;

    /*Kruemelmonster
    * Diesees Krümelmonster kann legales, virtuelles glückspiel betreiben
    * Frederic Franck*/
    public Kruemel(int Keksbudget, int Einsatz){
        if(Keksbudget >= 0){
            startkekse = Keksbudget;
        }else{
            startkekse = 0;
            System.out.println("du hast keine Kekse");
        }
        if(Einsatz > 0){
            spieleinsatz = Einsatz;
        }else{
            spieleinsatz = 0;
            System.out.println("du spielst gratis");
        }

        einsatzGezahlt = false;
        aktuelleKekse = startkekse;
        wuerfelergebniss1 = new Wuerfelbecher();
        wuerfelergebniss2 = new Wuerfelbecher();
        wuerfelergebniss3 = new Wuerfelbecher();
        wuerfel1 = wuerfelergebniss1.wuerfel1();
        wuerfel2 = wuerfelergebniss2.wuerfel2();
        wuerfel3 = wuerfelergebniss3.wuerfel3();

    }
    public void erneutWuerfeln(){
        wuerfel1 = wuerfelergebniss1.wuerfel1();
        wuerfel2 = wuerfelergebniss2.wuerfel2();
        wuerfel3 = wuerfelergebniss3.wuerfel3();
    }

    public void einsatzBezahlen(){
        if(aktuelleKekse - spieleinsatz >= 0 && !einsatzGezahlt){
            aktuelleKekse = aktuelleKekse - spieleinsatz;
            System.out.print("Du hast deinen Einsatz gezahlt und noch ");
            System.out.print(aktuelleKekse);
            System.out.println(" Kekse übrig");
            einsatzGezahlt = true;
        } else if(einsatzGezahlt){
            System.out.println("du hast deinen Einsatz bereits gezahlt");
        } else {
            System.out.println("um zu würfeln bruachst du");
            System.out.println(spieleinsatz);
            System.out.println("du hast aber nur");
            System.out.println(aktuelleKekse);
            /*Hier sollten alle Variablen als ein String ausgegeben werden*/
        }
        }

        public int keksstand(){
            return aktuelleKekse;
        }

        public void legalesGlücksspielAusführen(){
        erneutWuerfeln();
        if(einsatzGezahlt){
                        einsatzGezahlt = false;
            System.out.println("Deine Ergebnisse sind:");
            System.out.print("1.Wuerfel:");
            System.out.println(wuerfel1);
            System.out.print("2.Wuerfel:");
            System.out.println(wuerfel2);
            System.out.print("3.Wuerfel:");
            System.out.println(wuerfel3);
            System.out.print("Die kombinierte Augenzahl ist ");
            System.out.println(wuerfel1 + wuerfel2 + wuerfel3);

            if(wuerfel1 == wuerfel2 && wuerfel2 == wuerfel3){
                aktuelleKekse = aktuelleKekse +6;
                System.out.print("Du hast 6 Kekse gewwonnen, jetzt hast du ");
                System.out.print(aktuelleKekse);
                System.out.println(" Kekse");
            }else if(wuerfel1 == wuerfel2 & wuerfel1 == wuerfel3 & wuerfel2 == wuerfel3){
                aktuelleKekse = aktuelleKekse +4;
                System.out.print("Du hast 4 Kekse gewonnen, jetzt hast du ");
                System.out.print(aktuelleKekse);
                System.out.println(" Kekse");
            }else if(wuerfel1 + wuerfel2 + wuerfel3 >=8 && wuerfel1 + wuerfel2 + wuerfel3 <=12){
                aktuelleKekse = aktuelleKekse +3;
                System.out.print("Du hast 3 Kekse gewonnen, jetzt hast du ");
                System.out.print(aktuelleKekse);
                System.out.println(" Kekse");
            }else{
                System.out.println("Du hast leider nichts gewonnen");
                System.out.print("Du hast noch ");
                System.out.print(aktuelleKekse);
                System.out.println(" Kekse übrig");
            }

        }else{
            System.out.println("du hast deinen einsatz nicht bezahlt");
        }
    }
}
