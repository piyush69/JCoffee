import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7468318 {
public MyHelperClass getCodeBase(){ return null; }

    private List<Intrebare> citesteIntrebari() throws Throwable, IOException {
        ArrayList<Intrebare> intrebari = new ArrayList<Intrebare>();
        try {
            URL url = new URL((URL)(Object)getCodeBase(), "../intrebari.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader((url.openStream())));
            String intrebare;
            while ((intrebare = reader.readLine()) != null) {
                Collection<String> raspunsuri = new ArrayList<String>();
                Collection<String> predicate = new ArrayList<String>();
                String raspuns = "";
                while (!"".equals(raspuns = reader.readLine())) {
                    raspunsuri.add(raspuns);
                    predicate.add(reader.readLine());
                }
                Intrebare i = new Intrebare(intrebare, raspunsuri.toArray(new String[raspunsuri.size()]), predicate.toArray(new String[predicate.size()]));
                intrebari.add(i);
            }
        } catch (ArgumentExcetpion(Throwable)(Object) e) {
            e.printStackTrace();
        }
        return intrebari;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Intrebare {

Intrebare(String o0, String[] o1, String[] o2){}
	Intrebare(){}}

class ArgumentExcetpion {

public MyHelperClass printStackTrace(){ return null; }}
