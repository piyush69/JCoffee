


class c18611368 {

    private static void downloadFile(URL url, File destFile) throws Exception {
        try {
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
                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.copyFile(tmpFile, destFile);
            } finally {
                if (tmpFile != null) {
                    tmpFile.delete();
                }
            }
        } catch (Exception ex) {
            throw new RuntimeException("Could not download URL: " + url, ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, Object o1){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class File {

public MyHelperClass delete(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
