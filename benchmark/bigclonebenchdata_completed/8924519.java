


class c8924519 {

    private String grabInformationFromWeb(String query, String infoName) throws Exception {
        String result = "";
        URL url = new URL(query);
        HttpURLConnection request = null;
        request = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        if (request != null) {
            InputStream in =(InputStream)(Object) url.openStream();
            int c = 0;
            StringBuilder sb = new StringBuilder();
            while ((c =(int)(Object) in.read()) != -1) {
                sb = sb.append((char) c);
            }
            String s = sb.toString();
            MyHelperClass Utils = new MyHelperClass();
            result =(String)(Object) Utils.getTagValue(s, "<" + infoName + ">", "</" + infoName + ">");
            in.close();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTagValue(String o0, String o1, String o2){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}
