


class c17662458 {

    public static String getHighlightBaseLib() throws Exception {
        StringBuffer highlightKey = new StringBuffer();
        MyHelperClass COLOR_BASELIB = new MyHelperClass();
        highlightKey.append("<c color=\"" + COLOR_BASELIB + "\">\n\t");
        URL url =(URL)(Object) AbstractRunner.class.getResource("baselib.js");
        if (url != null) {
            InputStream is =(InputStream)(Object) url.openStream();
            InputStreamReader reader = new InputStreamReader(is, "UTF-8");
            BufferedReader bfReader = new BufferedReader(reader);
            String tmp = null;
            do {
                tmp =(String)(Object) bfReader.readLine();
                if (tmp != null) {
                    if (tmp.indexOf("function") > -1) {
                        highlightKey.append("<w>" + (tmp.substring(tmp.indexOf("function") + 8, tmp.indexOf("(")).trim()) + "</w>\n\t");
                    }
                }
            } while (tmp != null);
            bfReader.close();
            reader.close();
            is.close();
        }
        highlightKey.append("</c>");
        return highlightKey.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class AbstractRunner {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}
