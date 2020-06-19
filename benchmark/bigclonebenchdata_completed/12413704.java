


class c12413704 {
public static MyHelperClass readReader(Reader o0, int o1){ return null; }
public static MyHelperClass registeredStreams;
	public static MyHelperClass getCharCodingFromType(String o0){ return null; }
//	public MyHelperClass readReader(Reader o0, int o1){ return null; }
//public MyHelperClass registeredStreams;
//	public MyHelperClass getCharCodingFromType(String o0){ return null; }

    private static String readUrl(String filePath, String charCoding, boolean urlIsFile) throws IOException {
        int chunkLength;
        InputStream is = null;
        try {
            if (!urlIsFile) {
                URL urlObj = new URL(filePath);
                URLConnection uc =(URLConnection)(Object) urlObj.openConnection();
                is =(InputStream)(Object) uc.getInputStream();
                chunkLength =(int)(Object) uc.getContentLength();
                if (chunkLength <= 0) chunkLength = 1024;
                if (charCoding == null) {
                    String type =(String)(Object) uc.getContentType();
                    if (type != null) {
                        charCoding =(String)(Object) getCharCodingFromType(type);
                    }
                }
            } else {
                if ((boolean)(Object)registeredStreams.containsKey(filePath)) {
                    is =(InputStream)(Object) registeredStreams.get(filePath);
                    chunkLength = 4096;
                } else {
                    File f = new File(filePath);
                    long length =(long)(Object) f.length();
                    chunkLength = (int) length;
                    if (chunkLength != length) throw new IOException("Too big file size: " + length);
                    if (chunkLength == 0) {
                        return "";
                    }
                    is =(InputStream)(Object) new FileInputStream(f);
                }
            }
            Reader r;
            if (charCoding == null) {
                r =(Reader)(Object) new InputStreamReader(is);
            } else {
                r =(Reader)(Object) new InputStreamReader(is, charCoding);
            }
            return(String)(Object) readReader(r, chunkLength);
        } finally {
            if (is != null) is.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass length(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class Reader {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}
