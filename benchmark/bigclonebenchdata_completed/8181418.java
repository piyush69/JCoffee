


class c8181418 {

    public static final byte[] getBytesFromUrl(final String urlString) throws BT747Exception {
        byte[] result = null;
        try {
            final URL url = new URL(urlString);
            final URLConnection urlc =(URLConnection)(Object) url.openConnection();
            MyHelperClass timeout = new MyHelperClass();
            urlc.setConnectTimeout(timeout);
//            MyHelperClass timeout = new MyHelperClass();
            urlc.setReadTimeout(timeout);
            final InputStream ins =(InputStream)(Object) urlc.getInputStream();
            final ByteArrayOutputStream bout = new ByteArrayOutputStream(120 * 1024);
            final byte[] buf = new byte[1024];
            while (true) {
                final int n =(int)(Object) ins.read(buf);
                if (n == -1) {
                    break;
                }
                bout.write(buf, 0, n);
            }
            result =(byte[])(Object) bout.toByteArray();
            bout.close();
        } catch (final Exception e) {
            MyHelperClass I18N = new MyHelperClass();
            throw new BT747Exception(I18N.i18n("Problem downloading AGPS data."), e);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass i18n(String o0){ return null; }}

class BT747Exception extends Exception{
	public BT747Exception(String errorMessage) { super(errorMessage); }
	BT747Exception(){}
	BT747Exception(MyHelperClass o0, Exception o1){}
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class ByteArrayOutputStream {

ByteArrayOutputStream(){}
	ByteArrayOutputStream(int o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
