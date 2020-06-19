


class c15129123 {
public MyHelperClass url;

    public String doGet() throws MalformedURLException, IOException {
        HttpURLConnection uc;// = new HttpURLConnection();
        uc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
//        MyHelperClass uc = new MyHelperClass();
        BufferedInputStream buffer = new BufferedInputStream(uc.getInputStream());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int c;
        while ((c =(int)(Object) buffer.read()) != -1) {
            bos.write(c);
        }
        bos.close();
        MyHelperClass headers = new MyHelperClass();
        headers = uc.getHeaderFields();
        MyHelperClass status = new MyHelperClass();
        status = uc.getResponseCode();
        return bos.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHeaderFields(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}
	public MyHelperClass read(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class HttpURLConnection {

public MyHelperClass getHeaderFields(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}
