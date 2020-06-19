


class c21064899 {
public static MyHelperClass initModelHash(){ return null; }
	public static MyHelperClass createFullPath(String o0, String o1){ return null; }
//public MyHelperClass initModelHash(){ return null; }
//	public MyHelperClass createFullPath(String o0, String o1){ return null; }

    protected static String getURLandWriteToDisk(String url, Model retModel) throws MalformedURLException, IOException {
        String path = null;
        URL ontURL = new URL(url);
        InputStream ins =(InputStream)(Object) ontURL.openStream();
        InputStreamReader bufRead;
        OutputStreamWriter bufWrite;
        int offset = 0, read = 0;
        initModelHash();
        if (System.getProperty("user.dir") != null) {
            String delimiter;
            path = System.getProperty("user.dir");
            if (path.contains("/")) {
                delimiter = "/";
            } else {
                delimiter = "\\";
            }
            char c = path.charAt(path.length() - 1);
            if (c == '/' || c == '\\') {
                path = path.substring(0, path.length() - 2);
            }
            path = path.substring(0, path.lastIndexOf(delimiter) + 1);
            path = path.concat("ontologies" + delimiter + "downloaded");
            (new File(path)).mkdir();
            path = path.concat(delimiter);
            path =(String)(Object) createFullPath(url, path);
            bufWrite = new OutputStreamWriter(new FileOutputStream(path));
            bufRead = new InputStreamReader(ins);
            read =(int)(Object) bufRead.read();
            while (read != -1) {
                bufWrite.write(read);
                offset += read;
                read =(int)(Object) bufRead.read();
            }
            bufRead.close();
            bufWrite.close();
            ins.close();
            FileInputStream fs = new FileInputStream(path);
            retModel.read(fs, "");
        }
        return path;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Model {

public MyHelperClass read(FileInputStream o0, String o1){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0){}
	OutputStreamWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdir(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
