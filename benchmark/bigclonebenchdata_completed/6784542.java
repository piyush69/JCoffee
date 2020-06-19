
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6784542 {
public MyHelperClass applicationId;
	public MyHelperClass createLocation(Address o0){ return null; }

    public Coordinates geocode(Address address) {
        Coordinates geocoordinates = null;
        MyHelperClass YAHOOURL = new MyHelperClass();
        String web = YAHOOURL + "?appid=" + applicationId + "&location=" + createLocation(address);
        URL url;
        try {
            url = new URL(web);
            InputStream in =(InputStream)(Object) url.openStream();
            MyHelperClass YahooXmlReader = new MyHelperClass();
            geocoordinates =(Coordinates)(Object) YahooXmlReader.readConfig(in);
            in.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return geocoordinates;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readConfig(InputStream o0){ return null; }}

class Address {

}

class Coordinates {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
