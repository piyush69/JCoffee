
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14658498 {

    private Properties loadPropertiesFromURL(String propertiesURL, Properties defaultProperties) {
        Properties properties = new Properties(defaultProperties);
        URL url;
        try {
            url = new URL(propertiesURL);
            URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
            properties.load(urlConnection.getInputStream());
        } catch (UncheckedIOException e) {
            System.out.println("Error while loading url " + propertiesURL + " (" + e.getClass().getName() + ")");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Error while loading url " + propertiesURL + " (" + e.getClass().getName() + ")");
            e.printStackTrace();
        }
        return properties;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Properties {

Properties(){}
	Properties(Properties o0){}
	public MyHelperClass load(MyHelperClass o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
