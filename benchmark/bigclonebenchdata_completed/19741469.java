


class c19741469 {

    public static InputStream getData(DataTransferDescriptor desc, GlobusCredential creds) throws Exception {
        URL url = new URL(desc.getUrl());
        if (url.getProtocol().equals("http")) {
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.connect();
            return(InputStream)(Object) conn.getInputStream();
        } else if (url.getProtocol().equals("https")) {
            if (creds != null) {
                MyHelperClass GSSCredential = new MyHelperClass();
                GlobusGSSCredentialImpl cred = new GlobusGSSCredentialImpl(creds, GSSCredential.INITIATE_AND_ACCEPT);
                GSIHttpURLConnection connection = new GSIHttpURLConnection(url);
                MyHelperClass GSIConstants = new MyHelperClass();
                connection.setGSSMode(GSIConstants.MODE_SSL);
                connection.setCredentials(cred);
                return(InputStream)(Object) connection.getInputStream();
            } else {
                throw new Exception("To use the https protocol to retrieve data from the Transfer Service you must have credentials");
            }
        }
        throw new Exception("Protocol " + url.getProtocol() + " not supported.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INITIATE_AND_ACCEPT;
	public MyHelperClass MODE_SSL;
}

class DataTransferDescriptor {

public MyHelperClass getUrl(){ return null; }}

class GlobusCredential {

}

class InputStream {

}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class GlobusGSSCredentialImpl {

GlobusGSSCredentialImpl(GlobusCredential o0, MyHelperClass o1){}
	GlobusGSSCredentialImpl(){}}

class GSIHttpURLConnection {

GSIHttpURLConnection(){}
	GSIHttpURLConnection(URL o0){}
	public MyHelperClass setGSSMode(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setCredentials(GlobusGSSCredentialImpl o0){ return null; }}
