


class c15826295 {

    public static boolean isLinkHtmlContent(String address) {
        boolean isHtml = false;
        URLConnection conn = null;
        try {
            if (!address.startsWith("http://")) {
                address = "http://" + address;
            }
            URL url = new URL(address);
            conn =(URLConnection)(Object) url.openConnection();
            if (conn.getContentType().equals("text/html") && !(Boolean)(Object)conn.getHeaderField(0).contains("404")) {
                isHtml = true;
            }
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Address attempted: " + conn.getURL());
//            MyHelperClass logger = new MyHelperClass();
            logger.error("Error Message: " + e.getMessage());
        }
        return isHtml;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class URLConnection {

public MyHelperClass getHeaderField(int o0){ return null; }
	public MyHelperClass getURL(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
