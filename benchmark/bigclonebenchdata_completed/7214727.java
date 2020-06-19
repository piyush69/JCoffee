


class c7214727 {

    public byte[] pipeBytes() {
        byte ba[] = null;
        try {
            MyHelperClass server = new MyHelperClass();
            URL url = new URL(server);
            HttpURLConnection conn;// = new HttpURLConnection();
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
//            MyHelperClass conn = new MyHelperClass();
            InputStream is =(InputStream)(Object) conn.getInputStream();
            ByteArrayOutputStream tout = new ByteArrayOutputStream();
            int nmax = 10000;
            byte b[] = new byte[nmax + 1];
            int nread = 0;
            while ((nread =(int)(Object) is.read(b, 0, nmax)) >= 0) tout.write(b, 0, nread);
            ba =(byte[])(Object) tout.toByteArray();
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return ba;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }}
