import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11670354 {
public MyHelperClass[] centers;
public MyHelperClass A;
	public MyHelperClass traceLength;
	public MyHelperClass G;
	public MyHelperClass max;
//	public MyHelperClass centers;
	public MyHelperClass sequenceLength;
	public MyHelperClass T;
	public MyHelperClass C;
	public MyHelperClass sequence;
	public MyHelperClass traceArray(char o0){ return null; }
	public MyHelperClass isABI(DataInputStream o0){ return null; }

    public  void ABIFile(URL url) throws Throwable, FileFormatException, IOException {
        URLConnection connection = url.openConnection();
        int contentLength = connection.getContentLength();
        if (contentLength <= 0) throw new RuntimeException(url + " contained no content");
        byte[] content = new byte[contentLength];
        DataInputStream dis = new DataInputStream(connection.getInputStream());
        dis.readFully(content);
        dis.close();
        dis = new DataInputStream(new ByteArrayInputStream(content));
        if (!(Boolean)(Object)isABI(dis)) {
            throw new FileFormatException(url + " is not an ABI trace file");
        }
        char[] fwo = null;
        dis.reset();
        dis.skipBytes(18);
        int len = dis.readInt();
        dis.skipBytes(4);
        int off = dis.readInt();
        ABIRecord[] data = new ABIRecord[12];
        ABIRecord[] pbas = new ABIRecord[2];
        ABIRecord[] ploc = new ABIRecord[2];
        dis.reset();
        dis.skipBytes(off);
        for (; len > 0; len--) {
            ABIRecord rec = new ABIRecord(dis);
            if (rec.tag.equals("DATA")) {
                try {
                    data[(int)(Object)rec.n - 1] = rec;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("ABI record contains erroneous n field");
                }
            } else if (rec.tag.equals("FWO_")) {
                fwo = ((String)(String)(Object) rec.data).toCharArray();
            } else if (rec.tag.equals("PBAS")) {
                pbas[(int)(Object)rec.n - 1] = rec;
            } else if (rec.tag.equals("PLOC")) {
                ploc[(int)(Object)rec.n - 1] = rec;
            }
        }
        traceLength = data[8].len;
        sequenceLength = pbas[1].len;
        A =(MyHelperClass)(Object) new short[(int)(Object)traceLength];
        C =(MyHelperClass)(Object) new short[(int)(Object)traceLength];
        G =(MyHelperClass)(Object) new short[(int)(Object)traceLength];
        T =(MyHelperClass)(Object) new short[(int)(Object)traceLength];
        max =(MyHelperClass)(Object) Short.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            dis.reset();
            dis.skipBytes((int)(Object)data[8 + i].off);
            short[] current =(short[])(Object) traceArray(fwo[i]);
            for (int j = 0; j < (int)(Object)traceLength; j++) {
                current[j] = dis.readShort();
                if (current[j] > (short)(Object)max) max =(MyHelperClass)(Object) current[j];
            }
        }
        byte[] buf = new byte[(int)(Object)sequenceLength];
        dis.reset();
        dis.skipBytes((int)(Object)pbas[1].off);
        dis.readFully(buf);
        sequence =(MyHelperClass)(Object) new String(buf);
        centers =(MyHelperClass[])(Object)(MyHelperClass)(Object) new short[(int)(Object)sequenceLength];
        dis.reset();
        dis.skipBytes((int)(Object)ploc[1].off);
        for (int i = 0; i < (int)(Object)sequenceLength; i++) centers[i] =(MyHelperClass)(Object) dis.readShort();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileFormatException extends Exception{
	public FileFormatException(String errorMessage) { super(errorMessage); }
}

class ABIRecord {
public MyHelperClass off;
	public MyHelperClass n;
	public MyHelperClass len;
	public MyHelperClass data;
	public MyHelperClass tag;
ABIRecord(DataInputStream o0){}
	ABIRecord(){}}
