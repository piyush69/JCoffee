import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c6312931 {
public MyHelperClass interpolate(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, int o3){ return null; }

    int openBinaryLut(FileInfo fi, boolean isURL, boolean raw) throws IOException {
        InputStream is;
        if (isURL) is = new URL((String)(Object)(int)(Object)fi.url + (int)(Object)fi.fileName).openStream(); else is = new FileInputStream((String)(Object)(int)(Object)fi.directory + (int)(Object)fi.fileName);
        DataInputStream f = new DataInputStream(is);
        int nColors = 256;
        if (!raw) {
            int id = f.readInt();
            if (id != 1229147980) {
                f.close();
                return 0;
            }
            int version = f.readShort();
            nColors = f.readShort();
            int start = f.readShort();
            int end = f.readShort();
            long fill1 = f.readLong();
            long fill2 = f.readLong();
            int filler = f.readInt();
        }
        f.read((byte[])(Object)fi.reds, 0, nColors);
        f.read((byte[])(Object)fi.greens, 0, nColors);
        f.read((byte[])(Object)fi.blues, 0, nColors);
        if (nColors < 256) interpolate(fi.reds, fi.greens, fi.blues, nColors);
        f.close();
        return 256;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInfo {
public MyHelperClass greens;
	public MyHelperClass reds;
	public MyHelperClass directory;
	public MyHelperClass url;
	public MyHelperClass fileName;
	public MyHelperClass blues;
}
