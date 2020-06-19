
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15948682 {
public MyHelperClass Logger;

    private byte[] odszyfrujKlucz(byte[] kluczSesyjny, int rozmiarKlucza) {
        byte[] odszyfrowanyKlucz = null;
        byte[] kluczTymczasowy = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest skrot =(MessageDigest)(Object) MessageDigest.getInstance("SHA-1");
            MyHelperClass haslo = new MyHelperClass();
            skrot.update(haslo.getBytes());
            byte[] skrotHasla =(byte[])(Object) skrot.digest();
            MyHelperClass MARS_Algorithm = new MyHelperClass();
            Object kluczDoKlucza = MARS_Algorithm.makeKey(skrotHasla);
            byte[] tekst = null;
            kluczTymczasowy = new byte[rozmiarKlucza];
            MyHelperClass ROZMIAR_BLOKU = new MyHelperClass();
            int liczbaBlokow = rozmiarKlucza / (int)(Object)ROZMIAR_BLOKU;
            for (int i = 0; i < liczbaBlokow; i++) {
//                MyHelperClass ROZMIAR_BLOKU = new MyHelperClass();
                tekst =(byte[])(Object) MARS_Algorithm.blockDecrypt(kluczSesyjny, i * (int)(Object)ROZMIAR_BLOKU, kluczDoKlucza);
//                MyHelperClass ROZMIAR_BLOKU = new MyHelperClass();
                System.arraycopy(tekst, 0, kluczTymczasowy, i * (int)(Object)ROZMIAR_BLOKU, tekst.length);
            }
            MyHelperClass dlugoscKlucza = new MyHelperClass();
            odszyfrowanyKlucz = new byte[(int)(Object)dlugoscKlucza];
//            MyHelperClass dlugoscKlucza = new MyHelperClass();
            System.arraycopy(kluczTymczasowy, 0, odszyfrowanyKlucz, 0,(int)(Object) dlugoscKlucza);
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(SzyfrowaniePliku.class.getName()).log(Level.SEVERE, null,(InvalidKeyException)(Object) ex);
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }
        return odszyfrowanyKlucz;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, InvalidKeyException o2){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass makeKey(byte[] o0){ return null; }
	public MyHelperClass blockDecrypt(byte[] o0, int o1, Object o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class InvalidKeyException extends Exception{
	public InvalidKeyException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class SzyfrowaniePliku {

}
