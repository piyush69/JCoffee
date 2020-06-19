


class c21033686 {

    public File read() throws IOException {
        MyHelperClass url = new MyHelperClass();
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        conn.setConnectTimeout(5000);
        conn.setReadTimeout(5000);
        conn.connect();
        int length =(int)(Object) conn.getContentLength();
        String tempDir = System.getProperty("java.io.tmpdir");
        if (tempDir == null) {
            tempDir = ".";
        }
        File tempFile = new File(tempDir + "/" + new GUID() + ".dat");
        tempFile.deleteOnExit();
        InputStream in = null;
        OutputStream out = null;
        MyHelperClass parentComponent = new MyHelperClass();
        ProgressMonitor monitor = new ProgressMonitor(parentComponent, "Downloading " + url, null, 0, length);
        try {
            in =(InputStream)(Object) conn.getInputStream();
            out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(tempFile));
            int buflen = 1024 * 30;
            int bytesRead = 0;
            byte[] buf = new byte[buflen];
            ;
            long start = System.currentTimeMillis();
            for (int nRead =(int)(Object) in.read(buf); nRead != -1; nRead =(int)(Object) in.read(buf)) {
                if ((boolean)(Object)monitor.isCanceled()) {
                    return null;
                }
                bytesRead += nRead;
                out.write(buf, 0, nRead);
                monitor.setProgress(bytesRead);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
            monitor.close();
        }
        return tempFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass deleteOnExit(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class GUID {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ProgressMonitor {

ProgressMonitor(){}
	ProgressMonitor(MyHelperClass o0, String o1, Object o2, int o3, int o4){}
	public MyHelperClass isCanceled(){ return null; }
	public MyHelperClass setProgress(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
