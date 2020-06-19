


class c5675396 {
public MyHelperClass fail(String o0){ return null; }

    private void putFile(String location, String file) throws Exception {
        System.out.println("Put file to " + location);
        URL url = new URL(location);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setRequestMethod("PUT");
        conn.setDoOutput(true);
        MyHelperClass RDFFormat = new MyHelperClass();
        RDFFormat dataFormat =(RDFFormat)(Object) RDFFormat.forFileName(file, RDFFormat.RDFXML);
        conn.setRequestProperty("Content-Type", dataFormat.getDefaultMIMEType());
        InputStream dataStream =(InputStream)(Object) ProtocolTest.class.getResourceAsStream(file);
        try {
            OutputStream connOut =(OutputStream)(Object) conn.getOutputStream();
            try {
                MyHelperClass IOUtil = new MyHelperClass();
                IOUtil.transfer(dataStream, connOut);
            } finally {
                connOut.close();
            }
        } finally {
            dataStream.close();
        }
        conn.connect();
        int responseCode =(int)(Object) conn.getResponseCode();
        MyHelperClass HttpURLConnection = new MyHelperClass();
        if (responseCode != (int)(Object)HttpURLConnection.HTTP_OK && responseCode != (int)(Object)HttpURLConnection.HTTP_NO_CONTENT) {
            String response = "location " + location + " responded: " + conn.getResponseMessage() + " (" + responseCode + ")";
            fail(response);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
	public MyHelperClass HTTP_NO_CONTENT;
	public MyHelperClass RDFXML;
public MyHelperClass transfer(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass forFileName(String o0, MyHelperClass o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }}

class RDFFormat {

public MyHelperClass getDefaultMIMEType(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class ProtocolTest {

}

class OutputStream {

public MyHelperClass close(){ return null; }}
