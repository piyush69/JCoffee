import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14032835 {
public MyHelperClass Level;
	public MyHelperClass dlugoscKlucza;
	public MyHelperClass ROZMIAR_BLOKU;
	public MyHelperClass Logger;
	public MyHelperClass MARS_Algorithm;

    private byte[] szyfrujKlucz(byte[] kluczSesyjny) {
        byte[] zaszyfrowanyKlucz = null;
        byte[] klucz = null;
        try {
            MessageDigest skrot = MessageDigest.getInstance("SHA-1");
            MyHelperClass haslo = new MyHelperClass();
            skrot.update((byte)(Object)haslo.getBytes());
            byte[] skrotHasla = skrot.digest();
            MyHelperClass MARS_Algorithm = new MyHelperClass();
            Object kluczDoKlucza = MARS_Algorithm.makeKey(skrotHasla);
            int resztaKlucza =(int)(Object) this.dlugoscKlucza % (int)(Object)ROZMIAR_BLOKU;
            if (resztaKlucza == 0) {
                klucz = kluczSesyjny;
                zaszyfrowanyKlucz = new byte[(int)(Object)this.dlugoscKlucza];
            } else {
                int liczbaBlokow =(int)(Object) this.dlugoscKlucza / (int)(Object)ROZMIAR_BLOKU + 1;
                int nowyRozmiar = liczbaBlokow * (int)(Object)ROZMIAR_BLOKU;
                zaszyfrowanyKlucz = new byte[nowyRozmiar];
                klucz = new byte[nowyRozmiar];
                byte roznica = (byte) ((int)(Object)ROZMIAR_BLOKU - resztaKlucza);
                System.arraycopy(kluczSesyjny, 0, klucz, 0, kluczSesyjny.length);
                for (int i = kluczSesyjny.length; i < nowyRozmiar; i++) klucz[i] = (byte) roznica;
            }
            byte[] szyfrogram = null;
            int liczbaBlokow = klucz.length / (int)(Object)ROZMIAR_BLOKU;
            int offset = 0;
            for (offset = 0; offset < liczbaBlokow; offset++) {
                szyfrogram =(byte[])(Object) MARS_Algorithm.blockEncrypt(klucz, offset * (int)(Object)ROZMIAR_BLOKU, kluczDoKlucza);
                System.arraycopy(szyfrogram, 0, zaszyfrowanyKlucz, offset * (int)(Object)ROZMIAR_BLOKU, szyfrogram.length);
            }
        } catch (UncheckedIOException ex) {
            Logger.getLogger(SzyfrowaniePliku.class.getName()).log(Level.SEVERE, null,(InvalidKeyException)(Object) ex);
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return zaszyfrowanyKlucz;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass blockEncrypt(byte[] o0, int o1, Object o2){ return null; }
	public MyHelperClass makeKey(byte[] o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, InvalidKeyException o2){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class SzyfrowaniePliku {

}
