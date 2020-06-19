


class c1023350 {

    public static void download(URL url, File file, String userAgent) throws IOException {
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        if (userAgent != null) {
            conn.setRequestProperty("User-Agent", userAgent);
        }
        InputStream in =(InputStream)(Object) conn.getInputStream();
        FileOutputStream out = new FileOutputStream(file);
        MyHelperClass StreamUtil = new MyHelperClass();
        StreamUtil.copyThenClose(in, out);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyThenClose(InputStream o0, FileOutputStream o1){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
