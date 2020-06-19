import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14776698 {
public MyHelperClass sendProgress(int o0, int o1){ return null; }
public MyHelperClass sendProgress(String o0, int o1, int o2){ return null; }
	public MyHelperClass askOnFileExist(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass error(MyHelperClass o0){ return null; }
public MyHelperClass sendProgress(String o0, int o1, int o2, int o3){ return null; }
public MyHelperClass string;
	public MyHelperClass commander;
	public int depth;
	public MyHelperClass VERSION;
	public MyHelperClass ForwardCompat;
	public int counter;
//public MyHelperClass counter;
	public MyHelperClass Utils;
	public MyHelperClass errMsg;
	public MyHelperClass totalBytes;
	public MyHelperClass TAG;
	public MyHelperClass Commander;
	public MyHelperClass Log;
	public MyHelperClass conv;
//	public MyHelperClass depth;
	public MyHelperClass move;
	public MyHelperClass sizeOfsize(long o0, String o1){ return null; }
	public MyHelperClass isStopReq(){ return null; }

        private final int copyFiles(File[] list, String dest, boolean dest_is_full_name) throws Throwable, InterruptedException {
            MyHelperClass ctx = new MyHelperClass();
            Context c =(Context)(Object) ctx;
            File file = null;
            for (int i = 0; i < list.length; i++) {
                boolean existed = false;
                FileChannel in = null;
                FileChannel out = null;
                File outFile = null;
                file = list[i];
                if (file == null) {
                    error(c.getString(string.unkn_err));
                    break;
                }
                String uri = file.getAbsolutePath();
                try {
                    if ((boolean)(Object)isStopReq()) {
                        error(c.getString(string.canceled));
                        break;
                    }
                    long last_modified = file.lastModified();
                    String fn = file.getName();
                    outFile = dest_is_full_name ? new File(dest) : new File(dest, fn);
                    if (file.isDirectory()) {
                        if (depth++ > 40) {
                            error(ctx.getString(string.too_deep_hierarchy));
                            break;
                        } else if (outFile.exists() || outFile.mkdir()) {
                            copyFiles(file.listFiles(), outFile.getAbsolutePath(), false);
                            if (errMsg != null) break;
                        } else error(c.getString(string.cant_md, outFile.getAbsolutePath()));
                        depth--;
                    } else {
                        if (existed = outFile.exists()) {
                            int res =(int)(Object) askOnFileExist(c.getString(string.file_exist, outFile.getAbsolutePath()), commander);
                            if (res == (int)(Object)Commander.SKIP) continue;
                            if (res == (int)(Object)Commander.REPLACE) {
                                if (outFile.equals(file)) continue; else outFile.delete();
                            }
                            if (res == (int)(Object)Commander.ABORT) break;
                        }
                        if ((boolean)(Object)move) {
                            long len = file.length();
                            if (file.renameTo(outFile)) {
                                counter++;
                               (long)(Object) totalBytes += len;
                                int so_far = (int) ((int)(Object)totalBytes * (int)(Object)conv);
                                sendProgress(outFile.getName() + " " + c.getString(string.moved), so_far, 0);
                                continue;
                            }
                        }
                        in = (FileChannel)(Object)new FileInputStream(file).getChannel();
                        out = (FileChannel)(Object)new FileOutputStream(outFile).getChannel();
                        long size =(long)(Object) in.size();
                        final long max_chunk = 524288;
                        long pos = 0;
                        long chunk = size > max_chunk ? max_chunk : size;
                        long t_chunk = 0;
                        long start_time = 0;
                        int speed = 0;
                        int so_far = (int) ((int)(Object)totalBytes * (int)(Object)conv);
                        String sz_s =(String)(Object) Utils.getHumanSize(size);
                        String rep_s =(String)(Object) c.getString(string.copying, fn);
                        for (pos = 0; pos < size; ) {
                            if (t_chunk == 0) start_time = System.currentTimeMillis();
                            sendProgress(rep_s + sizeOfsize(pos, sz_s), so_far, (int) ((int)(Object)totalBytes * (int)(Object)conv), speed);
                            long transferred =(long)(Object) in.transferTo(pos, chunk, out);
                            pos += transferred;
                            t_chunk += transferred;
                           (long)(Object) totalBytes += transferred;
                            if ((boolean)(Object)isStopReq()) {
                                Log.d(TAG, "Interrupted!");
                                error(c.getString(string.canceled));
                                return(int)(Object) counter;
                            }
                            long time_delta = System.currentTimeMillis() - start_time;
                            if (time_delta > 0) {
                                speed = (int) (1000 * t_chunk / time_delta);
                                t_chunk = 0;
                            }
                        }
                        in.close();
                        out.close();
                        in = null;
                        out = null;
                        if (i >= list.length - 1) sendProgress((int)(Object)c.getString(string.copied_f, fn) + (int)(Object)sizeOfsize(pos, sz_s), (int) ((int)(Object)totalBytes * (int)(Object)conv));
                        counter++;
                    }
                    if ((boolean)(Object)move) file.delete();
                    outFile.setLastModified(last_modified);
                    final int GINGERBREAD = 9;
                    if ((int)(Object)VERSION.SDK_INT >= GINGERBREAD) ForwardCompat.setFullPermissions(outFile);
                } catch (SecurityException e) {
                    error(c.getString(string.sec_err, e.getMessage()));
                } catch (FileNotFoundException e) {
                    error(c.getString(string.not_accs, e.getMessage()));
                } catch (ClosedByInterruptException e) {
                    error(c.getString(string.canceled));
                } catch (IOException e) {
                    String msg = e.getMessage();
                    error(c.getString(string.acc_err, uri, msg != null ? msg : ""));
                } catch (RuntimeException e) {
                    error(c.getString(string.rtexcept, uri, e.getMessage()));
                } finally {
                    try {
                        if (in != null) in.close();
                        if (out != null) out.close();
                        if (!(Boolean)(Object)move && errMsg != null && outFile != null && !existed) {
                            Log.i(TAG, "Deleting failed output file");
                            outFile.delete();
                        }
                    } catch (IOException e) {
                        error(c.getString(string.acc_err, uri, e.getMessage()));
                    }
                }
            }
            return(int)(Object) counter;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass REPLACE;
	public MyHelperClass rtexcept;
	public MyHelperClass sec_err;
	public MyHelperClass too_deep_hierarchy;
	public MyHelperClass acc_err;
	public MyHelperClass file_exist;
	public MyHelperClass cant_md;
	public MyHelperClass moved;
	public MyHelperClass ABORT;
	public MyHelperClass copied_f;
	public MyHelperClass unkn_err;
	public MyHelperClass not_accs;
	public MyHelperClass SDK_INT;
	public MyHelperClass canceled;
	public MyHelperClass SKIP;
	public MyHelperClass copying;
public MyHelperClass getHumanSize(long o0){ return null; }
	public MyHelperClass d(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass setFullPermissions(File o0){ return null; }
	public MyHelperClass i(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }}

class Context {

public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass getString(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getString(MyHelperClass o0, String o1, String o2){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ClosedByInterruptException extends Exception{
	public ClosedByInterruptException(String errorMessage) { super(errorMessage); }
}
