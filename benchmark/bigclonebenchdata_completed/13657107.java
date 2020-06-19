import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13657107 {
public MyHelperClass forBundle( BundleManipulator o0){ return null; }
public MyHelperClass forBundle(){ return null; }

    public void add(final String name, final String content)  throws Throwable {
        forBundle(new BundleManipulator() {

            public boolean includeEntry(String entryName) {
                return !name.equals(entryName);
            }

            public void finish(Bundle bundle, ZipOutputStream zout) throws IOException {
                zout.putNextEntry(new ZipEntry(name));
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(new StringReader(content), zout, "UTF-8");
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(StringReader o0, ZipOutputStream o1, String o2){ return null; }}

class BundleManipulator {

}

class Bundle {

}

class ZipOutputStream {

public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
