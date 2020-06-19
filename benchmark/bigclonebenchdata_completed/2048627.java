
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2048627 {
public MyHelperClass stripVariant(Locale o0){ return null; }

    private void addLocale(Locale locale) throws MissingResourceException {
        locale =(Locale)(Object) stripVariant(locale);
        MyHelperClass localeToMap = new MyHelperClass();
        Map props =(Map)(Object) localeToMap.get(locale);
        if (props == null) props =(Map)(Object) new HashMap();
        MyHelperClass LOCALE_FILE_URL_SUFFIX = new MyHelperClass();
        String urlName = locale.toString() + LOCALE_FILE_URL_SUFFIX;
        URL url =(URL)(Object) ClassLoader.getSystemClassLoader().getResource(urlName);
        if (url == null) {
            url =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource(urlName);
            if (url == null) {
                throw new MissingResourceException("Cannot locate hprops for " + "locale " + locale, "PropertiesLocalizer", "HProperties: for " + locale);
            }
        }
        BufferedReader input = null;
        try {
            input = new BufferedReader(new InputStreamReader((InputStream)(InputStream)(Object) url.openStream(), "UTF8"));
            String str;
            while ((str =(String)(Object) input.readLine()) != null) {
                str = str.trim();
                if (!str.startsWith("#") && !str.startsWith("!")) {
                    int index = -1;
                    for (int i = 0; i < str.length(); i++) {
                        char c = str.charAt(i);
                        if (c == ':' || c == '=') {
                            index = i;
                            break;
                        }
                    }
                    if (index > 0) {
                        String key = str.substring(0, index).trim();
                        String value = str.substring(index + 1);
                        props.put(key, value);
                    }
                }
            }
        } catch (UncheckedIOException ioe) {
            throw new MissingResourceException(ioe.getMessage(), "PropertiesLocalizer", "HProperties: for " + locale.toString());
        } finally {
            try {
                input.close();
            } catch (UncheckedIOException ioe) {
            }
        }
//        MyHelperClass localeToMap = new MyHelperClass();
        localeToMap.put(locale, props);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(Locale o0){ return null; }
	public MyHelperClass put(Locale o0, Map o1){ return null; }}

class Locale {

}

class MissingResourceException extends Exception{
	public MissingResourceException(String errorMessage) { super(errorMessage); }
	MissingResourceException(){}
	MissingResourceException(String o0, String o1, String o2){}
}

class Map {

public MyHelperClass put(String o0, String o1){ return null; }}

class HashMap {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
