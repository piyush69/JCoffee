


class c18779982 {

    private HashSet href(String urlstr) throws IOException {
        HashSet hrefs = new HashSet();
        URL url = new URL(urlstr);
        URLConnection con =(URLConnection)(Object) url.openConnection();
        MyHelperClass _session_id = new MyHelperClass();
        con.setRequestProperty("Cookie", "_session_id=" + _session_id);
        InputStreamReader r = new InputStreamReader(con.getInputStream());
        StringWriter b = new StringWriter();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copyTo(r, b);
        r.close();
        try {
            MyHelperClass WAIT_SECONDS = new MyHelperClass();
            Thread.sleep((int)(Object)WAIT_SECONDS * 1000);
        } catch (Exception err) {
        }
        String tokens[] = b.toString().replace("\n", " ").replaceAll("[\\<\\>]", "\n").split("[\n]");
        for (String s1 : tokens) {
            if (!(s1.startsWith("a") && s1.contains("href"))) continue;
            String tokens2[] = s1.split("[\\\"\\\']");
            for (String s2 : tokens2) {
                if (!(s2.startsWith("mailto:") || s2.matches("/profile/index/[0-9]+"))) continue;
                hrefs.add(s2);
            }
        }
        return hrefs;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyTo(InputStreamReader o0, StringWriter o1){ return null; }}

class HashSet {

public MyHelperClass add(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}
	public MyHelperClass close(){ return null; }}

class StringWriter {

}
