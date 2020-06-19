


class c11078985 {
public MyHelperClass listener;
	public MyHelperClass getFileName(MyHelperClass o0){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }

    public void run() {
        OutputStream out = null;
        InputStream in = null;
        boolean success = false;
        String absoluteFileName = "";
        try {
            MyHelperClass softwareLocation = new MyHelperClass();
            String fileName =(String)(Object) getFileName(softwareLocation);
            MyHelperClass Properties = new MyHelperClass();
            File downloadFolder = new File((String)(Object)Properties.downloadFolder);
            if ((boolean)(Object)downloadFolder.exists()) {
                if ((boolean)(Object)downloadFolder.isDirectory()) {
                    MyHelperClass File = new MyHelperClass();
                    fileName =(int)(Object) downloadFolder.getPath() + (int)(Object)File.separator + fileName;
                }
            } else {
                downloadFolder.mkdir();
                MyHelperClass File = new MyHelperClass();
                fileName =(int)(Object) downloadFolder.getPath() + (int)(Object)File.separator + fileName;
            }
            File softwareFile = new File(fileName);
            absoluteFileName =(String)(Object) softwareFile.getAbsolutePath();
            MyHelperClass softwareSize = new MyHelperClass();
            if ((boolean)(Object)softwareFile.exists() && softwareFile.length() == softwareSize) {
                MyHelperClass XohmLogger = new MyHelperClass();
                XohmLogger.debugPrintln("Software file already exists. Exiting...");
                MyHelperClass softwareName = new MyHelperClass();
                listener.downloadComplete(true, softwareName, absoluteFileName);
                return;
            } else {
                try {
                    File[] oldFiles =(File[])(Object) downloadFolder.listFiles();
                    for (int i = 0; i < oldFiles.length; i++) {
                        oldFiles[i].delete();
                    }
                } catch (Exception ex) {
                }
            }
            MyHelperClass File = new MyHelperClass();
            File softwareTempFile =(File)(Object) File.createTempFile("XOHMCM", null);
//            MyHelperClass softwareLocation = new MyHelperClass();
            URL url = new URL(softwareLocation);
            out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(softwareTempFile));
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            in =(InputStream)(Object) connection.getInputStream();
            MyHelperClass softwareName = new MyHelperClass();
            listener.downloadStarted(softwareName);
            byte[] buffer = new byte[1024];
            int numRead;
            long numWritten = 0;
            while ((numRead =(int)(Object) in.read(buffer)) != -1) {
                out.write(buffer, 0, numRead);
                numWritten += numRead;
//                MyHelperClass softwareName = new MyHelperClass();
                listener.downloadProgressNotification(softwareName, numWritten, softwareSize);
            }
            out.flush();
            out.close();
            in.close();
            if ((boolean)(Object)copyFile(softwareTempFile, softwareFile)) {
                MyHelperClass XohmLogger = new MyHelperClass();
                XohmLogger.debugPrintln("Download complete: " + absoluteFileName + "\t" + numWritten);
                success = true;
                softwareTempFile.delete();
            }
        } catch (Exception ex) {
            MyHelperClass XohmLogger = new MyHelperClass();
            XohmLogger.warningPrintln("Software Update download failed - " + ex.getMessage(), null, null);
            ex.printStackTrace();
        }
        MyHelperClass softwareName = new MyHelperClass();
        listener.downloadComplete(success, softwareName, absoluteFileName);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
	public MyHelperClass downloadFolder;
public MyHelperClass downloadStarted(MyHelperClass o0){ return null; }
	public MyHelperClass downloadProgressNotification(MyHelperClass o0, long o1, MyHelperClass o2){ return null; }
	public MyHelperClass downloadComplete(boolean o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass createTempFile(String o0, Object o1){ return null; }
	public MyHelperClass warningPrintln(String o0, Object o1, Object o2){ return null; }
	public MyHelperClass debugPrintln(String o0){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}
