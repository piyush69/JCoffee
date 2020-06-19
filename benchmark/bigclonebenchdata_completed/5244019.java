


class c5244019 {

    public static boolean napiUserCheck(String user, String pass) throws TimeoutException, InterruptedException, IOException {
        URLConnection conn = null;
        InputStream in = null;
        URL url = new URL("http://www.napiprojekt.pl/users_check.php?nick=" + user + "&pswd=" + pass);
        MyHelperClass Global = new MyHelperClass();
        conn =(URLConnection)(Object) url.openConnection(Global.getProxy());
        MyHelperClass Timeouts = new MyHelperClass();
        in =(InputStream)(Object) Timeouts.getInputStream(conn);
        byte[] buffer = new byte[1024];
        in.read(buffer, 0, 1024);
        if (in != null) {
            in.close();
        }
        String response = new String(buffer);
        if (response.indexOf("ok") == 0) {
            return true;
        } else {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(URLConnection o0){ return null; }
	public MyHelperClass getProxy(){ return null; }}

class TimeoutException extends Exception{
	public TimeoutException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(MyHelperClass o0){ return null; }}
