


class c6951110 {
public MyHelperClass Base16;
	public MyHelperClass validate(EPoint o0){ return null; }

    public ValidEPoint[] split(EPoint o, EPoint e1, long v1, EPoint e2) throws MalformedURLException, IOException, NoSuchAlgorithmException, InvalidEPointCertificateException, InvalidKeyException, SignatureException {
        MyHelperClass url = new MyHelperClass();
        URLConnection u =(URLConnection)(Object) (new URL(url, "action").openConnection());
        OutputStream os;
        InputStream is;
        ValidEPoint[] v = new ValidEPoint[2];
        u.setDoOutput(true);
        u.setDoInput(true);
        u.setAllowUserInteraction(false);
        os =(OutputStream)(Object) u.getOutputStream();
        MyHelperClass URLEncoder = new MyHelperClass();
        os.write(("B=" + URLEncoder.encode(o.toString(), "UTF-8") + "&D=" + Base16.encode(e1.getMD()) + "&F=" + Long.toString(v1) + "&C=" + Base16.encode(e2.getMD())).getBytes());
        os.close();
        is =(InputStream)(Object) u.getInputStream();
        v[1] = new ValidEPoint(this, e2, is);
        is.close();
        v[0] =(ValidEPoint)(Object) validate(e1);
        return v;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(MyHelperClass o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class EPoint {

public MyHelperClass getMD(){ return null; }}

class ValidEPoint {

ValidEPoint(){}
	ValidEPoint(c6951110 o0, EPoint o1, InputStream o2){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class InvalidEPointCertificateException extends Exception{
	public InvalidEPointCertificateException(String errorMessage) { super(errorMessage); }
}

class InvalidKeyException extends Exception{
	public InvalidKeyException(String errorMessage) { super(errorMessage); }
}

class SignatureException extends Exception{
	public SignatureException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setAllowUserInteraction(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openConnection(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
