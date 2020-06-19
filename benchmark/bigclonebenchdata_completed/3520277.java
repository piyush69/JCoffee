


class c3520277 {
public MyHelperClass Logger;
	public MyHelperClass listener;
	public MyHelperClass updateDirectory;
	public MyHelperClass threadName;
	public MyHelperClass setWasInterrupted(){ return null; }
	public MyHelperClass interrupt(){ return null; }
	public MyHelperClass isInterrupted(){ return null; }

    private void downloadFile(String directory, String fileName) {
        URL url = null;
        MyHelperClass updateURL = new MyHelperClass();
        String urlstr = updateURL + directory + fileName;
        int position = 0;
        try {
            MyHelperClass threadName = new MyHelperClass();
            Logger.msg(threadName + "Download new file from " + urlstr);
            url = new URL(urlstr);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            BufferedInputStream in = new BufferedInputStream(conn.getInputStream());
            MyHelperClass updateDirectory = new MyHelperClass();
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(updateDirectory + System.getProperty("file.separator") + fileName));
            int i =(int)(Object) in.read();
            while (i != -1) {
                if ((boolean)(Object)isInterrupted()) {
                    setWasInterrupted();
                    in.close();
                    out.flush();
                    out.close();
                    interrupt();
                    return;
                }
                out.write(i);
                i =(int)(Object) in.read();
                position += 1;
                if (position % 1000 == 0) {
                    Enumeration en =(Enumeration)(Object) listener.elements();
                    while ((boolean)(Object)en.hasMoreElements()) {
                        DownloadFilesListener currentListener =(DownloadFilesListener)(Object) en.nextElement();
                        currentListener.progress(1000);
                    }
                }
            }
            Enumeration en =(Enumeration)(Object) listener.elements();
            while ((boolean)(Object)en.hasMoreElements()) {
                DownloadFilesListener currentListener =(DownloadFilesListener)(Object) en.nextElement();
                currentListener.progress(1000);
            }
            in.close();
            out.flush();
            out.close();
            Logger.msg(threadName + "Saved file " + fileName + " to " + updateDirectory + System.getProperty("file.separator") + fileName);
        } catch (Exception e) {
            Logger.err(threadName + "Error (" + e.toString() + ")");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass elements(){ return null; }
	public MyHelperClass err(String o0){ return null; }
	public MyHelperClass msg(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class DownloadFilesListener {

public MyHelperClass progress(int o0){ return null; }}
