


class c6700755 {

    public static final void newRead() {
        HTMLDocument html = new HTMLDocument();
        html.putProperty("IgnoreCharsetDirective", new Boolean(true));
        try {
            HTMLEditorKit kit = new HTMLEditorKit();
            URL url = new URL("http://omega.rtu.lv/en/index.html");
            kit.read(new BufferedReader(new InputStreamReader(url.openStream())), html, 0);
            Reader reader =(Reader)(Object) new FileReader(html.getText(0, html.getLength()));
            MyHelperClass HTMLUtils = new MyHelperClass();
            List links =(List)(Object) HTMLUtils.extractLinks(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass extractLinks(Reader o0){ return null; }}

class HTMLDocument {

public MyHelperClass getText(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass putProperty(String o0, Boolean o1){ return null; }
	public MyHelperClass getLength(){ return null; }}

class HTMLEditorKit {

public MyHelperClass read(BufferedReader o0, HTMLDocument o1, int o2){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Reader {

}

class FileReader {

FileReader(MyHelperClass o0){}
	FileReader(){}}

class List {

}
