


class c14464131 {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://hostname:80");
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            for (int i = 0; ; i++) {
                String headerName =(String)(Object) conn.getHeaderFieldKey(i);
                String headerValue =(String)(Object) conn.getHeaderField(i);
                if (headerName == null && headerValue == null) {
                    break;
                }
                if (headerName == null) {
                }
            }
        } catch (Exception e) {
        }
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

public MyHelperClass getHeaderField(int o0){ return null; }
	public MyHelperClass getHeaderFieldKey(int o0){ return null; }}
