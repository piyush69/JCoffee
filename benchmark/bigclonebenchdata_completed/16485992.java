import java.io.*;
import java.lang.*;
import java.util.*;



class c16485992 {
public MyHelperClass m_Out;
	public MyHelperClass sendLine(String o0){ return null; }

    private void sendBinaryFile(File file) throws IOException, CVSException {
        BufferedInputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream(file));
            MyHelperClass m_bCompressFiles = new MyHelperClass();
            if ((boolean)(Object)m_bCompressFiles) {
                GZIPOutputStream gzipOut = null;
                InputStream gzipIn = null;
                File gzipFile = null;
                try {
                    gzipFile = File.createTempFile("javacvs", "tmp");
                    gzipOut = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(gzipFile)));
                    int b;
                    while ((b = in.read()) != -1) gzipOut.write((byte) b);
                    gzipOut.close();
                    long gzipLength = gzipFile.length();
                    sendLine("z" + Long.toString(gzipLength));
                    gzipIn = new BufferedInputStream(new FileInputStream(gzipFile));
                    for (long i = 0; i < gzipLength; i++) {
                        b = gzipIn.read();
                        if (b == -1) throw new EOFException();
                        m_Out.write((byte) b);
                    }
                } finally {
                    if (gzipOut != null) gzipOut.close();
                    if (gzipIn != null) gzipIn.close();
                    if (gzipFile != null) gzipFile.delete();
                }
            } else {
                long nLength = file.length();
                sendLine(Long.toString(nLength));
                for (long i = 0; i < nLength; i++) {
                    int b = in.read();
                    if (b == -1) throw new EOFException();
                    m_Out.write((byte) b);
                }
            }
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(byte o0){ return null; }}

class CVSException extends Exception{
	public CVSException(String errorMessage) { super(errorMessage); }
}

class GZIPOutputStream {

GZIPOutputStream(BufferedOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte o0){ return null; }}
