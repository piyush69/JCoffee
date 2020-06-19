


class c460972 {

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://imo.im/");
        URLConnection con =(URLConnection)(Object) url.openConnection();
        InputStream is =(InputStream)(Object) con.getInputStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while (((len =(int)(Object) is.read(buffer)) >= 0)) {
            out.write(buffer, 0, len);
        }
        out.flush();
        System.out.println(out.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass flush(){ return null; }}
