import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22975613 {
public MyHelperClass _viewdata;
	public MyHelperClass _file_hash;

    public void ZipViewdataReader(ZipInputStream stream) throws IOException {
        ZipEntry ze;
        while ((ze =(ZipEntry)(Object) stream.getNextEntry()) != null) {
            File temp = File.createTempFile("spool.", ".synu");
            temp.deleteOnExit();
            FileOutputStream fos = new FileOutputStream(temp);
            byte[] buffer = new byte[1024 * 1024];
            int length;
            while ((length =(int)(Object) stream.read(buffer)) != -1) fos.write(buffer, 0, length);
            fos.close();
            String name =(String)(Object) ze.getName();
            String[] parts = name.split("[\\\\/]");
            this._file_hash.put(parts[parts.length - 1], temp);
        }
        stream.close();
        for (String key :(String[])(Object) (Object[])(Object)this._file_hash.keySet()) if (key.endsWith("Viewdata")) {
            File f =(File)(Object) this._file_hash.get(key);
            FileReader fr = new FileReader(f);
            this._viewdata =(MyHelperClass)(Object) new BufferedReader(fr);
            break;
        }
        if (this._viewdata == null) throw new FileNotFoundException("No Viewdata found in ZIP file.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass put(String o0, File o1){ return null; }
	public MyHelperClass keySet(){ return null; }}

class ZipInputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}
