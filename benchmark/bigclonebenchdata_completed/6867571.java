import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6867571 {
public MyHelperClass NULL;
public MyHelperClass totalLength;
	public MyHelperClass target;
	public MyHelperClass completed;
	public MyHelperClass Pattern;
	public MyHelperClass url;
	public MyHelperClass progressUpdated;
	public MyHelperClass error;
	public MyHelperClass progressString;
	public MyHelperClass BUFFER_SIZE;
	public MyHelperClass lengthLock;
	public MyHelperClass downloadedLength;
	public MyHelperClass stateLock;
	public MyHelperClass running;
	public MyHelperClass checkState(){ return null; }

    public void run()  throws Throwable {
        MyHelperClass stateLock = new MyHelperClass();
        synchronized (stateLock) {
            MyHelperClass started = new MyHelperClass();
            if ((boolean)(Object)started) {
                return;
            } else {
//                MyHelperClass started = new MyHelperClass();
                started =(MyHelperClass)(Object) true;
                boolean running =(boolean)(Object) NULL; //new boolean();
                running = true;
            }
        }
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        BufferedReader br = null;
        try {
            checkState();
            progressString =(MyHelperClass)(Object) "Opening connection to remote resource";
            progressUpdated =(MyHelperClass)(Object) true;
            final URLConnection link;
            try {
                link =(URLConnection)(Object) url.openConnection();
                link.connect();
            } catch (Exception e) {
                progressString =(MyHelperClass)(Object) "Failed to open connection to remote resource";
                progressUpdated =(MyHelperClass)(Object) true;
                throw e;
            }
            checkState();
            progressString =(MyHelperClass)(Object) "Getting length of remote resource";
            progressUpdated =(MyHelperClass)(Object) true;
            final int length = link.getContentLength();
            synchronized (lengthLock) {
                totalLength =(MyHelperClass)(Object) length;
            }
            progressUpdated =(MyHelperClass)(Object) true;
            checkState();
            progressString =(MyHelperClass)(Object) "Opening input stream to remote resource";
            progressUpdated =(MyHelperClass)(Object) true;
            try {
                final InputStream input = link.getInputStream();
                if ((File)(Object)target instanceof File) {
                    bis = new BufferedInputStream(input);
                } else if ((StringBuilder)(Object)target instanceof StringBuilder) {
                    final String contentType = link.getContentType().toLowerCase(Locale.ENGLISH);
                    String charset = null;
                    final Matcher m =(Matcher)(Object) Pattern.compile(".*charset[\\s]*=([^;]++).*").matcher(contentType);
                    if ((boolean)(Object)m.find()) {
                        charset =(String)(Object) m.group(1).trim();
                    }
                    if ((charset != null) && !charset.isEmpty()) {
                        try {
                            br = new BufferedReader(new InputStreamReader(input, charset));
                        } catch (Exception e) {
                            br = null;
                        }
                    }
                    if (br == null) {
                        br = new BufferedReader(new InputStreamReader(input));
                    }
                }
            } catch (Exception e) {
                progressString =(MyHelperClass)(Object) "Failed to open input stream to remote resource";
                progressUpdated =(MyHelperClass)(Object) true;
                throw e;
            }
            if ((File)(Object)target instanceof File) {
                checkState();
                progressString =(MyHelperClass)(Object) "Opening output stream to local file";
                progressUpdated =(MyHelperClass)(Object) true;
                try {
                    final File f = (File)(File)(Object) target;
                    final File parent = f.getParentFile();
                    if ((parent != null) && !parent.exists()) {
                        parent.mkdirs();
                    }
                    bos = new BufferedOutputStream(new FileOutputStream(f));
                } catch (Exception e) {
                    progressString =(MyHelperClass)(Object) "Failed to open output stream to local file";
                    progressUpdated =(MyHelperClass)(Object) true;
                    throw e;
                }
            }
            progressString =(MyHelperClass)(Object) "Downloading";
            progressUpdated =(MyHelperClass)(Object) true;
            try {
                if ((File)(Object)target instanceof File) {
                    final byte[] byteBuffer = new byte[(int)(Object)BUFFER_SIZE];
                    while (true) {
                        checkState();
                        final int byteCount = bis.read(byteBuffer, 0,(int)(Object) BUFFER_SIZE);
                        if (byteCount == -1) {
                            break;
                        }
                        bos.write(byteBuffer, 0, byteCount);
                        synchronized (lengthLock) {
                           (int)(Object) downloadedLength += byteCount;
                        }
                        progressUpdated =(MyHelperClass)(Object) true;
                    }
                } else if ((StringBuilder)(Object)target instanceof StringBuilder) {
                    final char[] charBuffer = new char[(int)(Object)BUFFER_SIZE];
                    final StringBuilder sb = (StringBuilder)(StringBuilder)(Object) target;
                    while (true) {
                        checkState();
                        final int charCount = br.read(charBuffer, 0,(int)(Object) BUFFER_SIZE);
                        if (charCount == -1) {
                            break;
                        }
                        sb.append(charBuffer, 0, charCount);
                        synchronized (lengthLock) {
                           (int)(Object) downloadedLength += charCount;
                        }
                        progressUpdated =(MyHelperClass)(Object) true;
                    }
                }
            } catch (Exception e) {
                progressString =(MyHelperClass)(Object) "Failed to download remote resource";
                progressUpdated =(MyHelperClass)(Object) true;
                throw e;
            }
            progressString =(MyHelperClass)(Object) "Download completed";
            progressUpdated =(MyHelperClass)(Object) true;
        } catch (Exception e) {
            error =(MyHelperClass)(Object) e;
        } finally {
            for (Closeable c : new Closeable[] { bis, br, bos }) {
                if (c != null) {
                    try {
                        c.close();
                    } catch (Exception e) {
                    }
                }
            }
            synchronized (stateLock) {
                running =(MyHelperClass)(Object) false;
                completed =(MyHelperClass)(Object) true;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}
