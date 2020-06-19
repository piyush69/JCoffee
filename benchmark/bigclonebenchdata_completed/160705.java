


class c160705 {

    public static boolean downloadFile(String url, String destination) throws Exception {
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        File destfile;
        byte BUFFER[] = new byte[100];
        java.net.URL fileurl;
        URLConnection conn;
        fileurl = new java.net.URL(url);
        conn =(URLConnection)(Object) fileurl.openConnection();
        long fullsize =(long)(Object) conn.getContentLength();
        long onepercent = fullsize / 100;
        MyHelperClass MessageFrame = new MyHelperClass();
        MessageFrame.setTotalDownloadSize(fullsize);
        bi = new BufferedInputStream(conn.getInputStream());
        destfile = new File(destination);
        if (!(Boolean)(Object)destfile.createNewFile()) {
            destfile.delete();
            destfile.createNewFile();
        }
        bo = new BufferedOutputStream(new FileOutputStream(destfile));
        int read = 0;
        int sum = 0;
        long i = 0;
        while ((read =(int)(Object) bi.read(BUFFER)) != -1) {
            bo.write(BUFFER, 0, read);
            sum += read;
            i += read;
            if (i > onepercent) {
                i = 0;
//                MyHelperClass MessageFrame = new MyHelperClass();
                MessageFrame.setDownloadProgress(sum);
            }
        }
        bi.close();
        bo.close();
//        MyHelperClass MessageFrame = new MyHelperClass();
        MessageFrame.setDownloadProgress(fullsize);
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDownloadProgress(int o0){ return null; }
	public MyHelperClass setTotalDownloadSize(long o0){ return null; }
	public MyHelperClass setDownloadProgress(long o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
