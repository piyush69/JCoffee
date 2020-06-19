import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18445733 {
public MyHelperClass dbg(String o0){ return null; }
public MyHelperClass signed;
	public MyHelperClass w;
	public MyHelperClass pixData;
	public MyHelperClass h;
	public MyHelperClass ignoreNegValues;
	public MyHelperClass n;
	public MyHelperClass numberOfFrames;
	public MyHelperClass highBit;
	public MyHelperClass dHR;
	public MyHelperClass samplesPerPixel;
	public MyHelperClass bitsStored;
	public MyHelperClass bitsAllocated;

    public  void DicomReader(URL url) throws Throwable, java.io.IOException {
        final URLConnection u = url.openConnection();
        final int size = u.getContentLength();
        final byte[] array = new byte[size];
        int bytes_read = 0;
        final DataInputStream in = new DataInputStream(u.getInputStream());
        while (bytes_read < size) {
            bytes_read += in.read(array, bytes_read, size - bytes_read);
        }
        in.close();
        this.dHR =(MyHelperClass)(Object) new DicomHeaderReader(array);
        h = dHR.getRows();
        w = dHR.getColumns();
        highBit = dHR.getHighBit();
        bitsStored = dHR.getBitStored();
        bitsAllocated = dHR.getBitAllocated();
        n = ((MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)bitsAllocated / 8);
        signed = ((int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)dHR.getPixelRepresentation() == 1);
        this.pixData = dHR.getPixels();
        ignoreNegValues =(MyHelperClass)(Object) true;
        samplesPerPixel = dHR.getSamplesPerPixel();
        numberOfFrames = dHR.getNumberOfFrames();
        dbg("Number of Frames " + numberOfFrames);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBitAllocated(){ return null; }
	public MyHelperClass getSamplesPerPixel(){ return null; }
	public MyHelperClass getPixelRepresentation(){ return null; }
	public MyHelperClass getHighBit(){ return null; }
	public MyHelperClass getPixels(){ return null; }
	public MyHelperClass getColumns(){ return null; }
	public MyHelperClass getRows(){ return null; }
	public MyHelperClass getNumberOfFrames(){ return null; }
	public MyHelperClass getBitStored(){ return null; }}

class DicomHeaderReader {

DicomHeaderReader(byte[] o0){}
	DicomHeaderReader(){}}
