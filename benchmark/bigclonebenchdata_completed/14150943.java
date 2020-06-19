import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14150943 {
public MyHelperClass report(int o0, int o1, String o2){ return null; }

    private void downloadPage(final URL url, final File file)  throws Throwable {
        try {
            long size = 0;
            MyHelperClass BotUtil = new MyHelperClass();
            final byte[] buffer = new byte[(int)(Object)BotUtil.BUFFER_SIZE];
            final File tempFile = new File(file.getParentFile(), "temp.tmp");
            int length;
            int lastUpdate = 0;
            FileOutputStream fos = new FileOutputStream(tempFile);
            final InputStream is = url.openStream();
            do {
                length = is.read(buffer);
                if (length >= 0) {
                    fos.write(buffer, 0, length);
                    size += length;
                }
                MyHelperClass UPDATE_TIME = new MyHelperClass();
                if (lastUpdate > (int)(Object)UPDATE_TIME) {
                    MyHelperClass Format = new MyHelperClass();
                    report(0, (int) (size / (long)(Object)Format.MEMORY_MEG), "Downloading... " + Format.formatMemory(size));
                    lastUpdate = 0;
                }
                lastUpdate++;
            } while (length >= 0);
            fos.close();
            if (url.toString().toLowerCase().endsWith(".gz")) {
                final FileInputStream fis = new FileInputStream(tempFile);
                final GZIPInputStream gis = new GZIPInputStream(fis);
                fos = new FileOutputStream(file);
                size = 0;
                lastUpdate = 0;
                do {
                    length =(int)(Object) gis.read(buffer);
                    if (length >= 0) {
                        fos.write(buffer, 0, length);
                        size += length;
                    }
                    MyHelperClass UPDATE_TIME = new MyHelperClass();
                    if (lastUpdate > (int)(Object)UPDATE_TIME) {
                        MyHelperClass Format = new MyHelperClass();
                        report(0, (int) (size / (long)(Object)Format.MEMORY_MEG), "Uncompressing... " + Format.formatMemory(size));
                        lastUpdate = 0;
                    }
                    lastUpdate++;
                } while (length >= 0);
                fos.close();
                fis.close();
                gis.close();
                tempFile.delete();
            } else {
                file.delete();
                tempFile.renameTo(file);
            }
        } catch (final IOException e) {
            throw(Throwable)(Object) new AnalystError(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MEMORY_MEG;
	public MyHelperClass BUFFER_SIZE;
public MyHelperClass formatMemory(long o0){ return null; }}

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class AnalystError {

AnalystError(){}
	AnalystError(IOException o0){}}
