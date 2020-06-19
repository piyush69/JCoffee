
import java.io.UncheckedIOException;


class c10246006 {
public static MyHelperClass Translator;
	public static MyHelperClass pump(InputStream o0, ByteArrayOutputStream o1){ return null; }
//public MyHelperClass Translator;
//	public MyHelperClass pump(InputStream o0, ByteArrayOutputStream o1){ return null; }

    public static synchronized String getURLContent(URL url) {
        MyHelperClass LogUtil = new MyHelperClass();
        Log log =(Log)(Object) LogUtil.getLog(FileManager.class, "getURLContent");
        if (url == null) {
            throw new IllegalArgumentException("url shouldn't be null!");
        }
        MyHelperClass urlCache = new MyHelperClass();
        String content = (String)(String)(Object) urlCache.get(url);
        if (content != null) {
            return content;
        }
        try {
            InputStream is = null;
            if ("file".equals(url.getProtocol())) {
                is =(InputStream)(Object) new java.io.FileInputStream((String)(Object)url.getFile());
            } else {
                is =(InputStream)(Object) url.openStream();
            }
            ByteArrayOutputStream baos = new ByteArrayOutputStream(is.available());
            pump(is, baos);
            content = new String((String)(Object)baos.toByteArray());
//            MyHelperClass urlCache = new MyHelperClass();
            urlCache.put(url, content);
            return content;
        } catch (UncheckedIOException e) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            MyHelperClass XDocletUtilMessages = new MyHelperClass();
            log.error(Translator.getString(XDocletMessages.class, XDocletUtilMessages.EXCEPTION_READING_MERGE_FILE, new String[] { e.toString() }));
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EXCEPTION_READING_MERGE_FILE;
public MyHelperClass getString(Class<XDocletMessages> o0, MyHelperClass o1, String[] o2){ return null; }
	public MyHelperClass get(URL o0){ return null; }
	public MyHelperClass getLog(Class<FileManager> o0, String o1){ return null; }
	public MyHelperClass put(URL o0, String o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class Log {

public MyHelperClass error(MyHelperClass o0){ return null; }}

class FileManager {

}

class InputStream {

public MyHelperClass available(){ return null; }}

class ByteArrayOutputStream {

ByteArrayOutputStream(MyHelperClass o0){}
	ByteArrayOutputStream(){}
	public MyHelperClass toByteArray(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class XDocletMessages {

}
