


class c4005293 {

    public static String translate(String s, String type) {
        try {
            String result = null;
            URL url = new URL("http://www.excite.co.jp/world/english/");
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
            connection.setDoOutput(true);
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            MyHelperClass URLEncoder = new MyHelperClass();
            out.print("before=" + URLEncoder.encode(s, "SJIS") + "&wb_lp=");
            out.print(type);
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "SJIS"));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                int textPos = inputLine.indexOf("name=\"after\"");
                if (textPos >= 0) {
                    int ltrPos = inputLine.indexOf(">", textPos + 11);
                    if (ltrPos >= 0) {
                        int closePos = inputLine.indexOf("<", ltrPos + 1);
                        if (closePos >= 0) {
                            result = inputLine.substring(ltrPos + 1, closePos);
                            break;
                        } else {
                            result = inputLine.substring(ltrPos + 1);
                            break;
                        }
                    }
                }
            }
            in.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class PrintWriter {

PrintWriter(MyHelperClass o0){}
	PrintWriter(){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
