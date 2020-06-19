
import java.io.UncheckedIOException;


class c19080710 {

    public String getDefaultPaletteXML() {
        URL url =(URL)(Object) getClass().getResource("xml/palettes.xml");
        StringBuffer contents = new StringBuffer();
        try {
            InputStream inputStream =(InputStream)(Object) url.openStream();
            int i;
            while (true) {
                i =(int)(Object) inputStream.read();
                if (i == -1) break;
                char c = (char) i;
                contents.append(c);
            }
            inputStream.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return contents.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
