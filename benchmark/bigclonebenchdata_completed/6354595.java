


class c6354595 {
public static MyHelperClass end(MyHelperClass o0){ return null; }
	public static MyHelperClass begin(MyHelperClass o0, String o1, String o2){ return null; }
	public static MyHelperClass endWarn(MyHelperClass o0, Exception o1){ return null; }
public static MyHelperClass LOG;
//	public MyHelperClass end(MyHelperClass o0){ return null; }
//	public MyHelperClass endWarn(MyHelperClass o0, Exception o1){ return null; }
//	public MyHelperClass begin(MyHelperClass o0, String o1, String o2){ return null; }
//public MyHelperClass LOG;

    public static void getURLData(String url, String savePath) throws MalformedURLException, FileNotFoundException, IOException {
        MyHelperClass DEBUG = new MyHelperClass();
        if ((boolean)(Object)DEBUG) begin(LOG, url, savePath);
        InputStream inputSream = null;
        InputStream bufferedInputStrem = null;
        OutputStream fileOutputStream = null;
        try {
            URL urlObj = new URL(url);
            inputSream =(InputStream)(Object) urlObj.openStream();
            bufferedInputStrem =(InputStream)(Object) new BufferedInputStream(inputSream);
            File file = new File(savePath);
            fileOutputStream =(OutputStream)(Object) new FileOutputStream(file);
            byte[] buffer = new byte[0xFFFF];
            for (int len; (len =(int)(Object) bufferedInputStrem.read(buffer)) != -1; ) {
                fileOutputStream.write(buffer, 0, len);
            }
        } finally {
            try {
                if (fileOutputStream != null) fileOutputStream.close();
                if (bufferedInputStrem != null) bufferedInputStrem.close();
                if (inputSream != null) inputSream.close();
            } catch (Exception e) {
                MyHelperClass WARN = new MyHelperClass();
                if ((boolean)(Object)WARN) endWarn(LOG, e);
                e.printStackTrace();
            }
        }
//        MyHelperClass DEBUG = new MyHelperClass();
        if ((boolean)(Object)DEBUG) end(LOG);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
