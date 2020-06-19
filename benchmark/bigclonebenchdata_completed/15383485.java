


class c15383485 {
public MyHelperClass tsaPassword;

    protected byte[] getTSAResponse(byte[] requestBytes) throws Exception {
        MyHelperClass tsaURL = new MyHelperClass();
        URL url = new URL(tsaURL);
        URLConnection tsaConnection;
        tsaConnection = (URLConnection)(URLConnection)(Object) url.openConnection();
        tsaConnection.setDoInput(true);
        tsaConnection.setDoOutput(true);
        tsaConnection.setUseCaches(false);
        tsaConnection.setRequestProperty("Content-Type", "application/timestamp-query");
        tsaConnection.setRequestProperty("Content-Transfer-Encoding", "binary");
        MyHelperClass tsaUsername = new MyHelperClass();
        if ((tsaUsername != null) && !tsaUsername.equals("")) {
//            MyHelperClass tsaUsername = new MyHelperClass();
            String userPassword = tsaUsername + ":" + tsaPassword;
            MyHelperClass Base64 = new MyHelperClass();
            tsaConnection.setRequestProperty("Authorization", "Basic " + Base64.encodeBytes(userPassword.getBytes()));
        }
        OutputStream out =(OutputStream)(Object) tsaConnection.getOutputStream();
        out.write(requestBytes);
        out.close();
        InputStream inp =(InputStream)(Object) tsaConnection.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead = 0;
        while ((bytesRead =(int)(Object) inp.read(buffer, 0, buffer.length)) >= 0) {
            baos.write(buffer, 0, bytesRead);
        }
        byte[] respBytes =(byte[])(Object) baos.toByteArray();
        String encoding =(String)(Object) tsaConnection.getContentEncoding();
        if (encoding != null && encoding.equalsIgnoreCase("base64")) {
            MyHelperClass Base64 = new MyHelperClass();
            respBytes =(byte[])(Object) Base64.decode(new String(respBytes));
        }
        return respBytes;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodeBytes(byte[] o0){ return null; }
	public MyHelperClass decode(String o0){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
