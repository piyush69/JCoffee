


class c21529921 {
public MyHelperClass scrapeHTMLmetaData(MyHelperClass o0, int o1){ return null; }
public MyHelperClass mXMLpropertyList;
public MyHelperClass DEBUG;
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass markAccessSuccess(){ return null; }
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass setByteSize(int o0){ return null; }
	public MyHelperClass setProperty(String o0, String o1){ return null; }
	public MyHelperClass markAccessAttempt(){ return null; }

    private void _scanForMetaData(URL _url) throws java.io.IOException {
        MyHelperClass DEBUG = new MyHelperClass();
        if ((boolean)(Object)DEBUG.Enabled) System.out.println(this + " _scanForMetaData: xml props " + mXMLpropertyList);
//        MyHelperClass DEBUG = new MyHelperClass();
        if ((boolean)(Object)DEBUG.Enabled) System.out.println("*** Opening connection to " + _url);
        markAccessAttempt();
        Properties metaData =(Properties)(Object) scrapeHTMLmetaData(_url.openConnection(), 2048);
        if ((boolean)(Object)DEBUG.Enabled) System.out.println("*** Got meta-data " + metaData);
        markAccessSuccess();
        String title =(String)(Object) metaData.getProperty("title");
        if (title != null && title.length() > 0) {
            setProperty("title", title);
            title = title.replace('\n', ' ').trim();
            setTitle(title);
        }
        try {
            setByteSize(Integer.parseInt((String)(String)(Object) getProperty("contentLength")));
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass Enabled;
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class Properties {

public MyHelperClass getProperty(String o0){ return null; }}
