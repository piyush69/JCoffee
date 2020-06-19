
import java.io.UncheckedIOException;


class c21009957 {

//    @Override
    public void readMessages(final Messages messages) throws LocatorException {
        try {
            MyHelperClass url = new MyHelperClass();
            final InputStream in =(InputStream)(Object) url.openStream();
            try {
                final Properties properties = new Properties();
                properties.load(in);
                MyHelperClass locale = new MyHelperClass();
                messages.add(locale, properties);
            } finally {
                in.close();
            }
        } catch (final UncheckedIOException e) {
            MyHelperClass url = new MyHelperClass();
            throw new LocatorException("Failed to read messages from URL: " + url,(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class Messages {

public MyHelperClass add(MyHelperClass o0, Properties o1){ return null; }}

class LocatorException extends Exception{
	public LocatorException(String errorMessage) { super(errorMessage); }
	LocatorException(String o0, IOException o1){}
	LocatorException(){}
}

class InputStream {

public MyHelperClass close(){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
