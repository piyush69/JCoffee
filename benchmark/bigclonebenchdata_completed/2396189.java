


class c2396189 {
public static MyHelperClass extractOutsideText(String o0, String o1, String o2, Vector o3, boolean o4){ return null; }
//public MyHelperClass extractOutsideText(String o0, String o1, String o2, Vector o3, boolean o4){ return null; }

    public static Vector getKeywordsFromURL(String p_url) throws Exception {
        URL x_url = new URL(p_url);
        URLConnection x_conn =(URLConnection)(Object) x_url.openConnection();
        InputStreamReader x_is_reader = new InputStreamReader(x_conn.getInputStream());
        BufferedReader x_reader = new BufferedReader(x_is_reader);
        String x_line = null;
        String x_lc_line = null;
        Vector x_words = new Vector(1000);
        int x_body = -1;
        while ((x_line =(String)(Object) x_reader.readLine()) != null) {
            x_lc_line = x_line.toLowerCase();
            x_body = x_lc_line.indexOf("<body");
            if (x_body != -1) {
                x_line = x_line.substring(x_body + 5);
                break;
            }
        }
        boolean x_status = false;
        int x_end = -1;
        if (x_lc_line == null) {
            System.out.println("No <body start");
            return null;
        }
        do {
            x_lc_line = x_line.toLowerCase();
            x_end = x_lc_line.indexOf("</body>");
            if (x_end != -1) {
                extractOutsideText(x_line.substring(0, x_end), "<", ">", x_words, x_status);
                break;
            }
            x_status =(boolean)(Object) extractOutsideText(x_line, "<", ">", x_words, x_status);
        } while ((x_line =(String)(Object) x_reader.readLine()) != null);
        return x_words;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Vector {

Vector(int o0){}
	Vector(){}}

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
