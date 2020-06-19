


class c21085213 {

    private void downloadFile(String name, URL url, File file) throws IOException {
        InputStream in = null;
        FileOutputStream out = null;
        try {
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setConnectTimeout(10000);
            conn.setReadTimeout(10000);
            int expectedSize =(int)(Object) conn.getContentLength();
            MyHelperClass progressPanel = new MyHelperClass();
            progressPanel.downloadStarting(name, expectedSize == -1);
            int downloaded = 0;
            byte[] buf = new byte[1024];
            int length;
            in =(InputStream)(Object) conn.getInputStream();
            out = new FileOutputStream(file);
            while ((in != null) && ((length =(int)(Object) in.read(buf)) != -1)) {
                downloaded += length;
                out.write(buf, 0, length);
//                MyHelperClass progressPanel = new MyHelperClass();
                if (expectedSize != -1) progressPanel.downloadProgress((downloaded * 100) / expectedSize);
            }
            out.flush();
        } finally {
            MyHelperClass progressPanel = new MyHelperClass();
            progressPanel.downloadFinished();
            if (out != null) out.close();
            if (in != null) in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass downloadFinished(){ return null; }
	public MyHelperClass downloadStarting(String o0, boolean o1){ return null; }
	public MyHelperClass downloadProgress(int o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}
