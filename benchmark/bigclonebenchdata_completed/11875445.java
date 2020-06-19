
import java.io.UncheckedIOException;


class c11875445 {

    private static void loadFromZip() {
        InputStream in =(InputStream)(Object) Resources.class.getResourceAsStream("data.zip");
        if (in == null) {
            return;
        }
        ZipInputStream zipIn = new ZipInputStream(in);
        try {
            while (true) {
                ZipEntry entry =(ZipEntry)(Object) zipIn.getNextEntry();
                if (entry == null) {
                    break;
                }
                String entryName =(String)(Object) entry.getName();
                if (!entryName.startsWith("/")) {
                    entryName = "/" + entryName;
                }
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(zipIn, out);
                zipIn.closeEntry();
                MyHelperClass FILES = new MyHelperClass();
                FILES.put(entryName, out.toByteArray());
            }
            zipIn.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass copy(ZipInputStream o0, ByteArrayOutputStream o1){ return null; }}

class InputStream {

}

class Resources {

}

class ZipInputStream {

ZipInputStream(InputStream o0){}
	ZipInputStream(){}
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
