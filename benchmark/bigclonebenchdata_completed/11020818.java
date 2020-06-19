


class c11020818 {

    public static byte[] excutePostRaw(String targetURL, byte[] postdata) {
        URL url;
        HttpURLConnection connection = null;
        try {
            url = new URL(targetURL);
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", "" + Integer.toString(postdata.length));
            connection.setRequestProperty("Content-Language", "en-US");
            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.write(postdata);
            wr.flush();
            wr.close();
            int amt =(int)(Object) connection.getContentLength();
            InputStream in =(InputStream)(Object) connection.getInputStream();
            MojasiWriter writer = new MojasiWriter();
            byte[] buff = new byte[256];
            while ((int)(Object)writer.size() < amt) {
                int got =(int)(Object) in.read(buff);
                if (got < 0) break;
                writer.pushBytes(buff, got);
                if ((int)(Object)writer.size() > 1) System.out.println();
            }
            in.close();
            connection.disconnect();
            return(byte[])(Object) writer.getBytes();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
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

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class MojasiWriter {

public MyHelperClass size(){ return null; }
	public MyHelperClass pushBytes(byte[] o0, int o1){ return null; }
	public MyHelperClass getBytes(){ return null; }}
