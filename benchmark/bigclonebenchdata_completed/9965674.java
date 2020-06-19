


class c9965674 {
public MyHelperClass getResultStr(String o0){ return null; }
	public MyHelperClass getBefore(String o0, String o1){ return null; }
	public MyHelperClass cutAfter(String o0, String o1){ return null; }

    public String ask(String s) {
        System.out.println("asking ---> " + s);
        try {
            String result = null;
            MyHelperClass URLEncoder = new MyHelperClass();
            URL url = new URL("http://www.google.com/search?hl=en&rls=GGLR,GGLR:2005-50,GGLR:en&sa=X&oi=spell&resnum=0&ct=result&cd=1&q=" + URLEncoder.encode(s, "UTF-8"));
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
            connection.setDoOutput(false);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                int textPos = inputLine.indexOf("Web definitions for ");
                if (textPos >= 0) {
                    int ltrPos = inputLine.indexOf("<font size=-1>", textPos + 18);
                    if (ltrPos >= 0) {
                        int closePos = inputLine.indexOf("<", ltrPos + 14);
                        if (closePos >= 0) {
                            result = inputLine.substring(ltrPos + 14, closePos);
                        }
                    }
                } else {
                    int ltrPos = inputLine.indexOf("&#8212; Location: ");
                    if (ltrPos >= 0) {
                        int closePos = inputLine.indexOf("<br", ltrPos + 18);
                        if (closePos >= 0) {
                            result = inputLine.substring(ltrPos + 18, closePos);
                        }
                    }
                }
            }
            in.close();
            if (result != null) {
                result = result.replaceAll("<b>", "");
                result = result.replaceAll("</b>", "");
                result = result.replaceAll("(&quot;|&#39;)", "'");
                System.out.println("result ---> " + result);
            } else {
                System.out.println("result ---> none!");
                String ss = s.toUpperCase();
                if (ss.startsWith("WHAT IS ")) {
                    String toSearch = ss.substring(8).trim();
                    try {
                        String str =(String)(Object) getResultStr("http://www.google.com/search?hl=en&q=define%3A" + toSearch);
                        str =(String)(Object) cutAfter(str, "on the Web");
                        str =(String)(Object) cutAfter(str, "<li>");
                        str =(String)(Object) getBefore(str, "<br>");
                        result = str.replaceAll("\n", "");
                    } catch (Exception ee) {
                    }
                }
            }
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
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
