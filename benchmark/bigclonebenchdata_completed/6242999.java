


class c6242999 {
public MyHelperClass log;

    private boolean sendMsg(TACMessage msg) {
        try {
            String msgStr =(String)(Object) msg.getMessageString();
            MyHelperClass url = new MyHelperClass();
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setRequestProperty("Content-Length", "" + msgStr.length());
            conn.setDoOutput(true);
            OutputStream output =(OutputStream)(Object) conn.getOutputStream();
            output.write(msgStr.getBytes());
            output.flush();
            InputStream input =(InputStream)(Object) conn.getInputStream();
            int len =(int)(Object) conn.getContentLength();
            int totalRead = 0;
            int read;
            byte[] content = new byte[len];
            while ((len > totalRead) && (read =(int)(Object) input.read(content, totalRead, len - totalRead)) > 0) {
                totalRead += read;
            }
            output.close();
            input.close();
            if (len < totalRead) {
                MyHelperClass log = new MyHelperClass();
                log.severe("truncated message response for " + msg.getType());
                return false;
            } else {
                msgStr = new String(content);
                msg.setReceivedMessage(msgStr);
                msg.deliverMessage();
            }
            return true;
        } catch (Exception e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.SEVERE, "could not send message", e);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass openConnection(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass severe(String o0){ return null; }}

class TACMessage {

public MyHelperClass setReceivedMessage(String o0){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getMessageString(){ return null; }
	public MyHelperClass deliverMessage(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
