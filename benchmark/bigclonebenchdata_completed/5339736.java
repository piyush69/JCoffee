


class c5339736 {

    public static String translate(String s) {
        try {
            String result = null;
            URL url = new URL("http://translate.google.com/translate_t");
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
            connection.setDoOutput(true);
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            MyHelperClass URLEncoder = new MyHelperClass();
            out.print("text=" + URLEncoder.encode(s, "UTF-8") + "&langpair=");
            if (s.matches("[\\u0000-\\u00ff]+")) {
                out.print("en|ja");
            } else {
                out.print("ja|en");
            }
            out.print("&hl=en&ie=UTF-8&oe=UTF-8");
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                int textPos = inputLine.indexOf("id=result_box");
                if (textPos >= 0) {
                    int ltrPos = inputLine.indexOf("dir=ltr", textPos + 9);
                    if (ltrPos >= 0) {
                        int closePos = inputLine.indexOf("<", ltrPos + 8);
                        if (closePos >= 0) {
                            result = inputLine.substring(ltrPos + 8, closePos);
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
