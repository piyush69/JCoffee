


class c9760847 {

    public static String getServerVersion() throws IOException {
        URL url;
        MyHelperClass CHECKVERSIONURL = new MyHelperClass();
        url = new URL(CHECKVERSIONURL);
        HttpURLConnection httpURLConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        InputStream in =(InputStream)(Object) httpURLConnection.getInputStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, out);
        out.flush();
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(in);
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(out);
        String buffer;
        String[] lines;
        String version = "";
        buffer = out.toString();
        MyHelperClass StringUtils = new MyHelperClass();
        lines =(String[])(Object) StringUtils.split(buffer);
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].startsWith("version=")) {
                version = lines[i].substring(8).trim();
                break;
            }
        }
        return version;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass split(String o0){ return null; }
	public MyHelperClass closeQuietly(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class ByteArrayOutputStream {

public MyHelperClass flush(){ return null; }}
