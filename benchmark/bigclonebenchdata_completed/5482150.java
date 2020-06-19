


class c5482150 {
public static MyHelperClass getCharCodingFromType(String o0){ return null; }
//public MyHelperClass getCharCodingFromType(String o0){ return null; }

    private static void writeUrl(String filePath, String data, String charCoding, boolean urlIsFile) throws IOException {
        int chunkLength;
        OutputStream os = null;
        try {
            if (!urlIsFile) {
                URL urlObj = new URL(filePath);
                URLConnection uc =(URLConnection)(Object) urlObj.openConnection();
                os =(OutputStream)(Object) uc.getOutputStream();
                if (charCoding == null) {
                    String type =(String)(Object) uc.getContentType();
                    if (type != null) {
                        charCoding =(String)(Object) getCharCodingFromType(type);
                    }
                }
            } else {
                File f = new File(filePath);
                os =(OutputStream)(Object) new FileOutputStream(f);
            }
            Writer w;
            if (charCoding == null) {
                w =(Writer)(Object) new OutputStreamWriter(os);
            } else {
                w =(Writer)(Object) new OutputStreamWriter(os, charCoding);
            }
            w.write(data);
            w.flush();
        } finally {
            if (os != null) os.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class Writer {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(OutputStream o0, String o1){}
	OutputStreamWriter(OutputStream o0){}
	OutputStreamWriter(){}}
