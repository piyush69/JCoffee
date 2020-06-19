
import java.io.UncheckedIOException;


class c10441727 {
public MyHelperClass fatalError(String o0, String o1){ return null; }

    private void downloadFile(String url, File destFile) {
        try {
            System.out.println("Downloading " + url + " to " + destFile + "...");
            destFile.getParentFile().mkdirs();
            OutputStream out =(OutputStream)(Object) new FileOutputStream(destFile);
            URLConnection conn =(URLConnection)(Object) (new URL(url).openConnection());
            InputStream in =(InputStream)(Object) conn.getInputStream();
            int totalSize =(int)(Object) conn.getContentLength(), downloadedSize = 0, size;
            byte[] buffer = new byte[32768];
            ProgressMonitor pm = new ProgressMonitor(null, "Downloading " + url, "", 0, totalSize);
            pm.setMillisToDecideToPopup(100);
            pm.setMillisToPopup(500);
            boolean canceled = false;
            while ((size =(int)(Object) in.read(buffer)) > 0 && !(canceled =(boolean)(Object) pm.isCanceled())) {
                out.write(buffer, 0, size);
                pm.setProgress(downloadedSize += size);
                pm.setNote((100 * downloadedSize / totalSize) + "% finished");
            }
            in.close();
            out.close();
            if (canceled) {
                destFile.delete();
                fatalError("Starting canceled", "Downloading canceled. Exiting...");
            }
            pm.close();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
            destFile.delete();
            fatalError("Download Error", "Couldn't download file " + url + ": " + ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass delete(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ProgressMonitor {

ProgressMonitor(){}
	ProgressMonitor(Object o0, String o1, String o2, int o3, int o4){}
	public MyHelperClass setMillisToPopup(int o0){ return null; }
	public MyHelperClass setMillisToDecideToPopup(int o0){ return null; }
	public MyHelperClass isCanceled(){ return null; }
	public MyHelperClass setProgress(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setNote(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
