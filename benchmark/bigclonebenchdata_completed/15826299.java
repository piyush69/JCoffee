


class c15826299 {

    public static void printResponseHeaders(String address) {
        MyHelperClass logger = new MyHelperClass();
        logger.info("Address: " + address);
        try {
            URL url = new URL(address);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            for (int i = 0; ; i++) {
                String headerName =(String)(Object) conn.getHeaderFieldKey(i);
                String headerValue =(String)(Object) conn.getHeaderField(i);
                if (headerName == null && headerValue == null) {
                    break;
                }
                if (headerName == null) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.info(headerValue);
                    continue;
                }
//                MyHelperClass logger = new MyHelperClass();
                logger.info(headerName + " " + headerValue);
            }
        } catch (Exception e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error("Exception Message: " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getHeaderField(int o0){ return null; }
	public MyHelperClass getHeaderFieldKey(int o0){ return null; }}
