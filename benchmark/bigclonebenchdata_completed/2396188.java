


class c2396188 {

    public static Vector getMetaKeywordsFromURL(String p_url) throws Exception {
        URL x_url = new URL(p_url);
        URLConnection x_conn =(URLConnection)(Object) x_url.openConnection();
        InputStreamReader x_is_reader = new InputStreamReader(x_conn.getInputStream());
        BufferedReader x_reader = new BufferedReader(x_is_reader);
        String x_line = null;
        String x_lc_line = null;
        int x_body = -1;
        String x_keyword_list = null;
        int x_keywords = -1;
        String[] x_meta_keywords = null;
        while ((x_line =(String)(Object) x_reader.readLine()) != null) {
            x_lc_line = x_line.toLowerCase();
            x_keywords = x_lc_line.indexOf("<meta name=\"keywords\" content=\"");
            if (x_keywords != -1) {
                x_keywords = "<meta name=\"keywords\" content=\"".length();
                x_keyword_list = x_line.substring(x_keywords, x_line.indexOf("\">", x_keywords));
                x_keyword_list = x_keyword_list.replace(',', ' ');
                MyHelperClass Parser = new MyHelperClass();
                x_meta_keywords =(String[])(Object) Parser.extractWordsFromSpacedList(x_keyword_list);
            }
            x_body = x_lc_line.indexOf("<body");
            if (x_body != -1) break;
        }
        Vector x_vector = new Vector(x_meta_keywords.length);
        for (int i = 0; i < x_meta_keywords.length; i++) x_vector.add(x_meta_keywords[i]);
        return x_vector;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass extractWordsFromSpacedList(String o0){ return null; }}

class Vector {

Vector(int o0){}
	Vector(){}
	public MyHelperClass add(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
