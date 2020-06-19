


class c18893033 {
public MyHelperClass fail(String o0){ return null; }

    private void doDissemTest(String what, boolean redirectOK) throws Exception {
        final int num = 30;
        System.out.println("Getting " + what + " " + num + " times...");
        int i = 0;
        try {
            MyHelperClass BASE_URL = new MyHelperClass();
            URL url = new URL(BASE_URL + "/get/" + what);
            for (i = 0; i < num; i++) {
                HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                InputStream in =(InputStream)(Object) conn.getInputStream();
                in.read();
                in.close();
                conn.disconnect();
            }
        } catch (Exception e) {
            fail("Dissemination of " + what + " failed on iter " + i + ": " + e.getMessage());
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

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}
