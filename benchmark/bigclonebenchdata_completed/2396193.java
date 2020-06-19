


class c2396193 {

    public static String getTitleFromURLFast(String p_url) throws Exception {
        URL x_url = new URL(p_url);
        URLConnection x_conn =(URLConnection)(Object) x_url.openConnection();
        InputStreamReader x_is_reader = new InputStreamReader(x_conn.getInputStream());
        BufferedReader x_reader = new BufferedReader(x_is_reader);
        String x_line = null;
        String x_title_line = null;
        String x_lc_line = null;
        int x_title = -1;
        int x_end = -1;
        while ((x_line =(String)(Object) x_reader.readLine()) != null) {
            x_lc_line = x_line.toLowerCase();
            x_title = x_lc_line.indexOf("<title");
            if (x_title != -1) {
                x_end = x_lc_line.indexOf("</title>");
                x_title_line = x_line.substring((x_title + 7), (x_end == -1 ? x_line.length() : x_end));
                break;
            }
        }
        return x_title_line;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

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
