
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13383602 {

    private String getClassname(Bundle bundle) {
        URL urlEntry =(URL)(Object) bundle.getEntry("jdbcBundleInfo.xml");
        InputStream in = null;
        try {
            in =(InputStream)(Object) urlEntry.openStream();
            try {
                StringBuilder sb = new StringBuilder();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String line;
                while ((line =(String)(Object) reader.readLine()) != null) {
                    if (!line.startsWith("<!DOCTYPE")) {
                        sb.append(line);
                    }
                }
                SAXBuilder builder = new SAXBuilder(false);
                Document doc =(Document)(Object) builder.build(new StringReader(sb.toString()));
                Element eRoot =(Element)(Object) doc.getRootElement();
                if ("jdbcBundleInfo".equals(eRoot.getName())) {
                    Attribute atri =(Attribute)(Object) eRoot.getAttribute("className");
                    if (atri != null) {
                        return(String)(Object) atri.getValue();
                    }
                }
            } catch (UncheckedIOException e) {
            }
        } catch (UncheckedIOException e) {
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Bundle {

public MyHelperClass getEntry(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class SAXBuilder {

SAXBuilder(){}
	SAXBuilder(boolean o0){}
	public MyHelperClass build(StringReader o0){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class StringReader {

StringReader(String o0){}
	StringReader(){}}

class Element {

public MyHelperClass getAttribute(String o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class Attribute {

public MyHelperClass getValue(){ return null; }}

class JDOMException extends Exception{
	public JDOMException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
