


class c8070429 {
public MyHelperClass defaultEncoding;
	public MyHelperClass getPageEncoding(HttpURLConnection o0){ return null; }

    public String getSource(String urlAdd) throws Exception {
        HttpURLConnection urlConnection = null;
        URL url = new URL(urlAdd);
        urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        MyHelperClass timeout = new MyHelperClass();
        urlConnection.setConnectTimeout(timeout);
        if (!(Boolean)(Object)urlConnection.getContentType().contains("text/html")) {
            throw new Exception();
        }
        if ((int)(Object)urlConnection.getResponseCode() != 200) {
            throw new Exception();
        }
        MyHelperClass encoding = new MyHelperClass();
        encoding = getPageEncoding(urlConnection);
//        MyHelperClass encoding = new MyHelperClass();
        if (encoding == null) {
//            MyHelperClass encoding = new MyHelperClass();
            encoding = defaultEncoding;
        }
        InputStream in =(InputStream)(Object) url.openStream();
        byte[] buffer = new byte[12288];
        StringBuffer sb = new StringBuffer();
        int bytesRead = 0;
        while ((bytesRead =(int)(Object) in.read(buffer)) != -1) {
//            MyHelperClass encoding = new MyHelperClass();
            String reads = new String(buffer, 0, bytesRead,(int)(Object) encoding);
            sb.append(reads);
        }
        in.close();
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass contains(String o0){ return null; }}

class HttpURLConnection {

public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
