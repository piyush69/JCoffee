


class c6302678 {
public MyHelperClass werteAugen(MyHelperClass o0){ return null; }

    public ISpieler[] sortiereSpielerRamsch(ISpieler[] spieler) {
        for (int i = 0; i < spieler.length; i++) {
            for (int j = 0; j < spieler.length - 1; j++) {
                if ((int)(Object)werteAugen(spieler[j].getStiche()) > (int)(Object)werteAugen(spieler[j + 1].getStiche())) {
                    ISpieler a = spieler[j];
                    spieler[j] = spieler[j + 1];
                    spieler[j + 1] = a;
                }
            }
        }
        return spieler;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ISpieler {

public MyHelperClass getStiche(){ return null; }}
