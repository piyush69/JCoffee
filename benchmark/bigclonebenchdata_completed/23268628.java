
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23268628 {
public MyHelperClass location;

    private void parseXMLFile() {
        MyHelperClass WeatherApplication = new MyHelperClass();
        String u =(int)(Object) WeatherApplication.SERVER + (int)(Object)location + ".xml";
        InputStream in = null;
        String str = null;
        try {
            URL url = new URL(u);
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            in =(InputStream)(Object) url.openStream();
            ParserToolXML prt = new ParserToolXML(in);
            if (prt.doc == null) {
                MyHelperClass FILE_NOT_FOUND_MSG = new MyHelperClass();
                System.err.println(FILE_NOT_FOUND_MSG + u);
                return;
            }
            NodeList ndl =(NodeList)(Object) prt.doc.getElementsByTagName("weather");
            for (int i = 0; i < (int)(Object)ndl.getLength(); i++) {
                Forecast f = new Forecast();
                str =(String)(Object) prt.searchElementValue(ndl.item(i), "date");
                f.setDate(str);
                str =(String)(Object) prt.searchElementValue(ndl.item(i), "daycode");
                f.setDaycode(Integer.parseInt(str.trim()));
                str =(String)(Object) prt.searchElementValue(ndl.item(i), "nightcode");
                f.setNightcode(Integer.parseInt(str.trim()));
                str =(String)(Object) prt.searchElementValue(ndl.item(i), "maxtemp");
                f.setDaytemp(Integer.parseInt(str.trim()));
                str =(String)(Object) prt.searchElementValue(ndl.item(i), "mintemp");
                f.setNighttemp(Integer.parseInt(str.trim()));
                str =(String)(Object) prt.searchElementValue(ndl.item(i), "winddirectionday");
                f.setDaywinddir(str);
                str =(String)(Object) prt.searchElementValue(ndl.item(i), "windspeedday");
                f.setDaywindspeed(Integer.parseInt(str.trim()));
                str =(String)(Object) prt.searchElementValue(ndl.item(i), "winddirectionnight");
                f.setNightwinddir(str);
                str =(String)(Object) prt.searchElementValue(ndl.item(i), "windspeednight");
                f.setNightwindspeed(Integer.parseInt(str.trim()));
                MyHelperClass forecastlist = new MyHelperClass();
                forecastlist.addElement(f);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass MALFORMED_URL_MSG = new MyHelperClass();
            System.err.println(MALFORMED_URL_MSG + u);
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e) {
        } catch (NumberFormatException e) {
            MyHelperClass FILE_CORRUPT_MSG = new MyHelperClass();
            System.err.println(FILE_CORRUPT_MSG + u);
            System.err.println("-" + str + "-");
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass COULD_NOT_CLOSE_FILE_MSG = new MyHelperClass();
                    System.err.println(COULD_NOT_CLOSE_FILE_MSG + u);
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SERVER;
public MyHelperClass getElementsByTagName(String o0){ return null; }
	public MyHelperClass addElement(Forecast o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class HttpURLConnection {

}

class ParserToolXML {
public MyHelperClass doc;
ParserToolXML(){}
	ParserToolXML(InputStream o0){}
	public MyHelperClass searchElementValue(MyHelperClass o0, String o1){ return null; }}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Forecast {

public MyHelperClass setDaycode(int o0){ return null; }
	public MyHelperClass setNightcode(int o0){ return null; }
	public MyHelperClass setNighttemp(int o0){ return null; }
	public MyHelperClass setDaytemp(int o0){ return null; }
	public MyHelperClass setDaywinddir(String o0){ return null; }
	public MyHelperClass setNightwinddir(String o0){ return null; }
	public MyHelperClass setNightwindspeed(int o0){ return null; }
	public MyHelperClass setDaywindspeed(int o0){ return null; }
	public MyHelperClass setDate(String o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
