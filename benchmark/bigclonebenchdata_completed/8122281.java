


class c8122281 {

    public String get(String s, String encoding) throws Exception {
        if (!s.startsWith("http")) return "";
        StringBuilder sb = new StringBuilder();
        try {
            String result = null;
            URL url = new URL(s);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
            connection.setDoOutput(false);
            if (encoding == null) encoding = "UTF-8";
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding));
            String inputLine;
            String contentType =(String)(Object) connection.getContentType();
            if (contentType.startsWith("text") || contentType.startsWith("application/xml")) {
                while ((inputLine =(String)(Object) in.readLine()) != null) {
                    sb.append(inputLine);
                    sb.append("\n");
                }
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return sb.toString();
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

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}
