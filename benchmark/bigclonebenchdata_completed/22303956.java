
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22303956 {

    private static BreakIterator createBreakInstance(Locale where, int kind, String rulesName, String dictionaryName) {
        MyHelperClass ICULocaleData = new MyHelperClass();
        ResourceBundle bundle =(ResourceBundle)(Object) ICULocaleData.getResourceBundle("BreakIteratorRules", where);
        String[] classNames =(String[])(Object) bundle.getStringArray("BreakIteratorClasses");
        String rules =(String)(Object) bundle.getString(rulesName);
        if (classNames[kind].equals("RuleBasedBreakIterator")) {
            return (BreakIterator)(Object)new RuleBasedBreakIterator(rules);
        } else if (classNames[kind].equals("DictionaryBasedBreakIterator")) {
            try {
                Object t = bundle.getObject(dictionaryName);
                URL url = (URL) t;
                InputStream dictionary =(InputStream)(Object) url.openStream();
                return (BreakIterator)(Object)new DictionaryBasedBreakIterator(rules, dictionary);
            } catch (UncheckedIOException e) {
            } catch (ArithmeticException e) {
            }
            return (BreakIterator)(Object)new RuleBasedBreakIterator(rules);
        } else {
            throw new IllegalArgumentException("Invalid break iterator class \"" + classNames[kind] + "\"");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResourceBundle(String o0, Locale o1){ return null; }}

class Locale {

}

class BreakIterator {

}

class ResourceBundle {

public MyHelperClass getObject(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getStringArray(String o0){ return null; }}

class RuleBasedBreakIterator {

RuleBasedBreakIterator(String o0){}
	RuleBasedBreakIterator(){}}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class DictionaryBasedBreakIterator {

DictionaryBasedBreakIterator(){}
	DictionaryBasedBreakIterator(String o0, InputStream o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class MissingResourceException extends Exception{
	public MissingResourceException(String errorMessage) { super(errorMessage); }
}
