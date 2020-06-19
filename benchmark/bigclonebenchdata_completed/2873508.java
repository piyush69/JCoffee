import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2873508 {
public MyHelperClass dir;
	public MyHelperClass name;
	public MyHelperClass updates;
	public MyHelperClass IOUtils;
	public MyHelperClass getFullName(){ return null; }

     void PackageFileImpl(PackageDirectoryImpl dir, String name, InputStream data) throws IOException {
        this.dir =(MyHelperClass)(Object) dir;
        this.name =(MyHelperClass)(Object) name;
        this.updates = dir.getUpdates();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        IOUtils.copy(data, stream);
        updates.setNewData(getFullName(), stream.toByteArray());
        stream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setNewData(MyHelperClass o0, byte[] o1){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class PackageDirectoryImpl {

public MyHelperClass getUpdates(){ return null; }}
