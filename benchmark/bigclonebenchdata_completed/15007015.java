


class c15007015 {
public static MyHelperClass writeWord(ByteArrayOutputStream o0, int o1){ return null; }
	public static MyHelperClass writeWord(ByteArrayOutputStream o0, MyHelperClass o1){ return null; }
	public static MyHelperClass writeDWord(ByteArrayOutputStream o0, int o1){ return null; }
//public MyHelperClass writeDWord(ByteArrayOutputStream o0, int o1){ return null; }
//	public MyHelperClass writeWord(ByteArrayOutputStream o0, int o1){ return null; }
//	public MyHelperClass writeWord(ByteArrayOutputStream o0, MyHelperClass o1){ return null; }

    public static byte[] wrapBMP(Image image) throws IOException {
        MyHelperClass Image = new MyHelperClass();
        if (image.getOriginalType() != Image.ORIGINAL_BMP) throw new IOException("Only BMP can be wrapped in WMF.");
        InputStream imgIn;
        byte data[] = null;
        if (image.getOriginalData() == null) {
            imgIn =(InputStream)(Object) image.url().openStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int b = 0;
            while ((b =(int)(Object) imgIn.read()) != -1) out.write(b);
            imgIn.close();
            data =(byte[])(Object) out.toByteArray();
        } else data =(byte[])(Object) image.getOriginalData();
        int sizeBmpWords = (data.length - 14 + 1) >>> 1;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        writeWord(os, 1);
        writeWord(os, 9);
        writeWord(os, 0x0300);
        writeDWord(os, 9 + 4 + 5 + 5 + (13 + sizeBmpWords) + 3);
        writeWord(os, 1);
        writeDWord(os, 14 + sizeBmpWords);
        writeWord(os, 0);
        writeDWord(os, 4);
        MyHelperClass META_SETMAPMODE = new MyHelperClass();
        writeWord(os, META_SETMAPMODE);
        writeWord(os, 8);
        writeDWord(os, 5);
        MyHelperClass META_SETWINDOWORG = new MyHelperClass();
        writeWord(os, META_SETWINDOWORG);
        writeWord(os, 0);
        writeWord(os, 0);
        writeDWord(os, 5);
        MyHelperClass META_SETWINDOWEXT = new MyHelperClass();
        writeWord(os, META_SETWINDOWEXT);
        writeWord(os, (int)(int)(Object) image.height());
        writeWord(os, (int)(int)(Object) image.width());
        writeDWord(os, 13 + sizeBmpWords);
        MyHelperClass META_DIBSTRETCHBLT = new MyHelperClass();
        writeWord(os, META_DIBSTRETCHBLT);
        writeDWord(os, 0x00cc0020);
        writeWord(os, (int)(int)(Object) image.height());
        writeWord(os, (int)(int)(Object) image.width());
        writeWord(os, 0);
        writeWord(os, 0);
        writeWord(os, (int)(int)(Object) image.height());
        writeWord(os, (int)(int)(Object) image.width());
        writeWord(os, 0);
        writeWord(os, 0);
        os.write(data, 14, data.length - 14);
        if ((data.length & 1) == 1) os.write(0);
        writeDWord(os, 3);
        writeWord(os, 0);
        os.close();
        return(byte[])(Object) os.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ORIGINAL_BMP;
public MyHelperClass openStream(){ return null; }}

class Image {

public MyHelperClass getOriginalType(){ return null; }
	public MyHelperClass url(){ return null; }
	public MyHelperClass height(){ return null; }
	public MyHelperClass getOriginalData(){ return null; }
	public MyHelperClass width(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
