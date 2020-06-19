


class c11073250 {

    protected void loadText(final Element elem) {
        final String urlAttr =(String)(Object) elem.getAttributeValue("url");
        if (urlAttr != null) {
            String result = "";
            try {
                MyHelperClass DatabaseViewerManager = new MyHelperClass();
                final URL url = new URL(DatabaseViewerManager.baseURL, urlAttr);
                final BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                String line =(String)(Object) reader.readLine();
                while (line != null) {
                    result += line + "\n";
                    line =(String)(Object) reader.readLine();
                }
                elem.addContent(result);
                elem.removeAttribute("url");
            } catch (final Exception e) {
                throw new RuntimeException("Could not insert text template for database viewer from file", e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass baseURL;
}

class Element {

public MyHelperClass getAttributeValue(String o0){ return null; }
	public MyHelperClass removeAttribute(String o0){ return null; }
	public MyHelperClass addContent(String o0){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
