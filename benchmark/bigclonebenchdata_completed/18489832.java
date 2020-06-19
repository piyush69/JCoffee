


class c18489832 {
public static MyHelperClass unzip(File o0, File o1){ return null; }
//public MyHelperClass unzip(File o0, File o1){ return null; }

    private static URL downLoadZippedFile(URL url, File destDir) throws Exception {
        URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
        File tmpFile = null;
        try {
            MyHelperClass File = new MyHelperClass();
            tmpFile =(File)(Object) File.createTempFile("remoteLib_", null);
            InputStream in = null;
            FileOutputStream out = null;
            try {
                in =(InputStream)(Object) urlConnection.getInputStream();
                out = new FileOutputStream(tmpFile);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
            } finally {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            }
            unzip(tmpFile, destDir);
        } finally {
            if (tmpFile != null) {
                tmpFile.delete();
            }
        }
        URL localURL =(URL)(Object) destDir.toURI().toURL();
        return localURL;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, Object o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass toURL(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class File {

public MyHelperClass toURI(){ return null; }
	public MyHelperClass delete(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
