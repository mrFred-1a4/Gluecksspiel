
public class Wuerfelbecher {

    public Wuerfel wuerfelergebniss1;
    public Wuerfel wuerfelergebniss2;
    public Wuerfel wuerfelergebniss3;




    public Wuerfelbecher(){
        wuerfelergebniss1 = new Wuerfel();
        wuerfelergebniss2 = new Wuerfel();
        wuerfelergebniss3 = new Wuerfel();
    }


     public int wuerfel1(){
        return wuerfelergebniss1.wirfErneut();
     }

     public int wuerfel2(){
        return wuerfelergebniss2.wirfErneut();
     }

     public int wuerfel3(){
        return wuerfelergebniss3.wirfErneut();
     }

}
