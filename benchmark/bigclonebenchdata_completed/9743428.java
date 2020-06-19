


class c9743428 {

    public static void saveNetFile(String destUrl, String fileName) throws IOException {
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        HttpURLConnection httpUrl = null;
        int BUFFER_SIZE = 2048;
        URL url = null;
        byte[] buf = new byte[BUFFER_SIZE];
        int size = 0;
        url = new URL(destUrl);
        httpUrl = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        httpUrl.connect();
        bis = new BufferedInputStream(httpUrl.getInputStream());
        java.io.File dest = new java.io.File(fileName).getParentFile();
        if (!dest.exists()) dest.mkdirs();
        fos = new FileOutputStream(fileName);
        while ((size =(int)(Object) bis.read(buf)) != -1) fos.write(buf, 0, size);
        fos.close();
        bis.close();
        httpUrl.disconnect();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
