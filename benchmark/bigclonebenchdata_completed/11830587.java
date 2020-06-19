
import java.io.UncheckedIOException;


class c11830587 {
public MyHelperClass Type;

    public void afficherMetar(String oaci) {
        if (oaci.length() != 4) {
            System.out.println("un code METAR est composé de 4 caracteres");
        }
        oaci.toUpperCase();
        try {
            URL url = new URL("http://weather.noaa.gov/pub/data/observations/metar/stations/" + oaci + ".TXT");
            System.out.println(url.toString());
            Proxy acReunion = new Proxy(Type.HTTP, new InetSocketAddress("proxy.ac-reunion.fr", 8080));
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection(acReunion);
            InputStreamReader isr = new InputStreamReader(con.getInputStream());
            BufferedReader in = new BufferedReader(isr);
            Vector vListe = new Vector();
            String line;
            System.out.println("Affichage METAR");
            System.out.println("--------");
            while ((line =(String)(Object) in.readLine()) != null) {
                System.out.println(line);
                vListe.add(line);
            }
            System.out.println("--------");
            in.close();
        } catch (java.io.UncheckedIOException e) {
            System.out.println("Impossible de trouver le METAR");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP;
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(Proxy o0){ return null; }}

class Proxy {

Proxy(MyHelperClass o0, InetSocketAddress o1){}
	Proxy(){}}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class Vector {

public MyHelperClass add(String o0){ return null; }}

class InetSocketAddress {

InetSocketAddress(String o0, int o1){}
	InetSocketAddress(){}}
