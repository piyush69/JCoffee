import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21925739 {
public MyHelperClass MapMode;

    public static void buildPerMovieDiffBinary(String completePath, String slopeOneDataFolderName, String slopeOneDataFileName)  throws Throwable {
        try {
            MyHelperClass fSep = new MyHelperClass();
            File inFile = new File(completePath + fSep + "SmartGRAPE" + fSep + slopeOneDataFolderName + fSep + slopeOneDataFileName);
            FileChannel inC = (FileChannel)(Object)new FileInputStream(inFile).getChannel();
            for (int i = 1; i <= 17770; i++) {
//                MyHelperClass fSep = new MyHelperClass();
                File outFile = new File(completePath + fSep + "SmartGRAPE" + fSep + slopeOneDataFolderName + fSep + "Movie-" + i + "-SlopeOneData.txt");
                FileChannel outC = (FileChannel)(Object)new FileOutputStream(outFile).getChannel();
                MyHelperClass ByteBuffer = new MyHelperClass();
                ByteBuffer buf = ByteBuffer.allocate(17770 * 10);
                for (int j = 1; j < i; j++) {
//                    MyHelperClass ByteBuffer = new MyHelperClass();
                    ByteBuffer bbuf = ByteBuffer.allocate(12);
                    inC.position((17769 * 17770 * 6) - ((17769 - (j - 1)) * (17770 - (j - 1)) * 6) + (i - j - 1) * 12);
                    inC.read(bbuf);
                    bbuf.flip();
                    buf.putShort(bbuf.getShort());
                    bbuf.getShort();
                    buf.putInt(bbuf.getInt());
                    buf.putFloat(-bbuf.getFloat());
                }
                buf.putShort(new Integer(i).shortValue());
                buf.putInt(0);
                buf.putFloat(0.0f);
                ByteBuffer remainingBuf = inC.map(MapMode.READ_ONLY, (17769 * 17770 * 6) - ((17769 - (i - 1)) * (17770 - (i - 1)) * 6), (17770 - i) * 12);
                while (remainingBuf.hasRemaining()) {
                    remainingBuf.getShort();
                    buf.putShort(remainingBuf.getShort());
                    buf.putInt(remainingBuf.getInt());
                    buf.putFloat(remainingBuf.getFloat());
                }
                buf.flip();
                outC.write(buf);
                buf.clear();
                outC.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocate(int o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass position(int o0){ return null; }}

class ByteBuffer {

public MyHelperClass putFloat(float o0){ return null; }
	public MyHelperClass getFloat(){ return null; }
	public MyHelperClass getInt(){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass getShort(){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass putInt(int o0){ return null; }
	public MyHelperClass putShort(short o0){ return null; }}
