


class c23113421 {
public MyHelperClass parser;

    public String getString(String arg) throws Exception {
        URL url = new URL(arg);
        URLConnection con =(URLConnection)(Object) url.openConnection();
        con.setUseCaches(false);
        con.connect();
        InputStreamReader src = new InputStreamReader(con.getInputStream(), "ISO-8859-1");
        StringBuffer stb = new StringBuffer();
        char[] buf = new char[1024];
        int l;
        while ((l =(int)(Object) src.read(buf, 0, 1024)) >= 0) {
            stb.append(buf, 0, l);
        }
        String res = stb.toString();
        if (res.startsWith("<pannenleiter-exception")) {
            MyHelperClass builder = new MyHelperClass();
            builder.start(new TreeNode((TreeWidget) null, false), false);
            InputSource xmlInput = new InputSource(new StringReader(res));
//            MyHelperClass builder = new MyHelperClass();
            parser.setDocumentHandler(builder);
            MyHelperClass parser = new MyHelperClass();
            parser.parse(xmlInput);
        }
        return res;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass start(TreeNode o0, boolean o1){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }
	public MyHelperClass setDocumentHandler(MyHelperClass o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}
	public MyHelperClass read(char[] o0, int o1, int o2){ return null; }}

class TreeNode {

TreeNode(TreeWidget o0, boolean o1){}
	TreeNode(){}}

class TreeWidget {

}

class InputSource {

InputSource(StringReader o0){}
	InputSource(){}}

class StringReader {

StringReader(String o0){}
	StringReader(){}}
