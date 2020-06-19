


class c8515891 {
public MyHelperClass password;
	public MyHelperClass read(InputStream o0){ return null; }

    protected String readUrl(String svnUrl) throws IOException {
        URL url = new URL(svnUrl);
        URLConnection uc =(URLConnection)(Object) url.openConnection();
        if (url.getProtocol().equals("https")) {
            MyHelperClass user = new MyHelperClass();
            String userPassword = user + ":" + password;
            String encoding = new sun.misc.BASE64Encoder().encode(userPassword.getBytes());
            uc.setRequestProperty("Authorization", "Basic " + encoding);
        }
        InputStream is = null;
        String in = null;
        try {
            is =(InputStream)(Object) uc.getInputStream();
            in =(String)(Object) read(is);
        } finally {
            try {
                is.close();
            } catch (Exception e) {
            }
        }
        return in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
