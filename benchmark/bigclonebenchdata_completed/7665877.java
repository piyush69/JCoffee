import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7665877 {
public MyHelperClass[] centers;
public MyHelperClass[] T;
	public MyHelperClass[] A;
//	public MyHelperClass centers;
	public MyHelperClass[] C;
	public MyHelperClass[] G;
	public MyHelperClass magicNumber;
	public MyHelperClass sequence;
//public MyHelperClass A;
//	public MyHelperClass G;
	public MyHelperClass max;
	public MyHelperClass header;
//	public MyHelperClass T;
//	public MyHelperClass C;

    public  void SCFFile(URL url) throws Throwable, IOException {
        URLConnection connection = url.openConnection();
        byte[] content = new byte[connection.getContentLength()];
        DataInputStream dis = new DataInputStream(connection.getInputStream());
        dis.readFully(content);
        dis.close();
        dis = new DataInputStream(new ByteArrayInputStream(content));
        header =(MyHelperClass)(Object) new SCFHeader(dis);
        if (!magicNumber.equals(".scf")) throw new RuntimeException(url + " is not an SCF file");
        A =(MyHelperClass[])(Object)(MyHelperClass)(Object) new int[(int)(Object)header.samples];
        C =(MyHelperClass[])(Object)(MyHelperClass)(Object) new int[(int)(Object)header.samples];
        G =(MyHelperClass[])(Object)(MyHelperClass)(Object) new int[(int)(Object)header.samples];
        T =(MyHelperClass[])(Object)(MyHelperClass)(Object) new int[(int)(Object)header.samples];
        max =(MyHelperClass)(Object) Integer.MIN_VALUE;
        dis.reset();
        dis.skipBytes((int)(Object)header.samplesOffset);
        if ((int)(Object)header.sampleSize == 1) {
            if ((double)(Object)header.version < 3.00) {
                for (int i = 0; i < (int)(Object)header.samples; ++i) {
                    A[i] =(MyHelperClass)(Object) dis.readUnsignedByte();
                    if ((int)(Object)A[i] > (int)(Object)max) max = A[i];
                    C[i] =(MyHelperClass)(Object) dis.readUnsignedByte();
                    if ((int)(Object)C[i] > (int)(Object)max) max = C[i];
                    G[i] =(MyHelperClass)(Object) dis.readUnsignedByte();
                    if ((int)(Object)G[i] > (int)(Object)max) max = G[i];
                    T[i] =(MyHelperClass)(Object) dis.readUnsignedByte();
                    if ((int)(Object)T[i] > (int)(Object)max) max = T[i];
                }
            } else {
                for (int i = 0; i < (int)(Object)header.samples; ++i) {
                    A[i] =(MyHelperClass)(Object) dis.readUnsignedByte();
                    if ((int)(Object)A[i] > (int)(Object)max) max = A[i];
                }
                for (int i = 0; i < (int)(Object)header.samples; ++i) {
                    C[i] =(MyHelperClass)(Object) dis.readUnsignedByte();
                    if ((int)(Object)C[i] > (int)(Object)max) max = C[i];
                }
                for (int i = 0; i < (int)(Object)header.samples; ++i) {
                    G[i] =(MyHelperClass)(Object) dis.readUnsignedByte();
                    if ((int)(Object)G[i] > (int)(Object)max) max = G[i];
                }
                for (int i = 0; i < (int)(Object)header.samples; ++i) {
                    T[i] =(MyHelperClass)(Object) dis.readUnsignedByte();
                    if ((int)(Object)T[i] > (int)(Object)max) max = T[i];
                }
            }
        } else if ((int)(Object)header.sampleSize == 2) {
            if ((double)(Object)header.version < 3.00) {
                for (int i = 0; i < (int)(Object)header.samples; ++i) {
                    A[i] =(MyHelperClass)(Object) dis.readUnsignedShort();
                    if ((int)(Object)A[i] > (int)(Object)max) max = A[i];
                    C[i] =(MyHelperClass)(Object) dis.readUnsignedShort();
                    if ((int)(Object)C[i] > (int)(Object)max) max = C[i];
                    G[i] =(MyHelperClass)(Object) dis.readUnsignedShort();
                    if ((int)(Object)G[i] > (int)(Object)max) max = G[i];
                    T[i] =(MyHelperClass)(Object) dis.readUnsignedShort();
                    if ((int)(Object)T[i] > (int)(Object)max) max = T[i];
                }
            } else {
                for (int i = 0; i < (int)(Object)header.samples; ++i) {
                    A[i] =(MyHelperClass)(Object) dis.readUnsignedShort();
                    if ((int)(Object)A[i] > (int)(Object)max) max = A[i];
                }
                for (int i = 0; i < (int)(Object)header.samples; ++i) {
                    C[i] =(MyHelperClass)(Object) dis.readUnsignedShort();
                    if ((int)(Object)C[i] > (int)(Object)max) max = C[i];
                }
                for (int i = 0; i < (int)(Object)header.samples; ++i) {
                    G[i] =(MyHelperClass)(Object) dis.readUnsignedShort();
                    if ((int)(Object)G[i] > (int)(Object)max) max = G[i];
                }
                for (int i = 0; i < (int)(Object)header.samples; ++i) {
                    T[i] =(MyHelperClass)(Object) dis.readUnsignedShort();
                    if ((int)(Object)T[i] > (int)(Object)max) max = T[i];
                }
            }
        }
        centers =(MyHelperClass[])(Object) new int[(int)(Object)header.bases];
        byte[] buf = new byte[(int)(Object)header.bases];
        dis.reset();
        dis.skipBytes((int)(Object)header.basesOffset);
        if ((double)(Object)header.version < 3.00) {
            for (int i = 0; i < (int)(Object)header.bases; ++i) {
                centers[i] =(MyHelperClass)(Object) dis.readInt();
                dis.skipBytes(4);
                buf[i] = dis.readByte();
                dis.skipBytes(3);
            }
        } else {
            for (int i = 0; i < (int)(Object)header.bases; ++i) centers[i] =(MyHelperClass)(Object) dis.readInt();
            dis.skipBytes(4 * (int)(Object)header.bases);
            dis.readFully(buf);
        }
        sequence =(MyHelperClass)(Object) new String(buf);
        dis.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass samplesOffset;
	public MyHelperClass sampleSize;
	public MyHelperClass version;
	public MyHelperClass samples;
	public MyHelperClass bases;
	public MyHelperClass basesOffset;
}

class SCFHeader {

SCFHeader(){}
	SCFHeader(DataInputStream o0){}}
