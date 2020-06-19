
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8046691 {
public MyHelperClass start;
public MyHelperClass JOptionPane;
	public MyHelperClass RSLink;
	public MyHelperClass log(String o0){ return null; }

    private void retrieveFile(URL url, RSLink link) {
        MyHelperClass RSLink = new MyHelperClass();
        link.setStatus(RSLink.STATUS_DOWNLOADING);
        HttpURLConnection httpConn = null;
        DataOutputStream outs = null;
        BufferedInputStream bins = null;
        BufferedOutputStream bouts = null;
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            String postData = URLEncoder.encode("mirror", "UTF-8") + "=" + URLEncoder.encode(url.toString(), "UTF-8");
            httpConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            httpConn.setRequestMethod("POST");
            httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpConn.setRequestProperty("Content-Length", "" + Integer.toString(postData.getBytes().length));
            httpConn.setRequestProperty("Content-Language", "en-US");
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            outs = new DataOutputStream(httpConn.getOutputStream());
            outs.writeBytes(postData);
            outs.flush();
            MyHelperClass Pattern = new MyHelperClass();
            Pattern mimePattern =(Pattern)(Object) Pattern.compile(".+/html.+");
            Matcher matcher =(Matcher)(Object) mimePattern.matcher(httpConn.getContentType());
            if ((boolean)(Object)matcher.find()) {
                log("Can not download, maybe all RS slots are busy!");
                return;
            }
            link.setSize(httpConn.getContentLength());
            bins = new BufferedInputStream(httpConn.getInputStream(), 4096);
            bouts = new BufferedOutputStream(new FileOutputStream(link.getFile()), 4096);
            link.setStatus(RSLink.STATUS_DOWNLOADING);
            link.setDown(0);
            byte[] byteBuffer = new byte[4096];
            int count;
            while ((count =(int)(Object) bins.read(byteBuffer)) != -1) {
                bouts.write(byteBuffer, 0, count);
                link.setDown((int)(Object)link.getDown() + count);
                if (!(Boolean)(Object)start.get()) {
                    link.setStatus(RSLink.STATUS_NOTHING);
                    return;
                }
            }
            link.setStatus(RSLink.STATUS_DONE);
        } catch (UncheckedIOException ex) {
            log("I/O Exception!");
            link.setStatus(RSLink.STATUS_NOTHING);
        } finally {
            try {
                if (outs != null) outs.close();
                if (bouts != null) bouts.close();
                if (bins != null) bins.close();
            } catch (UncheckedIOException ex) {
                JOptionPane.showMessageDialog(null, "Can not close some connections:\n" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            if (httpConn != null) httpConn.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass STATUS_DOWNLOADING;
	public MyHelperClass STATUS_NOTHING;
	public MyHelperClass STATUS_DONE;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }
	public MyHelperClass compile(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class RSLink {

public MyHelperClass setSize(MyHelperClass o0){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getDown(){ return null; }
	public MyHelperClass setDown(int o0){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class DataOutputStream {

DataOutputStream(){}
	DataOutputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass writeBytes(String o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0, int o1){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0, int o1){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class Pattern {

public MyHelperClass matcher(MyHelperClass o0){ return null; }}

class Matcher {

public MyHelperClass find(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
