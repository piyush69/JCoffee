import java.io.*;
import java.lang.*;
import java.util.*;



class c19309675 {
public MyHelperClass ISpellCheckPreferenceKeys;

    public final void propertyChange(final PropertyChangeEvent event) {
        MyHelperClass fChecker = new MyHelperClass();
        if (fChecker != null && event.getProperty().equals(ISpellCheckPreferenceKeys.SPELLING_USER_DICTIONARY)) {
            MyHelperClass fUserDictionary = new MyHelperClass();
            if (fUserDictionary != null) {
//                MyHelperClass fUserDictionary = new MyHelperClass();
                fChecker.removeDictionary(fUserDictionary);
//                MyHelperClass fUserDictionary = new MyHelperClass();
                fUserDictionary = null;
            }
            final String file = (String)(String)(Object) event.getNewValue();
            if (file.length() > 0) {
                try {
                    final URL url = new URL("file", null, file);
                    InputStream stream =(InputStream)(Object) url.openStream();
                    if (stream != null) {
                        try {
//                            MyHelperClass fUserDictionary = new MyHelperClass();
                            fUserDictionary =(MyHelperClass)(Object) new PersistentSpellDictionary(url);
//                            MyHelperClass fUserDictionary = new MyHelperClass();
                            fChecker.addDictionary(fUserDictionary);
                        } finally {
                            stream.close();
                        }
                    }
                } catch (UncheckedIOException exception) {
                } catch (IOException exception) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SPELLING_USER_DICTIONARY;
public MyHelperClass addDictionary(MyHelperClass o0){ return null; }
	public MyHelperClass removeDictionary(MyHelperClass o0){ return null; }}

class PropertyChangeEvent {

public MyHelperClass getProperty(){ return null; }
	public MyHelperClass getNewValue(){ return null; }}

class URL {

URL(String o0, Object o1, String o2){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class PersistentSpellDictionary {

PersistentSpellDictionary(URL o0){}
	PersistentSpellDictionary(){}}
