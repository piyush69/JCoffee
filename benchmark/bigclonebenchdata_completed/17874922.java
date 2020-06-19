import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17874922 {
public MyHelperClass fSep;
	public MyHelperClass MapMode;

    public static boolean buildPerMovieDiffBinary(String masterFile)  throws Throwable {
        try {
            MyHelperClass completePath = new MyHelperClass();
            File inFile = new File(completePath + fSep + "SmartGRAPE" + fSep + masterFile);
            FileChannel inC = (FileChannel)(Object)new FileInputStream(inFile).getChannel();
            System.out.println(inC.size());
            short movie1, movie2;
            int count;
            float diffRating, sumXY, sumX, sumY, sumX2, sumY2, pearsonCorr, adjustedCosineCorr, cosineCorr;
            long position;
            for (long i = 1; i < 17770; i++) {
                File outFile = new File("C:\\NetflixData\\download\\SmartGrape\\CFItemToItemStats\\Movie--" + i + "-MatrixData.txt");
                FileChannel outC = (FileChannel)(Object)new FileOutputStream(outFile, true).getChannel();
                MyHelperClass ByteBuffer = new MyHelperClass();
                ByteBuffer buf = ByteBuffer.allocate(17770 * 44);
                for (long j = 1; j < i; j++) {
//                    MyHelperClass ByteBuffer = new MyHelperClass();
                    ByteBuffer bbuf = ByteBuffer.allocate(44);
                    position = 0;
                    position += new Long(17769).longValue() * new Long(17770).longValue() * new Long(22).longValue();
                    position -= new Long((17769 - (j - 1))).longValue() * new Long((17770 - (j - 1))).longValue() * new Long(22).longValue();
                    position += new Long((i - j - 1) * 44).longValue();
                    inC.position(position);
                    inC.read(bbuf);
                    bbuf.flip();
                    buf.putShort(bbuf.getShort());
                    bbuf.getShort();
                    buf.putInt(bbuf.getInt());
                    buf.putFloat(-bbuf.getInt());
                    buf.putFloat(bbuf.getFloat());
                    buf.putFloat(bbuf.getFloat());
                    buf.putFloat(bbuf.getFloat());
                    buf.putFloat(bbuf.getFloat());
                    buf.putFloat(bbuf.getFloat());
                    buf.putFloat(bbuf.getFloat());
                    buf.putFloat(bbuf.getFloat());
                    buf.putFloat(bbuf.getFloat());
                }
                buf.putShort(new Long(i).shortValue());
                buf.putInt(0);
                buf.putFloat(0);
                buf.putFloat(0);
                buf.putFloat(0);
                buf.putFloat(0);
                buf.putFloat(0);
                buf.putFloat(0);
                buf.putFloat(0);
                buf.putFloat(0);
                buf.putFloat(0);
                position = 0;
                position += new Long(17769).longValue() * new Long(17770).longValue() * new Long(22).longValue();
                position -= new Long((17769 - (i - 1))).longValue() * new Long((17770 - (i - 1))).longValue() * new Long(22).longValue();
                ByteBuffer remainingBuf = inC.map(MapMode.READ_ONLY, position, (17770 - i) * 44);
                while (remainingBuf.hasRemaining()) {
                    remainingBuf.getShort();
                    buf.putShort(remainingBuf.getShort());
                    buf.putInt(remainingBuf.getInt());
                    buf.putFloat(remainingBuf.getFloat());
                    buf.putFloat(remainingBuf.getFloat());
                    buf.putFloat(remainingBuf.getFloat());
                    buf.putFloat(remainingBuf.getFloat());
                    buf.putFloat(remainingBuf.getFloat());
                    buf.putFloat(remainingBuf.getFloat());
                    buf.putFloat(remainingBuf.getFloat());
                    buf.putFloat(remainingBuf.getFloat());
                    buf.putFloat(remainingBuf.getFloat());
                }
                buf.flip();
                outC.write(buf);
                buf.clear();
                outC.close();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocate(int o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass position(long o0){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteBuffer {

public MyHelperClass getFloat(){ return null; }
	public MyHelperClass getInt(){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass getShort(){ return null; }
	public MyHelperClass putFloat(int o0){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass putInt(int o0){ return null; }
	public MyHelperClass putShort(short o0){ return null; }}
