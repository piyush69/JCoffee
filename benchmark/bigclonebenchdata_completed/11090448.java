


class c11090448 {
public static MyHelperClass CACHELOCATION;
	public static MyHelperClass fetch(String o0){ return null; }
	public static MyHelperClass checkAndCreateDirectoryIfNeeded(){ return null; }
	public static MyHelperClass md5(String o0){ return null; }
//public MyHelperClass CACHELOCATION;
//	public MyHelperClass md5(String o0){ return null; }
//	public MyHelperClass fetch(String o0){ return null; }
//	public MyHelperClass checkAndCreateDirectoryIfNeeded(){ return null; }

    public static Object fetchCached(String address, int hours) throws MalformedURLException, IOException {
        String cacheName =(String)(Object) md5(address);
        checkAndCreateDirectoryIfNeeded();
        File r = new File(CACHELOCATION + cacheName);
        Date d = new Date();
        long limit =(int)(Object) d.getTime() - (1000 * 60 * 60 * hours);
        if (!(Boolean)(Object)r.exists() || (hours != -1 &&(long)(Object) r.lastModified() < limit)) {
            InputStream is = (InputStream)(InputStream)(Object) fetch(address);
            FileOutputStream fos = new FileOutputStream(CACHELOCATION + cacheName);
            int nextChar;
            while ((nextChar =(int)(Object) is.read()) != -1) fos.write((char) nextChar);
            fos.flush();
        }
        FileInputStream fis = new FileInputStream(CACHELOCATION + cacheName);
        return fis;
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

class File {

File(String o0){}
	File(){}
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass exists(){ return null; }}

class Date {

public MyHelperClass getTime(){ return null; }}

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
