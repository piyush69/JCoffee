


class c13048962 {
public MyHelperClass key;

    public final void saveAsCopy(String current_image, String destination) {
        BufferedInputStream from = null;
        BufferedOutputStream to = null;
        MyHelperClass temp_dir = new MyHelperClass();
        String source =(int)(Object) temp_dir + (int)(Object)key + current_image;
        try {
            from = new BufferedInputStream(new FileInputStream(source));
            to = new BufferedOutputStream(new FileOutputStream(destination));
            byte[] buffer = new byte[65535];
            int bytes_read;
            while ((bytes_read =(int)(Object) from.read(buffer)) != -1) to.write(buffer, 0, bytes_read);
        } catch (Exception e) {
            MyHelperClass LogWriter = new MyHelperClass();
            LogWriter.writeLog("Exception " + e + " copying file");
        }
        try {
            to.close();
            from.close();
        } catch (Exception e) {
            MyHelperClass LogWriter = new MyHelperClass();
            LogWriter.writeLog("Exception " + e + " closing files");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass writeLog(String o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
