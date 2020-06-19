


class c8005681 {

    public static String URLtoString(URL url) throws IOException {
        String xml = null;
        if (url != null) {
            URLConnection con =(URLConnection)(Object) url.openConnection();
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.setRequestProperty("User-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
            InputStream is =(InputStream)(Object) con.getInputStream();
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            byte[] bytes = new byte[512];
            for (int i =(int)(Object) is.read(bytes, 0, 512); i != -1; i =(int)(Object) is.read(bytes, 0, 512)) {
                buffer.write(bytes, 0, i);
            }
            xml = new String((String)(Object)buffer.toByteArray());
            is.close();
            buffer.close();
        }
        return xml;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
