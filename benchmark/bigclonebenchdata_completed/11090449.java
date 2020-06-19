


class c11090449 {
public static MyHelperClass Log;
public static MyHelperClass CACHELOCATION;
	public static MyHelperClass Drawable;
//	public MyHelperClass Log;
	public static MyHelperClass md5(String o0){ return null; }
	public static MyHelperClass fetch(String o0){ return null; }
	public static MyHelperClass checkAndCreateDirectoryIfNeeded(){ return null; }
//public MyHelperClass CACHELOCATION;
//	public MyHelperClass Drawable;
//	public MyHelperClass md5(String o0){ return null; }
//	public MyHelperClass checkAndCreateDirectoryIfNeeded(){ return null; }
//	public MyHelperClass fetch(String o0){ return null; }

    public static Drawable fetchCachedDrawable(String url) throws MalformedURLException, IOException {
        MyHelperClass LOG_TAG = new MyHelperClass();
        Log.d(LOG_TAG, "Fetching cached : " + url);
        String cacheName =(String)(Object) md5(url);
        checkAndCreateDirectoryIfNeeded();
        File r = new File(CACHELOCATION + cacheName);
        if (!(Boolean)(Object)r.exists()) {
            InputStream is = (InputStream)(InputStream)(Object) fetch(url);
            FileOutputStream fos = new FileOutputStream(CACHELOCATION + cacheName);
            int nextChar;
            while ((nextChar =(int)(Object) is.read()) != -1) fos.write((char) nextChar);
            fos.flush();
        }
        FileInputStream fis = new FileInputStream(CACHELOCATION + cacheName);
        Drawable d =(Drawable)(Object) Drawable.createFromStream(fis, "src");
        return d;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createFromStream(FileInputStream o0, String o1){ return null; }
	public MyHelperClass d(MyHelperClass o0, String o1){ return null; }}

class Drawable {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(char o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
