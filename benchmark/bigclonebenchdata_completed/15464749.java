


class c15464749 {
public MyHelperClass LogHelper;

//    @Override
    protected String doWget(final URL url, final boolean post, final boolean ignore, final String... post_data) throws Exception {
        String msg = "";
        InputStream in = null;
        OutputStream out = null;
        String data = null;
        try {
            final URLConnection urlcon =(URLConnection)(Object) url.openConnection();
            if (post) {
                boolean key = false;
                for (final String s : post_data) {
                    MyHelperClass URLEncoder = new MyHelperClass();
                    msg += URLEncoder.encode(s, "UTF-8");
                    if (key = !key) {
                        msg += "=";
                    } else {
                        msg += "&";
                    }
                }
                urlcon.setDoOutput(true);
                out =(OutputStream)(Object) urlcon.getOutputStream();
                out.write(msg.getBytes());
            }
            in =(InputStream)(Object) urlcon.getInputStream();
            data = ignore ? null : "";
            int len;
            final byte[] buffer = new byte[1023];
            while ((len =(int)(Object) in.read(buffer)) >= 0) {
                if (!ignore) {
                    data += new String(buffer, 0, len);
                }
            }
            MyHelperClass LogLevel = new MyHelperClass();
            if ((boolean)(Object)LogHelper.isLogLevelEnabled(LogLevel.DEBUG, DefaultCommunicationHelper.class)) {
//                MyHelperClass LogLevel = new MyHelperClass();
                LogHelper.log(DefaultCommunicationHelper.class, LogLevel.DEBUG, "WGET= URL[" + url.toString() + "?" + msg + "] RETURN[" + data + "]");
            }
            return data;
        } catch (final Exception ex) {
            MyHelperClass LogLevel = new MyHelperClass();
            LogHelper.log(DefaultCommunicationHelper.class, LogLevel.WARN, "An error occurred while submitting " + msg + " request to " + url.toString() + " with the following data: " + data, ex);
            throw ex;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (final Exception e) {
                    MyHelperClass LogLevel = new MyHelperClass();
                    LogHelper.log(DefaultCommunicationHelper.class, LogLevel.DEBUG, "An error occurred while closing an input stream", e);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (final Exception e) {
                    MyHelperClass LogLevel = new MyHelperClass();
                    LogHelper.log(DefaultCommunicationHelper.class, LogLevel.DEBUG, "An error occurred while closing an output stream", e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEBUG;
	public MyHelperClass WARN;
public MyHelperClass log(Class<DefaultCommunicationHelper> o0, MyHelperClass o1, String o2, Exception o3){ return null; }
	public MyHelperClass log(Class<DefaultCommunicationHelper> o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass isLogLevelEnabled(MyHelperClass o0, Class<DefaultCommunicationHelper> o1){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DefaultCommunicationHelper {

}
